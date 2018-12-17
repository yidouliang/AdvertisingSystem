package com.boot.security.server.dto;

import java.util.Date;

/**
 * Created By Seven.wk
 * Description: 消费者模型
 * Created At 2018/12/17
 */
public class AdConsumerDTO {

    private Long id;
    private String adconsumername;
    private String telphone;
    private String companyid;
    private String companyname;
    private String type;
    private Integer starcode;
    private String state;
    private Date createtime;
    private Date updatetime;

    public AdConsumerDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdconsumername() {
        return adconsumername;
    }

    public void setAdconsumername(String adconsumername) {
        this.adconsumername = adconsumername;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStarcode() {
        return starcode;
    }

    public void setStarcode(Integer starcode) {
        this.starcode = starcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    @Override
    public String toString() {
        return "ConsumerDTO{" +
                "adconsumername='" + adconsumername + '\'' +
                ", telphone='" + telphone + '\'' +
                ", companyid='" + companyid + '\'' +
                ", companyname='" + companyname + '\'' +
                ", type='" + type + '\'' +
                ", starcode=" + starcode +
                ", state='" + state + '\'' +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                '}';
    }
}
