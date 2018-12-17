package com.boot.security.server.dto;

import com.boot.security.server.model.AdOrderDetail;

public class AdOrderDetailDto extends AdOrderDetail {

    private String adsensename;

    public String getAdsensename() {
        return adsensename;
    }

    public void setAdsensename(String adsensename) {
        this.adsensename = adsensename;
    }
}
