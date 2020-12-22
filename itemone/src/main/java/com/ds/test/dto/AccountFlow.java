package com.ds.test.dto;

import com.ds.test.commonDto.BaseDto;

import java.math.BigDecimal;

/**
 * @author clm
 * @date 2020/12/12
 * hh
 **/
public class AccountFlow extends BaseDto {


    /**
     * 账户流水id
     */
    private String accountFlowId;

    /**
     * 账户id
     */
    private String accountId;

    /**
     * 流水金额
     */
    private BigDecimal flowMoney;

    /**
     * 流水对应的消费记录id
     */
    private String flowItemId;

    /**
     *  流水类型 1：招聘 2 ：广告 3：置顶
     */
    private Integer flowItemType;

    /**
     *组织编码
     */
    private String orgCode;

    public String getAccountFlowId() {
        return accountFlowId;
    }

    public void setAccountFlowId(String accountFlowId) {
        this.accountFlowId = accountFlowId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getFlowMoney() {
        return flowMoney;
    }

    public void setFlowMoney(BigDecimal flowMoney) {
        this.flowMoney = flowMoney;
    }

    public String getFlowItemId() {
        return flowItemId;
    }

    public void setFlowItemId(String flowItemId) {
        this.flowItemId = flowItemId;
    }

    public Integer getFlowItemType() {
        return flowItemType;
    }

    public void setFlowItemType(Integer flowItemType) {
        this.flowItemType = flowItemType;
    }

    @Override
    public String getOrgCode() {
        return orgCode;
    }

    @Override
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }
}
