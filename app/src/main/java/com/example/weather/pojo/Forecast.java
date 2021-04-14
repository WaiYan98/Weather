package com.example.weather.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Forecast {

    @SerializedName("forecastday")
    List<ForecastDay> forecastDayList;

    public List<ForecastDay> getForecastDayList() {
        return forecastDayList;
    }

    public void setForecastDayList(List<ForecastDay> forecastDayList) {
        this.forecastDayList = forecastDayList;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "forecastDayList=" + forecastDayList +
                '}';
    }
}
