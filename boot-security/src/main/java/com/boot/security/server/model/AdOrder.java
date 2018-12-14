package com.boot.security.server.model;

import java.math.BigDecimal;
import java.util.Date;

public class AdOrder extends BaseEntity<Long> {

	private String orderserialnumber;
	private String operatorid;
	private String operatorname;
	private String adconsumerid;
	private String adconsumername;
	private String companyid;
	private String companyname;
	private BigDecimal payment;
	private Integer paytype;
	private Date paytime;
	private Integer paystatus;
	private String payurl;
	private String failreason;
	private String payserialnumber;
	private Date createtime;
	private Date updatetime;
	private Integer datastate;


	public String getOrderserialnumber() {
		return orderserialnumber;
	}

	public void setOrderserialnumber(String orderserialnumber) {
		this.orderserialnumber = orderserialnumber;
	}

	public String getOperatorid() {
		return operatorid;
	}

	public void setOperatorid(String operatorid) {
		this.operatorid = operatorid;
	}

	public String getOperatorname() {
		return operatorname;
	}

	public void setOperatorname(String operatorname) {
		this.operatorname = operatorname;
	}

	public String getAdconsumerid() {
		return adconsumerid;
	}

	public void setAdconsumerid(String adconsumerid) {
		this.adconsumerid = adconsumerid;
	}

	public String getAdconsumername() {
		return adconsumername;
	}

	public void setAdconsumername(String adconsumername) {
		this.adconsumername = adconsumername;
	}

	public String getCompanyid() {
		return companyid;
	}

	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public BigDecimal getPayment() {
		return payment;
	}

	public void setPayment(BigDecimal payment) {
		this.payment = payment;
	}

	public Integer getPaytype() {
		return paytype;
	}

	public void setPaytype(Integer paytype) {
		this.paytype = paytype;
	}

	public Date getPaytime() {
		return paytime;
	}

	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}

	public Integer getPaystatus() {
		return paystatus;
	}

	public void setPaystatus(Integer paystatus) {
		this.paystatus = paystatus;
	}

	public String getPayurl() {
		return payurl;
	}

	public void setPayurl(String payurl) {
		this.payurl = payurl;
	}

	public String getFailreason() {
		return failreason;
	}

	public void setFailreason(String failreason) {
		this.failreason = failreason;
	}

	public String getPayserialnumber() {
		return payserialnumber;
	}

	public void setPayserialnumber(String payserialnumber) {
		this.payserialnumber = payserialnumber;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public Integer getDatastate() {
		return datastate;
	}

	public void setDatastate(Integer datastate) {
		this.datastate = datastate;
	}
}
