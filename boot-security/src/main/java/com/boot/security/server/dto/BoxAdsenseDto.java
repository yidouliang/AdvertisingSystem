package com.boot.security.server.dto;

import com.boot.security.server.model.BoxAdsense;

public class BoxAdsenseDto extends BoxAdsense {

    private String adsensetypename;

    private String adsensestatusname;

    public String getAdsensetypename() {
        return adsensetypename;
    }

    public void setAdsensetypename(String adsensetypename) {
        this.adsensetypename = adsensetypename;
    }

    public String getAdsensestatusname() {
        return adsensestatusname;
    }

    public void setAdsensestatusname(String adsensestatusname) {
        this.adsensestatusname = adsensestatusname;
    }
}
