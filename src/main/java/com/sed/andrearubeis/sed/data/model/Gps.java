package com.sed.andrearubeis.sed.data.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Gps {

    @SerializedName("info")
    @Expose
    private String info;
    @SerializedName("time_istant")
    @Expose
    private String timeIstant;
    @SerializedName("validity")
    @Expose
    private String validity;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("velocity")
    @Expose
    private String velocity;
    @SerializedName("pos_date")
    @Expose
    private String posDate;

    /*public Gps(String info , String timeIstant , String validity , String latitude , String longitude , String velocity , String posDate) {
        this.info = info;
        this.timeIstant = timeIstant;
        this.validity = validity;
        this.latitude = latitude;
        this.longitude = longitude;
        this.velocity = velocity;
        this.posDate = posDate;
    }*/

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getTimeIstant() {
        return timeIstant;
    }

    public void setTimeIstant(String timeIstant) {
        this.timeIstant = timeIstant;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getVelocity() {
        return velocity;
    }

    public void setVelocity(String velocity) {
        this.velocity = velocity;
    }

    public String getPosDate() {
        return posDate;
    }

    public void setPosDate(String posDate) {
        this.posDate = posDate;
    }

    @Override
    public String toString() {
        return "Post{" +
                "info='" + info + '\'' +
                ", validity='" + validity + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", velocity='" + velocity + '\'' +
                ", pos_date='" + posDate + '\'' +
                '}';
    }

}