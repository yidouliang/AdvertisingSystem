package com.boot.security.server.model;



public class AdPlayRole extends BaseEntity<Long> {

	private Integer adtype;
	private String adplaytimeid;
	private Integer intervaltime;

	public Integer getAdtype() {
		return adtype;
	}
	public Integer setAdtype() {
		return adtype;
	}
	public String getAdplaytimeid() {
		return adplaytimeid;
	}
	public String setAdplaytimeid() {
		return adplaytimeid;
	}
	public Integer getIntervaltime() {
		return intervaltime;
	}
	public Integer setIntervaltime() {
		return intervaltime;
	}

}
