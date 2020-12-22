package com.ds.test.dto;

import com.ds.test.commonDto.BaseDto;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 广告、活动表
 * @author Tiger
 * @date 2020/12/12
 */
public class Advertisement extends BaseDto {

    /**
     * 广告活动id
     */
    private String advertisementId;

    /**
     * 用户编码
     */
    private String userCode;

    /**
     * 主标题
     */
    private String mainTitle;

    /**
     * 副标题
     */
    private String firstTitle;

    /**
     * 其他标题
     */
    private String otherTitle;

    /**
     * 活动标签 用逗号分隔
     */
    private String label;

    /**
     * 浏览人次
     */
    private Integer seeNum;

    /**
     * 活动类别 1:轻子 2：交友 3：体育 4：教育 5：生活 6：休闲娱乐 7：文艺 8：其他
     */
    private Integer activeType;

    /**
     * 是否置顶 0 : 否 1:是
     */
    private Integer topStatus;

    /**
     * 限制数量
     */
    private Integer limitNum;

    /**
     * 发布联系人
     */
    private String contactPerson;

    /**
     * 发布联系人电话
     */
    private String contactPhone;

    /**
     * 悬挂时长
     */
    private Integer hangTimeLength;

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
     * 活动店铺名称
     */
    private String activeShopName;

    /**
     * 活动进行地址
     */
    private String activeAdress;

    /**
     * 发布详情
     */
    private String message;

    /**
     * 上传图片地址
     */
    private String pictureUrl;

    /**
     * 状态
     */
    private String activeStatus;

    /**
     * 活动开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date activeStartTime;

    /**
     * 活动结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date activeEndTime;

    /**
     * 是否失效  0 ：否 1 ：是  根据结束时间与当前时间判断
     */
    private String invalid;

    /**
     * 组织编码
     */
    private String orgCode;

    private String firstPictureUrl;

    private String album;

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getFirstPictureUrl() {
        return firstPictureUrl;
    }

    public void setFirstPictureUrl(String firstPictureUrl) {
        this.firstPictureUrl = firstPictureUrl;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    private BigDecimal needMoney;

    public Date getHangStartTime() {
        return hangStartTime;
    }

    public void setHangStartTime(Date hangStartTime) {
        this.hangStartTime = hangStartTime;
    }

    public BigDecimal getNeedMoney() {
        return needMoney;
    }

    public void setNeedMoney(BigDecimal needMoney) {
        this.needMoney = needMoney;
    }

    public String getAdvertisementId() {
        return advertisementId;
    }

    public void setAdvertisementId(String advertisementId) {
        this.advertisementId = advertisementId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getFirstTitle() {
        return firstTitle;
    }

    public void setFirstTitle(String firstTitle) {
        this.firstTitle = firstTitle;
    }

    public String getOtherTitle() {
        return otherTitle;
    }

    public void setOtherTitle(String otherTitle) {
        this.otherTitle = otherTitle;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getSeeNum() {
        return seeNum;
    }

    public void setSeeNum(Integer seeNum) {
        this.seeNum = seeNum;
    }

    public Integer getActiveType() {
        return activeType;
    }

    public void setActiveType(Integer activeType) {
        this.activeType = activeType;
    }

    public Integer getTopStatus() {
        return topStatus;
    }

    public void setTopStatus(Integer topStatus) {
        this.topStatus = topStatus;
    }

    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Integer getHangTimeLength() {
        return hangTimeLength;
    }

    public void setHangTimeLength(Integer hangTimeLength) {
        this.hangTimeLength = hangTimeLength;
    }

    public Date getHangEndTime() {
        return hangEndTime;
    }

    public void setHangEndTime(Date hangEndTime) {
        this.hangEndTime = hangEndTime;
    }

    public String getActiveShopName() {
        return activeShopName;
    }

    public void setActiveShopName(String activeShopName) {
        this.activeShopName = activeShopName;
    }

    public String getActiveAdress() {
        return activeAdress;
    }

    public void setActiveAdress(String activeAdress) {
        this.activeAdress = activeAdress;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Date getActiveStartTime() {
        return activeStartTime;
    }

    public void setActiveStartTime(Date activeStartTime) {
        this.activeStartTime = activeStartTime;
    }

    public Date getActiveEndTime() {
        return activeEndTime;
    }

    public void setActiveEndTime(Date activeEndTime) {
        this.activeEndTime = activeEndTime;
    }

    public String getInvalid() {
        return invalid;
    }

    public void setInvalid(String invalid) {
        this.invalid = invalid;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }
 }
