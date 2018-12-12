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

	public void setAssessorid(String assessorid) {
		this.assessorid = assessorid;
	}

	public String getAssessorname() {
		return assessorname;
	}

	public void setAssessorname(String assessorname) {
		this.assessorname = assessorname;
	}

	public String getCompanyid() {
		return companyid;
	}

	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getAdplayroleid() {
		return adplayroleid;
	}

	public void setAdplayroleid(String adplayroleid) {
		this.adplayroleid = adplayroleid;
	}

	public String getAdname() {
		return adname;
	}

	public void setAdname(String adname) {
		this.adname = adname;
	}

	public String getAdurl() {
		return adurl;
	}

	public void setAdurl(String adurl) {
		this.adurl = adurl;
	}

	public String getAdcoverurl() {
		return adcoverurl;
	}

	public void setAdcoverurl(String adcoverurl) {
		this.adcoverurl = adcoverurl;
	}

	public String getAdalt() {
		return adalt;
	}

	public void setAdalt(String adalt) {
		this.adalt = adalt;
	}

	public String getAdnote() {
		return adnote;
	}

	public void setAdnote(String adnote) {
		this.adnote = adnote;
	}

	public Integer getAdsort() {
		return adsort;
	}

	public void setAdsort(Integer adsort) {
		this.adsort = adsort;
	}

	public BigDecimal getAdprice() {
		return adprice;
	}

	public void setAdprice(BigDecimal adprice) {
		this.adprice = adprice;
	}

	public Integer getAdduration() {
		return adduration;
	}

	public void setAdduration(Integer adduration) {
		this.adduration = adduration;
	}

	public Integer getDatastate() {
		return datastate;
	}

	public void setDatastate(Integer datastate) {
		this.datastate = datastate;
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
}
