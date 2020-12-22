package com.ds.test.dto;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * TCustomer entity. @author MyEclipse Persistence Tools
 */

public class TCustomer implements Serializable {

	private Long id;

	private String name;//姓名

	private String phoneNo;//手机号码

	private String address;//地址

	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;//创建时间

	private Integer regType;//性别

	private Integer sex;//性别

	private Date birthday;//生日

	private Long level; // 客户等级

	private String wechat;//微信号

	private String wechatNickName;

	private String alipay;//支付宝号

	private String alipayNickName;

	private String qq;

	private String qqNickName;

	private String email;

	private String openId;

	private Long salesmanId;

	private Long orgId;

	private Date lastContact;//最近一次联系或操作（微信）

	private Integer curPoint;

	private Integer allPoint;

	private String remark;

	private String headimgUrl;

	private String nickName;

	private String country;

	private String province;

	private String city;

	private String wxRemark;

	private Integer wxStatus;

	private String appid;

	private String groupid;

	private String unionid;

	private String language;

	private Integer buyNumber;

	private Integer buyMoney;

	private Date lastBuytime;

	private String userType;

	private String pwdType;

	private String height;

	private String company;

	private String password;

	private String custNumber;

	private Date modifyTime;

	private Date infoSynTime;

	private String clientId;

	//等级积分

	private Integer pointValue;

	private Long levelId;

	private Integer growthValue;

	public String getAlipay() {
		return alipay;
	}

	public void setAlipay(String alipay) {
		this.alipay = alipay;
	}

	public String getAlipayNickName() {
		return alipayNickName;
	}

	public void setAlipayNickName(String alipayNickName) {
		this.alipayNickName = alipayNickName;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getRegType() {
		return regType;
	}
	public void setRegType(Integer regType) {
		this.regType = regType;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Long getLevel() {
		return level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public Long getSalesmanId() {
		return salesmanId;
	}
	public void setSalesmanId(Long salesmanId) {
		this.salesmanId = salesmanId;
	}
	public Long getOrgId() {
		return orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	public Date getLastContact() {
		return lastContact;
	}
	public void setLastContact(Date lastContact) {
		this.lastContact = lastContact;
	}
	public Integer getCurPoint() {
		return curPoint;
	}
	public void setCurPoint(Integer curPoint) {
		this.curPoint = curPoint;
	}
	public Integer getAllPoint() {
		return allPoint;
	}
	public void setAllPoint(Integer allPoint) {
		this.allPoint = allPoint;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getHeadimgUrl() {
		return headimgUrl;
	}
	public void setHeadimgUrl(String headimgUrl) {
		this.headimgUrl = headimgUrl;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getWxRemark() {
		return wxRemark;
	}
	public void setWxRemark(String wxRemark) {
		this.wxRemark = wxRemark;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getUnionid() {
		return unionid;
	}
	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Integer getBuyNumber() {
		if (buyNumber == null)
			buyNumber = 0;
		return buyNumber;
	}
	public void setBuyNumber(Integer buyNumber) {
		this.buyNumber = buyNumber;
	}
	public Integer getBuyMoney() {
		if (buyMoney == null)
			buyMoney = 0;
		return buyMoney;
	}
	public void setBuyMoney(Integer buyMoney) {
		this.buyMoney = buyMoney;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getPwdType() {
		return pwdType;
	}
	public void setPwdType(String pwdType) {
		this.pwdType = pwdType;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustNumber() {
		return custNumber;
	}
	public void setCustNumber(String custNumber) {
		this.custNumber = custNumber;
	}
	public Date getLastBuytime() {
		return lastBuytime;
	}
	public void setLastBuytime(Date lastBuytime) {
		this.lastBuytime = lastBuytime;
	}
	public Integer getWxStatus() {
		if (wxStatus == null)
			wxStatus = 0;
		return wxStatus;
	}
	public void setWxStatus(Integer wxStatus) {
		this.wxStatus = wxStatus;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Date getInfoSynTime() {
		return infoSynTime;
	}
	public void setInfoSynTime(Date infoSynTime) {
		this.infoSynTime = infoSynTime;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public Integer getPointValue() {
		return pointValue;
	}

	public void setPointValue(Integer pointValue) {
		this.pointValue = pointValue;
	}

	public Long getLevelId() {
		return levelId;
	}

	public void setLevelId(Long levelId) {
		this.levelId = levelId;
	}

	public Integer getGrowthValue() {
		return growthValue;
	}

	public void setGrowthValue(Integer growthValue) {
		this.growthValue = growthValue;
	}

	public String getWechatNickName() {
		return wechatNickName;
	}

	public void setWechatNickName(String wechatNickName) {
		this.wechatNickName = wechatNickName;
	}

	public String getQqNickName() {
		return qqNickName;
	}

	public void setQqNickName(String qqNickName) {
		this.qqNickName = qqNickName;
	}
}