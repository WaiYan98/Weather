package com.example.weather.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForecastDay {

    private String date;
    @SerializedName("date_epoch")
    private long dateEpoch;
    private Day day;
    private Astro astro;
    @SerializedName("hour")
    private List<Hour> hourList;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getDateEpoch() {
        return dateEpoch;
    }

    public void setDateEpoch(long dateEpoch) {
        this.dateEpoch = dateEpoch;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Astro getAstro() {
        return astro;
    }

    public void setAstro(Astro astro) {
        this.astro = astro;
    }

    public List<Hour> getHourList() {
        return hourList;
    }

    public void setHourList(List<Hour> hourList) {
        this.hourList = hourList;
    }

    @Override
    public String toString() {
        return "ForecastDay{" +
                "date='" + date + '\'' +
                ", dateEpoch=" + dateEpoch +
                ", day=" + day +
                ", astro=" + astro +
                ", hourList=" + hourList +
                '}';
    }
}
