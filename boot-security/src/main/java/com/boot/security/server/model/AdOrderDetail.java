package com.boot.security.server.model;

import java.math.BigDecimal;
import java.util.Date;

public class AdOrderDetail extends BaseEntity<Long> {

	private String adid;
	private String adname;
	private String adplayroleid;
	private String advertisingratesid;
	private String adorderid;
	private Date begintime;
	private Date endtime;
	private BigDecimal payment;
	private Date createtime;
	private Date updatetime;
	private Integer datastate;
	private String areaname;
	private String boxcode;
	private String boxname;
	private String advertisingpositionid;
	private String areaid;

	public String getAdid() {
		return adid;
	}

	public void setAdid(String adid) {
		this.adid = adid;
	}

	public String getAdname() {
		return adname;
	}

	public void setAdname(String adname) {
		this.adname = adname;
	}

	public String getAdplayroleid() {
		return adplayroleid;
	}

	public void setAdplayroleid(String adplayroleid) {
		this.adplayroleid = adplayroleid;
	}

	public String getAdvertisingratesid() {
		return advertisingratesid;
	}

	public void setAdvertisingratesid(String advertisingratesid) {
		this.advertisingratesid = advertisingratesid;
	}

	public String getAdorderid() {
		return adorderid;
	}

	public void setAdorderid(String adorderid) {
		this.adorderid = adorderid;
	}

	public Date getBegintime() {
		return begintime;
	}

	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public BigDecimal getPayment() {
		return payment;
	}

	public void setPayment(BigDecimal payment) {
		this.payment = payment;
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

	public String getAreaname() {
		return areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}

	public String getBoxcode() {
		return boxcode;
	}

	public void setBoxcode(String boxcode) {
		this.boxcode = boxcode;
	}

	public String getBoxname() {
		return boxname;
	}

	public void setBoxname(String boxname) {
		this.boxname = boxname;
	}

	public String getAdvertisingpositionid() {
		return advertisingpositionid;
	}

	public void setAdvertisingpositionid(String advertisingpositionid) {
		this.advertisingpositionid = advertisingpositionid;
	}

	public String getAreaid() {
		return areaid;
	}

	public void setAreaid(String areaid) {
		this.areaid = areaid;
	}
}
