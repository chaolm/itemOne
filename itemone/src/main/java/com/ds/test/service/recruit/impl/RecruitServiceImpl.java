package com.ds.test.service.recruit.impl;

import com.ds.test.commonDto.FlowItemTypeEn;
import com.ds.test.dto.*;
import com.ds.test.exception.ServiceException;
import com.ds.test.mapper.accountflow.AccountFlowMapper;
import com.ds.test.mapper.order.OrderMapper;
import com.ds.test.mapper.parameter.ParameterMapper;
import com.ds.test.mapper.recruit.RecruitMapper;
import com.ds.test.mapper.user.AccountMapper;
import com.ds.test.mapper.user.UserMapper;
import com.ds.test.service.recruit.RecruitService;
import com.ds.test.service.user.UserService;
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
public class RecruitServiceImpl implements RecruitService {

    @Autowired
    private RecruitMapper recruitMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserMapper userMapper;


    @Override
    @Transactional
    public void addRecruit(Recruit recruit) {
        String itemId = StringUtil.getUUID();
        recruit.setRecruitId(itemId);
        recruitMapper.addRecruit(recruit);
        Order order = new Order();
        order.setOrderId(StringUtil.getUUID());
        order.setUserCode(recruit.getUserCode());
        order.setItemId(itemId);
        order.setItemMainTitle("待定");
        order.setOrderType(1);
        order.setPayMoney(recruit.getNeedMoney());
        order.setHangStartTime(recruit.getHangStartTime());
        order.setHangEndTime(recruit.getHangEndTime());
        order.setPayType(1);
        order.setOrgCode(recruit.getOrgCode());
        orderMapper.addOrder(order);
        User user = new User();
        user.setUserCode(recruit.getUserCode());
        //更新用户为发布者
        user.setUserType(1);
        userMapper.updateUser(user);
    }

    @Override
    public List<Recruit> getRecruitByParam(Map param) {
        return recruitMapper.getRecruitByParam(param);
    }

    @Override
    @Transactional
    public void updateRecruit(Recruit recruit) {
        if(StringUtil.isBlank(recruit.getRecruitId())){
            throw new ServiceException("招聘id不允许为空！");
        }
        //修改悬挂时间 要与订单去结合操作 代做
        recruitMapper.updateRecruit(recruit);
    }
}
