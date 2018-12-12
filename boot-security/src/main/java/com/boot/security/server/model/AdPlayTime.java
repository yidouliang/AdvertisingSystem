package com.boot.security.server.model;

import java.util.Date;

public class AdPlayTime extends BaseEntity<Long> {

	private Date begintime;
	private Date endtime;

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

}
