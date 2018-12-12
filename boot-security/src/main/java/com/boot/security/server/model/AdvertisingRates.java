package com.boot.security.server.model;

import java.math.BigDecimal;


public class AdvertisingRates extends BaseEntity<Long> {

	private Integer type;
	private String areaid;
	private BigDecimal secprice;
	private BigDecimal monprice;

	public Integer getType() {
		return type;
	}
	public Integer setType() {
		return type;
	}
	public String getAreaid() {
		return areaid;
	}
	public String setAreaid() {
		return areaid;
	}
	public BigDecimal getSecprice() {
		return secprice;
	}
	public BigDecimal setSecprice() {
		return secprice;
	}
	public BigDecimal getMonprice() {
		return monprice;
	}
	public BigDecimal setMonprice() {
		return monprice;
	}

}
