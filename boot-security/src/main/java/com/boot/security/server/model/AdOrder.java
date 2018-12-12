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
	public String setOrderserialnumber() {
		return orderserialnumber;
	}
	public String getOperatorid() {
		return operatorid;
	}
	public String setOperatorid() {
		return operatorid;
	}
	public String getOperatorname() {
		return operatorname;
	}
	public String setOperatorname() {
		return operatorname;
	}
	public String getAdconsumerid() {
		return adconsumerid;
	}
	public String setAdconsumerid() {
		return adconsumerid;
	}
	public String getAdconsumername() {
		return adconsumername;
	}
	public String setAdconsumername() {
		return adconsumername;
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
	public BigDecimal getPayment() {
		return payment;
	}
	public BigDecimal setPayment() {
		return payment;
	}
	public Integer getPaytype() {
		return paytype;
	}
	public Integer setPaytype() {
		return paytype;
	}
	public Date getPaytime() {
		return paytime;
	}
	public Date setPaytime() {
		return paytime;
	}
	public Integer getPaystatus() {
		return paystatus;
	}
	public Integer setPaystatus() {
		return paystatus;
	}
	public String getPayurl() {
		return payurl;
	}
	public String setPayurl() {
		return payurl;
	}
	public String getFailreason() {
		return failreason;
	}
	public String setFailreason() {
		return failreason;
	}
	public String getPayserialnumber() {
		return payserialnumber;
	}
	public String setPayserialnumber() {
		return payserialnumber;
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
	public Integer getDatastate() {
		return datastate;
	}
	public Integer setDatastate() {
		return datastate;
	}

}
