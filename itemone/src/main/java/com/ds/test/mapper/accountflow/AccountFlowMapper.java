package com.ds.test.mapper.accountflow;

import com.ds.test.dto.AccountFlow;
import com.ds.test.dto.Advertisement;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author clm
 * @date 2020/11/23
 * hh
 **/
@Mapper
public interface AccountFlowMapper {
    /**
     * 获取账户流水表
     * @return
     */
    List<AccountFlow> getAccountFlowList();

    /**
     * 新增账户流水表
     * @param accountFlow
     * @return
     */
    int addAccountFlow(AccountFlow accountFlow);

    /**
     * 更新账户流水表
     * @param accountFlow
     * @return
     */
    int updateAccountFlow(AccountFlow accountFlow);


}
