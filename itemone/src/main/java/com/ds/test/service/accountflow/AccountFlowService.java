package com.ds.test.service.accountflow;

import com.ds.test.dto.AccountFlow;

import java.util.List;

/**
 * @author clm
 * @date 2020/12/12
 * hh
 **/
public interface AccountFlowService {
    /**
     * 获取账户流水表
     * @param
     * @return
     */
    List<AccountFlow> getAccountFlowList();

    /**
     * 新增账户流水表
     * @param accountFlow
     * @return
     */
    void addAccountFlow(AccountFlow accountFlow);

    /**
     * 更新账户流水表
     * @param accountFlow
     * @return
     */
    void updateAccountFlow(AccountFlow accountFlow);


}
