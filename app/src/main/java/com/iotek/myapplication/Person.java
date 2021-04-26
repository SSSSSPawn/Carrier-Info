package com.iotek.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {

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

    protected Person(Parcel in) {
        derviceCode = in.readString();
        offerCode = in.readString();
        itemCode = in.readString();
        deviceName = in.readString();
        subDeviceName = in.readString();
        isEnable = in.readByte() != 0;
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(derviceCode);
        dest.writeString(offerCode);
        dest.writeString(itemCode);
        dest.writeString(deviceName);
        dest.writeString(subDeviceName);
        dest.writeByte((byte) (isEnable ? 1 : 0));
    }
}
