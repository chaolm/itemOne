package com.ds.test.service.user.impl;

import com.ds.test.commonDto.FlowItemTypeEn;
import com.ds.test.commonDto.NumberEn;
import com.ds.test.dto.Account;
import com.ds.test.dto.AccountFlow;
import com.ds.test.dto.Parameter;
import com.ds.test.dto.User;
import com.ds.test.exception.ServiceException;
import com.ds.test.mapper.accountflow.AccountFlowMapper;
import com.ds.test.mapper.parameter.ParameterMapper;
import com.ds.test.mapper.user.AccountMapper;
import com.ds.test.mapper.user.UserMapper;
import com.ds.test.service.user.UserService;
import com.ds.test.until.BeanUtils;
import com.ds.test.until.DateUtil;
import com.ds.test.until.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author clm
 * @date 2020/11/23
 * hh
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private AccountFlowMapper accountFlowMapper;

    @Autowired
    private ParameterMapper parameterMapper;

    @Override
    public List<User> getUser() {
        return userMapper.getUser();
    }

    @Override
    @Transactional
    public String addUser(User user) {
        //注册
        if(StringUtil.isBlank(user.getPhone())){
            throw new ServiceException("请填写手机号！");
        }
        if(StringUtil.isBlank(user.getOrgCode())){
            throw new ServiceException("请选择城市！");
        }
        Map param = new HashMap();
        param.put("phone",user.getPhone());
        User userDto = userMapper.getUserByParam(param);
        if(null != userDto){
            throw new ServiceException("该用户已存在,请直接登陆！");
        }

        String userCode = DateUtil.accountCode();
        String md5Password = StringUtil.toMD5(user.getPassword());
        user.setPassword(md5Password);
        user.setUserCode(userCode);

        userMapper.addUser(user);
        Map map = new HashMap();
        map.put("paramName","initMoney");
        map.put("orgCode",user.getOrgCode());
        Parameter parameter = parameterMapper.getParameterByParam(map);
        BigDecimal initMoney = new BigDecimal(0);
        if(null != parameter && null != parameter.getParamValue()){
            initMoney = new BigDecimal(parameter.getParamValue());
        }
        //todo 注册用户后直接分配一个账户
        Account account = new Account();
        account.setUserCode(userCode);
        String accountId = StringUtil.getUUID();
        account.setAccountId(accountId);
        account.setAvailableMoney(initMoney);
        account.setTotalPayMoney(initMoney);
        account.setOrgCode(user.getOrgCode());
        accountMapper.addAccount(account);

        //todo 对应流水
        AccountFlow accountFlow = new AccountFlow();
        accountFlow.setAccountFlowId(StringUtil.getUUID());
        accountFlow.setAccountId(accountId);
        accountFlow.setFlowItemId("0");
        accountFlow.setFlowItemType(FlowItemTypeEn.CREATE_ACCOUNT.getValue());
        accountFlow.setOrgCode(user.getOrgCode());
        accountFlow.setFlowMoney(initMoney);
        accountFlowMapper.addAccountFlow(accountFlow);

        //todo  为推荐码用户初始化奖励
        if(!StringUtil.isBlank(user.getRecommendCode())){
            Account reAccount = new Account();
            reAccount.setUserCode(user.getRecommendCode());
            Account accountByParam = accountMapper.getAccountByParam(reAccount);
            if(null == accountByParam){
                throw new ServiceException("推荐码用户不存在或者已作废!请填写正确推荐码！");
            }

            Map reMap = new HashMap();
            reMap.put("paramName","rewardMoney");
            reMap.put("orgCode",user.getOrgCode());
            Parameter reParameter = parameterMapper.getParameterByParam(reMap);
            BigDecimal rewardMoney = new BigDecimal(0);
            if(!StringUtil.isBlank(reParameter.getParamValue())){
                rewardMoney = new BigDecimal(reParameter.getParamValue());
            }
            reAccount.setAvailableMoney(accountByParam.getAvailableMoney().add(rewardMoney));
            accountMapper.updateAccount(reAccount);
            //对应流水
            AccountFlow reAccountFlow = new AccountFlow();
            reAccountFlow.setAccountFlowId(StringUtil.getUUID());
            reAccountFlow.setFlowItemId("4");
            reAccountFlow.setFlowItemType(FlowItemTypeEn.RECOMMEND.getValue());
            reAccountFlow.setOrgCode(user.getOrgCode());
            reAccountFlow.setAccountId(accountByParam.getAccountId());
            reAccountFlow.setFlowMoney(rewardMoney);
            accountFlowMapper.addAccountFlow(reAccountFlow);
        }
        return userCode;
    }

    @Override
    public String loginByPassword(User user) {
        if( StringUtil.isBlank(user.getPhone())&& StringUtil.isBlank(user.getUserCode())){
            throw new ServiceException("账号未录入！");
        }
        if(StringUtil.isBlank(user.getPassword())){
            throw new ServiceException("密码未录入！");
        }
        Map param = new HashMap();
        param.put("userCode",user.getUserCode());
        param.put("phone",user.getPhone());
        User userDto = userMapper.getUserByParam(param);
        if(null != userDto){
            if(!StringUtil.toMD5(user.getPassword()).equals(userDto.getPassword())){
                throw new ServiceException("密码不正确，请重新输入！");
            }
        }else{
            throw new ServiceException("用户不存在，请先注册用户！");
        }
        return "1";
    }

    @Override
    @Transactional
    public String updateUserInfoByUserCode(User user) {
        if(StringUtil.isBlank(user.getUserCode())){
            throw new ServiceException("用户编码不允许为空！");
        }
        userMapper.updateUser(user);
        return "1";
    }

    @Override
    @Transactional
    public String updateUserPassword(User user) {
        if(StringUtil.isBlank(user.getUserCode())){
            throw new ServiceException("用户编码不允许为空！");
        }
        if(StringUtil.isBlank(user.getOldPassword())){
            throw new ServiceException("旧密码不允许为空！");
        }
        if(StringUtil.isBlank(user.getNewPassword())){
            throw new ServiceException("旧密码不允许为空！");
        }
        Map param = new HashMap();
        param.put("userCode",user.getUserCode());
        User userDto = userMapper.getUserByParam(param);
        if(null != userDto && null != user.getPassword()){
            if(!user.getPassword().equals(StringUtil.toMD5(user.getOldPassword()))){
                throw new ServiceException("旧密码输入错误，请重新输入！");
            }
        }else {
            throw new ServiceException("用户编码不存在！");

        }
        user.setPassword(StringUtil.toMD5(user.getNewPassword()));
        userMapper.updateUserPassword(user);
        return "1";
    }

}
