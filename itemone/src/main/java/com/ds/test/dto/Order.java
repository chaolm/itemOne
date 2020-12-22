package com.ds.test.dto;

import com.ds.test.commonDto.BaseDto;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author clm
 * @date 2020/12/12
 * hh
 **/
public class Order extends BaseDto {
    /**
     * 订单id
     */
    private String orderId;

    /**
     * 用户编码
     */
    private String userCode;

    /**
     * 各个项目关联订单id   一对多
     */
    private String itemId;

    /**
     * 关联各项目主图片信息
     */
    private String itemMainTitle;

    /**
     * 订单类型 1：招聘 2：广告
     */
    private Integer orderType;

    /**
     * 支付金额
     */
    private BigDecimal payMoney;

    /**
     * 悬挂开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date hangStartTime;

    /**
     * 悬挂结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date hangEndTime;

    /**
     * 支付渠道 1：微信 2 支付宝 3：其他
     */
    private Integer payChannel;

    /**
     * 支付状态 1 未支付  2 已支付 3 取消支付
     */
    private Integer payType;

    /**
     * 支付时间
     */
    private Date payTime;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemMainTitle() {
        return itemMainTitle;
    }

    public void setItemMainTitle(String itemMainTitle) {
        this.itemMainTitle = itemMainTitle;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public Date getHangStartTime() {
        return hangStartTime;
    }

    public void setHangStartTime(Date hangStartTime) {
        this.hangStartTime = hangStartTime;
    }

    public Date getHangEndTime() {
        return hangEndTime;
    }

    public void setHangEndTime(Date hangEndTime) {
        this.hangEndTime = hangEndTime;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }
}
