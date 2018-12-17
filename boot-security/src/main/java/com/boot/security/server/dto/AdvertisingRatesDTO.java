package com.boot.security.server.dto;

import java.math.BigDecimal;

/**
 * Created By Seven.wk
 * Description:
 * Created At 2018/12/17
 */
public class AdvertisingRatesDTO {
    private Long id;
    private String type;
    private String areaid;
    private BigDecimal secprice;
    private BigDecimal monprice;

    public AdvertisingRatesDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public BigDecimal getSecprice() {
        return secprice;
    }

    public void setSecprice(BigDecimal secprice) {
        this.secprice = secprice;
    }

    public BigDecimal getMonprice() {
        return monprice;
    }

    public void setMonprice(BigDecimal monprice) {
        this.monprice = monprice;
    }

    @Override
    public String toString() {
        return "AdvertisingRatesDTO{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", areaid='" + areaid + '\'' +
                ", secprice=" + secprice +
                ", monprice=" + monprice +
                '}';
    }
}
