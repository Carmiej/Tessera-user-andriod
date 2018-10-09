package com.example.blake.tessera;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QRToken{

    @SerializedName("current_value")
    @Expose
    private Integer currentValue;
    @SerializedName("qr_code")
    @Expose
    private String qrCode;
    @SerializedName("ttl")
    @Expose
    private Integer ttl;

    public Integer getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

}