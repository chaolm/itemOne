package com.ds.test.service.accountflow.impl;

import com.ds.test.dto.AccountFlow;
import com.ds.test.mapper.accountflow.AccountFlowMapper;
import com.ds.test.service.accountflow.AccountFlowService;
import com.ds.test.until.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author clm
 * @date 2020/12/12
 * hh
 **/
@Service
public class AccountFlowServiceImpl implements AccountFlowService {
    @Autowired
    private AccountFlowMapper accountFlowMapper;

    /**
     * 获取账户流水表
     * @param
     * @return
     */
    @Override
    public List<AccountFlow> getAccountFlowList() {
        return accountFlowMapper.getAccountFlowList();
    }

    /**
     * 新增账户流水表
     * @param accountFlow
     * @return
     */
    @Override
    public void addAccountFlow(AccountFlow accountFlow) {
        //业务层设置主键值
        accountFlow.setAccountFlowId(StringUtil.getUUID());
        accountFlowMapper.addAccountFlow(accountFlow);
    }

    /**
     * 更新账户流水表
     * @param accountFlow
     * @return
     */
    @Override
    public void updateAccountFlow(AccountFlow accountFlow) {
        accountFlowMapper.updateAccountFlow(accountFlow);
    }
}
