package com.boot.security.server.model;

import java.math.BigDecimal;
import java.util.Date;

public class AdMktBox extends BaseEntity<Long> {

	private String boxname;
	private String boxcode;
	private Integer boxtype;
	private String boxperson;
	private String address;
	private Integer status;
	private Date factorydate;
	private String persontelphone;
	private BigDecimal longitude;
	private BigDecimal latitude;
	private String areaid;
	private String areaname;

	public String getBoxname() {
		return boxname;
	}
	public String setBoxname() {
		return boxname;
	}
	public String getBoxcode() {
		return boxcode;
	}
	public String setBoxcode() {
		return boxcode;
	}
	public Integer getBoxtype() {
		return boxtype;
	}
	public Integer setBoxtype() {
		return boxtype;
	}
	public String getBoxperson() {
		return boxperson;
	}
	public String setBoxperson() {
		return boxperson;
	}
	public String getAddress() {
		return address;
	}
	public String setAddress() {
		return address;
	}
	public Integer getStatus() {
		return status;
	}
	public Integer setStatus() {
		return status;
	}
	public Date getFactorydate() {
		return factorydate;
	}
	public Date setFactorydate() {
		return factorydate;
	}
	public String getPersontelphone() {
		return persontelphone;
	}
	public String setPersontelphone() {
		return persontelphone;
	}
	public BigDecimal getLongitude() {
		return longitude;
	}
	public BigDecimal setLongitude() {
		return longitude;
	}
	public BigDecimal getLatitude() {
		return latitude;
	}
	public BigDecimal setLatitude() {
		return latitude;
	}
	public String getAreaid() {
		return areaid;
	}
	public String setAreaid() {
		return areaid;
	}
	public String getAreaname() {
		return areaname;
	}
	public String setAreaname() {
		return areaname;
	}

}
