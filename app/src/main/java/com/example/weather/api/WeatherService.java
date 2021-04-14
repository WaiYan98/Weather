package com.example.weather.api;

import com.example.weather.pojo.Weather;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WeatherService {

    @GET("current.json?key=9014c8defb3c4ab4894160701210604&q=16.6843,98.5007&aqi=no")
    Call<Weather> getCurrentWeather();

    @GET("forecast.json?key=9014c8defb3c4ab4894160701210604&q=16.6843,98.5007&days=4")
    Call<Weather> getForecastWeather();
}
