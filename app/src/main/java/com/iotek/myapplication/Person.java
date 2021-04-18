package com.iotek.myapplication;

public class Person {

    private String derviceCode;
    private String offerCode;
    private String itemCode;
    private String deviceName;
    private String subDeviceName;
    private boolean isEnable;

    public Person(String derviceCode, String offerCode, String itemCode, String deviceName, String subDeviceName, boolean isEnable) {
        this.derviceCode = derviceCode;
        this.offerCode = offerCode;
        this.itemCode = itemCode;
        this.deviceName = deviceName;
        this.subDeviceName = subDeviceName;
        this.isEnable = isEnable;
    }

    public String getDerviceCode() {
        return derviceCode;
    }

    public void setDerviceCode(String derviceCode) {
        this.derviceCode = derviceCode;
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

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getSubDeviceName() {
        return subDeviceName;
    }

    public void setSubDeviceName(String subDeviceName) {
        this.subDeviceName = subDeviceName;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    @Override
    public String toString() {
        return "Person{" +
                "derviceCode='" + derviceCode + '\'' +
                ", offerCode='" + offerCode + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", subDeviceName='" + subDeviceName + '\'' +
                ", isEnable=" + isEnable +
                '}';
    }
}
