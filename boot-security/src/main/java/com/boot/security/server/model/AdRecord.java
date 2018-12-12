package com.boot.security.server.model;

import java.util.Date;

public class AdRecord extends BaseEntity<Long> {

	private String boxcode;
	private String adid;
	private Integer adsensetype;
	private Date playdate;
	private String adcount;
	private Integer adplayroleid;

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
	public Date getPlaydate() {
		return playdate;
	}
	public Date setPlaydate() {
		return playdate;
	}
	public String getAdcount() {
		return adcount;
	}
	public String setAdcount() {
		return adcount;
	}
	public Integer getAdplayroleid() {
		return adplayroleid;
	}
	public Integer setAdplayroleid() {
		return adplayroleid;
	}

}
