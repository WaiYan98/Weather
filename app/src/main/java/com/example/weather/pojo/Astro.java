package com.example.weather.pojo;

import com.google.gson.annotations.SerializedName;

public class Astro {

    @SerializedName("sunrise")
    private String sunRise;
    @SerializedName("sunset")
    private String sunSet;
    @SerializedName("moonrise")
    private String moonRise;
    @SerializedName("moonset")
    private String moonSet;
    @SerializedName("moon_phase")
    private String moonPhase;
    @SerializedName("moon_illumination")
    private int moonIllumination;

    public String getSunRise() {
        return sunRise;
    }

    public void setSunRise(String sunRise) {
        this.sunRise = sunRise;
    }

    public String getSunSet() {
        return sunSet;
    }

    public void setSunSet(String sunSet) {
        this.sunSet = sunSet;
    }

    public String getMoonRise() {
        return moonRise;
    }

    public void setMoonRise(String moonRise) {
        this.moonRise = moonRise;
    }

    public String getMoonSet() {
        return moonSet;
    }

    public void setMoonSet(String moonSet) {
        this.moonSet = moonSet;
    }

    public String getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(String moonPhase) {
        this.moonPhase = moonPhase;
    }

    public int getMoonIllumination() {
        return moonIllumination;
    }

    public void setMoonIllumination(int moonIllumination) {
        this.moonIllumination = moonIllumination;
    }

    @Override
    public String toString() {
        return "Astro{" +
                "sunRise='" + sunRise + '\'' +
                ", sunSet='" + sunSet + '\'' +
                ", moonRise='" + moonRise + '\'' +
                ", moonSet='" + moonSet + '\'' +
                ", moonPhase='" + moonPhase + '\'' +
                ", moonIllumination=" + moonIllumination +
                '}';
    }
}
