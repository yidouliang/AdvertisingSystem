package com.boot.security.server.model;

import java.util.Date;

public class BoxAd extends BaseEntity<Long> {

	private String boxcode;
	private String adid;
	private Integer adsensetype;
	private Date begintime;
	private Date endtime;
	private String adplayroleid;
	private Integer satatus;

	public String getBoxcode() {
		return boxcode;
	}
	public String setBoxcode() {
		return boxcode;
	}
	public String getAdid() {
		return adid;
	}
	public String setAdid() {
		return adid;
	}
	public Integer getAdsensetype() {
		return adsensetype;
	}
	public Integer setAdsensetype() {
		return adsensetype;
	}
	public Date getBegintime() {
		return begintime;
	}
	public Date setBegintime() {
		return begintime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public Date setEndtime() {
		return endtime;
	}
	public String getAdplayroleid() {
		return adplayroleid;
	}
	public String setAdplayroleid() {
		return adplayroleid;
	}
	public Integer getSatatus() {
		return satatus;
	}
	public Integer setSatatus() {
		return satatus;
	}

}
