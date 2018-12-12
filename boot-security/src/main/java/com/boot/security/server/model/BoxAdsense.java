package com.boot.security.server.model;



public class BoxAdsense extends BaseEntity<Long> {

	private String boxcode;
	private Integer adsensetype;
	private Integer adsensestatus;

	public String getBoxcode() {
		return boxcode;
	}
	public String setBoxcode() {
		return boxcode;
	}
	public Integer getAdsensetype() {
		return adsensetype;
	}
	public Integer setAdsensetype() {
		return adsensetype;
	}
	public Integer getAdsensestatus() {
		return adsensestatus;
	}
	public Integer setAdsensestatus() {
		return adsensestatus;
	}

}
