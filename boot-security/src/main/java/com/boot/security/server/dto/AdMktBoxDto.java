package com.boot.security.server.dto;

import com.boot.security.server.model.AdMktBox;

public class AdMktBoxDto extends AdMktBox {

    private String boxtypename;

    private String boxstatusname;


    public String getBoxtypename() {
        return boxtypename;
    }

    public void setBoxtypename(String boxtypename) {
        this.boxtypename = boxtypename;
    }

    public String getBoxstatusname() {
        return boxstatusname;
    }

    public void setBoxstatusname(String boxstatusname) {
        this.boxstatusname = boxstatusname;
    }

}
