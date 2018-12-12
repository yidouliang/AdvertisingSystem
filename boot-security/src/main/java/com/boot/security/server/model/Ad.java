package com.boot.security.server.model;

import java.math.BigDecimal;
import java.util.Date;

public class Ad extends BaseEntity<Long> {

	private String assessorid;
	private String assessorname;
	private String companyid;
	private String companyname;
	private String adplayroleid;
	private String adname;
	private String adurl;
	private String adcoverurl;
	private String adalt;
	private String adnote;
	private Integer adsort;
	private BigDecimal adprice;
	private Integer adduration;
	private Integer datastate;
	private Date createtime;
	private Date updatetime;

	public String getAssessorid() {
		return assessorid;
	}
	public String setAssessorid() {
		return assessorid;
	}
	public String getAssessorname() {
		return assessorname;
	}
	public String setAssessorname() {
		return assessorname;
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
	public String getAdplayroleid() {
		return adplayroleid;
	}
	public String setAdplayroleid() {
		return adplayroleid;
	}
	public String getAdname() {
		return adname;
	}
	public String setAdname() {
		return adname;
	}
	public String getAdurl() {
		return adurl;
	}
	public String setAdurl() {
		return adurl;
	}
	public String getAdcoverurl() {
		return adcoverurl;
	}
	public String setAdcoverurl() {
		return adcoverurl;
	}
	public String getAdalt() {
		return adalt;
	}
	public String setAdalt() {
		return adalt;
	}
	public String getAdnote() {
		return adnote;
	}
	public String setAdnote() {
		return adnote;
	}
	public Integer getAdsort() {
		return adsort;
	}
	public Integer setAdsort() {
		return adsort;
	}
	public BigDecimal getAdprice() {
		return adprice;
	}
	public BigDecimal setAdprice() {
		return adprice;
	}
	public Integer getAdduration() {
		return adduration;
	}
	public Integer setAdduration() {
		return adduration;
	}
	public Integer getDatastate() {
		return datastate;
	}
	public Integer setDatastate() {
		return datastate;
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

}
