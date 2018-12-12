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
	public String setAdid() {
		return adid;
	}
	public String getAdname() {
		return adname;
	}
	public String setAdname() {
		return adname;
	}
	public String getAdplayroleid() {
		return adplayroleid;
	}
	public String setAdplayroleid() {
		return adplayroleid;
	}
	public String getAdvertisingratesid() {
		return advertisingratesid;
	}
	public String setAdvertisingratesid() {
		return advertisingratesid;
	}
	public String getAdorderid() {
		return adorderid;
	}
	public String setAdorderid() {
		return adorderid;
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
	public BigDecimal getPayment() {
		return payment;
	}
	public BigDecimal setPayment() {
		return payment;
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
	public String getAreaname() {
		return areaname;
	}
	public String setAreaname() {
		return areaname;
	}
	public String getBoxcode() {
		return boxcode;
	}
	public String setBoxcode() {
		return boxcode;
	}
	public String getBoxname() {
		return boxname;
	}
	public String setBoxname() {
		return boxname;
	}
	public String getAdvertisingpositionid() {
		return advertisingpositionid;
	}
	public String setAdvertisingpositionid() {
		return advertisingpositionid;
	}
	public String getAreaid() {
		return areaid;
	}
	public String setAreaid() {
		return areaid;
	}

}
