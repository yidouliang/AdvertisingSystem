package com.boot.security.server.dto;

/**
 * Created By Seven.wk
 * Description: 播放规则
 * Created At 2018/12/17
 */
public class AdPlayRoleDTO {

    private Long id;
    private String adtype;
    private String adplaytimeid;
    private Integer intervaltime;

    public AdPlayRoleDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdtype() {
        return adtype;
    }

    public void setAdtype(String adtype) {
        this.adtype = adtype;
    }

    public String getAdplaytimeid() {
        return adplaytimeid;
    }

    public void setAdplaytimeid(String adplaytimeid) {
        this.adplaytimeid = adplaytimeid;
    }

    public Integer getIntervaltime() {
        return intervaltime;
    }

    public void setIntervaltime(Integer intervaltime) {
        this.intervaltime = intervaltime;
    }

    @Override
    public String toString() {
        return "AdPlayRoleDTO{" +
                "id=" + id +
                ", adtype=" + adtype +
                ", adplaytimeid='" + adplaytimeid + '\'' +
                ", intervaltime=" + intervaltime +
                '}';
    }
}
