package com.ds.test.dto;

import com.ds.test.commonDto.BaseDto;

import java.math.BigDecimal;

/**
 * @author clm
 * @date 2020/12/10
 * hh
 **/
public class Account extends BaseDto {

    private String accountId;
    private String userCode;
    private Integer accountType;
    private BigDecimal availableMoney;
    private BigDecimal totalPayMoney;

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", userCode='" + userCode + '\'' +
                ", accountType='" + accountType + '\'' +
                ", availableMoney='" + availableMoney + '\'' +
                ", totalPayMoney='" + totalPayMoney + '\'' +
                '}';
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public BigDecimal getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(BigDecimal availableMoney) {
        this.availableMoney = availableMoney;
    }

    public BigDecimal getTotalPayMoney() {
        return totalPayMoney;
    }

    public void setTotalPayMoney(BigDecimal totalPayMoney) {
        this.totalPayMoney = totalPayMoney;
    }
}
