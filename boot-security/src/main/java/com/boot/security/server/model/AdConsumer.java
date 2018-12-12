package com.boot.security.server.model;

import java.util.Date;

public class AdConsumer extends BaseEntity<Long> {

	private String adconsumername;
	private String telphone;
	private String companyid;
	private String companyname;
	private Integer type;
	private Integer starcode;
	private Integer state;
	private Date createtime;
	private Date updatetime;

	public String getAdconsumername() {
		return adconsumername;
	}
	public String setAdconsumername() {
		return adconsumername;
	}
	public String getTelphone() {
		return telphone;
	}
	public String setTelphone() {
		return telphone;
	}
	public String getCompanyid() {
		return companyid;
	}
	public String setCompanyid() {
		return companyid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public String setCompanyname() {
		return companyname;
	}
	public Integer getType() {
		return type;
	}
	public Integer setType() {
		return type;
	}
	public Integer getStarcode() {
		return starcode;
	}
	public Integer setStarcode() {
		return starcode;
	}
	public Integer getState() {
		return state;
	}
	public Integer setState() {
		return state;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public Date setCreatetime() {
		return createtime;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public Date setUpdatetime() {
		return updatetime;
	}

}
