package com.ds.test.dto;

import com.ds.test.commonDto.BaseDto;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author clm
 * @date 2020/12/11
 * hh
 **/
public class Recruit extends BaseDto {
    /**
     * 招聘id
     */
    private String recruitId;
    /**
     * 用户编码
     */
    private String userCode;
    /**
     * 发布主标题
     */
    private String mainTitle;
    /**
     * 发布副标题
     */
    private String firstTitle;
    /**
     * 其他标题
     */
    private String otherTitle;
    /**
     * 浏览人次
     */
    private Integer seeNum;
    /**
     * 职位名称
     */
    private String positionName;
    /**
     * 职位类别
     */
    private Integer positionCategory;
    /**
     * 悬挂时长
     */
    private Integer hangTimeLength;
    /**
     * 悬挂截至时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date hangEndTime;
    /**
     * 薪资待遇
     */
    private String salary;
    /**
     * 招聘人数
     */
    private String recruitNumber;
    /**
     * 工作公司名称
     */
    private String workCompanyName;
    /**
     * 工作地址
     */
    private String workAdress;
    /**
     * 职位福利 用逗号隔开
     */
    private String welfareLabel;
    /**
     * 职位详情
     */
    private String message;
    /**
     * 发布内容联系人
     */
    private String contactPerson;
    /**
     * 发布内容联系人电话
     */
    private String contactPhone;
    /**
     * 招聘开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date startTime;
    /**
     * 招聘结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date endTime;
    /**
     * 性别要求
     */
    private String sexRequire;
    /**
     * 年龄要求
     */
    private String ageRequire;
    /**
     * 学历要求
     */
    private String educationRequire;
    /**
     * 上传图片地址
     */
    private String pictureUrl;
    /**
     * 是否置顶 0 ：否 1：是
     */
    private Integer topStatus;
    /**
     * 是否过期 0 ：否 1： 是 根据结束时间与当前时间判断
     */
    private Integer invalid;

    private String orgCode;

    private BigDecimal needMoney;

    /**
     * 悬挂开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date hangStartTime;

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

    @Override
    public String getOrgCode() {
        return orgCode;
    }

    @Override
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getRecruitId() {
        return recruitId;
    }

    public void setRecruitId(String recruitId) {
        this.recruitId = recruitId;
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

    public Integer getSeeNum() {
        return seeNum;
    }

    public void setSeeNum(Integer seeNum) {
        this.seeNum = seeNum;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Integer getPositionCategory() {
        return positionCategory;
    }

    public void setPositionCategory(Integer positionCategory) {
        this.positionCategory = positionCategory;
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getRecruitNumber() {
        return recruitNumber;
    }

    public void setRecruitNumber(String recruitNumber) {
        this.recruitNumber = recruitNumber;
    }

    public String getWorkCompanyName() {
        return workCompanyName;
    }

    public void setWorkCompanyName(String workCompanyName) {
        this.workCompanyName = workCompanyName;
    }

    public String getWorkAdress() {
        return workAdress;
    }

    public void setWorkAdress(String workAdress) {
        this.workAdress = workAdress;
    }

    public String getWelfareLabel() {
        return welfareLabel;
    }

    public void setWelfareLabel(String welfareLabel) {
        this.welfareLabel = welfareLabel;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getSexRequire() {
        return sexRequire;
    }

    public void setSexRequire(String sexRequire) {
        this.sexRequire = sexRequire;
    }

    public String getAgeRequire() {
        return ageRequire;
    }

    public void setAgeRequire(String ageRequire) {
        this.ageRequire = ageRequire;
    }

    public String getEducationRequire() {
        return educationRequire;
    }

    public void setEducationRequire(String educationRequire) {
        this.educationRequire = educationRequire;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Integer getTopStatus() {
        return topStatus;
    }

    public void setTopStatus(Integer topStatus) {
        this.topStatus = topStatus;
    }

    public Integer getInvalid() {
        return invalid;
    }

    public void setInvalid(Integer invalid) {
        this.invalid = invalid;
    }


}
