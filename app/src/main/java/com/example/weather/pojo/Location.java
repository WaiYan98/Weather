package com.example.weather.pojo;

import com.google.gson.annotations.SerializedName;

public class Location {

    private String name;
    private String region;
    private String country;
    private double lat;
    private double lon;
    @SerializedName("tz_id")
    private String tzId;
    @SerializedName("localtime_epoch")
    private long localTimeEpoch;
    @SerializedName("localtime")
    private String localTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getTzId() {
        return tzId;
    }

    public void setTzId(String tzId) {
        this.tzId = tzId;
    }

    public long getLocalTimeEpoch() {
        return localTimeEpoch;
    }

    public void setLocalTimeEpoch(long localTimeEpoch) {
        this.localTimeEpoch = localTimeEpoch;
    }

    public String getLocalTime() {
        return localTime;
    }

    public void setLocalTime(String localTime) {
        this.localTime = localTime;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", tzId='" + tzId + '\'' +
                ", localTimeEpoch=" + localTimeEpoch +
                ", localTime='" + localTime + '\'' +
                '}';
    }
}
