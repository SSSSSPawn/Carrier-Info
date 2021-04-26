package com.iotek.myapplication;

public class DeviceRightVo {

    private String deviceCode;
    private String offerCode;
    private String itemCode;


    public DeviceRightVo(String deviceCode, String offerCode, String itemCode) {
        this.deviceCode = deviceCode;
        this.offerCode = offerCode;
        this.itemCode = itemCode;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public String getOfferCode() {
        return offerCode;
    }

    public void setOfferCode(String offerCode) {
        this.offerCode = offerCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @Override
    public String toString() {
        return "DeviceRightVo{" +
                "deviceCode='" + deviceCode + '\'' +
                ", offerCode='" + offerCode + '\'' +
                ", itemCode='" + itemCode + '\'' +
                '}';
    }

    }
