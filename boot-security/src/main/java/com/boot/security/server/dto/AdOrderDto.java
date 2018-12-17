package com.boot.security.server.dto;

import com.boot.security.server.model.AdOrder;

public class AdOrderDto extends AdOrder {

    private String paytypename;

    private String paystatusname;

    public String getPaytypename() {
        return paytypename;
    }

    public void setPaytypename(String paytypename) {
        this.paytypename = paytypename;
    }

    public String getPaystatusname() {
        return paystatusname;
    }

    public void setPaystatusname(String paystatusname) {
        this.paystatusname = paystatusname;
    }
}
