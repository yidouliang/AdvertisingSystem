package com.boot.security.server.dto;

import java.util.Date;

/**
 * Created By Seven.wk
 * Description: 广告播放记录
 * Created At 2018/12/17
 */
public class AdRecordDTO {

    private Long id;
    private String boxcode;
    private String adid;
    private String adsensetype;
    private Date playdate;
    private String adcount;
    private Integer adplayroleid;

    public AdRecordDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBoxcode() {
        return boxcode;
    }

    public void setBoxcode(String boxcode) {
        this.boxcode = boxcode;
    }

    public String getAdid() {
        return adid;
    }

    public void setAdid(String adid) {
        this.adid = adid;
    }

    public String getAdsensetype() {
        return adsensetype;
    }

    public void setAdsensetype(String adsensetype) {
        this.adsensetype = adsensetype;
    }

    public Date getPlaydate() {
        return playdate;
    }

    public void setPlaydate(Date playdate) {
        this.playdate = playdate;
    }

    public String getAdcount() {
        return adcount;
    }

    public void setAdcount(String adcount) {
        this.adcount = adcount;
    }

    public Integer getAdplayroleid() {
        return adplayroleid;
    }

    public void setAdplayroleid(Integer adplayroleid) {
        this.adplayroleid = adplayroleid;
    }

    @Override
    public String toString() {
        return "AdRecordDTO{" +
                "id=" + id +
                ", boxcode='" + boxcode + '\'' +
                ", adid='" + adid + '\'' +
                ", adsensetype='" + adsensetype + '\'' +
                ", playdate=" + playdate +
                ", adcount='" + adcount + '\'' +
                ", adplayroleid=" + adplayroleid +
                '}';
    }
}
