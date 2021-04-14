package com.example.weather.pojo;

import com.google.gson.annotations.SerializedName;

public class Current {

    @SerializedName("last_updated_epoch")
    private long lastUpdatedEpoch;
    @SerializedName("last_updated")
    private String lastUpdated;
    @SerializedName("temp_c")
    private double tempC;
    @SerializedName("temp_f")
    private double tempF;
    @SerializedName("is_day")
    private int isDay;
    private Condition condition;
    @SerializedName("wind_mph")
    private double windMph;
    @SerializedName("wind_kph")
    private double windKph;
    @SerializedName("wind_degree")
    private double windDegree;
    @SerializedName("wind_dir")
    private String windDir;
    @SerializedName("pressure_mb")
    private double pressureMb;
    @SerializedName("pressure_in")
    private double pressureIn;
    @SerializedName("precip_mm")
    private double precipMM;
    @SerializedName("precip_in")
    private double precipIn;
    private double humidity;
    private double cloud;
    @SerializedName("feels_like_c")
    private double feelsLikeC;
    @SerializedName("feels_like_f")
    private double feelsLikeF;
    @SerializedName("vis_km")
    private double visKm;
    @SerializedName("vis_miles")
    private double visMiles;
    private double uv;
    @SerializedName("gust_mph")
    private double gustMph;
    @SerializedName("gust_kph")
    private double gustKph;

    public long getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }

    public void setLastUpdatedEpoch(long lastUpdatedEpoch) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public double getTempC() {
        return tempC;
    }

    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    public double getTempF() {
        return tempF;
    }

    public void setTempF(double tempF) {
        this.tempF = tempF;
    }

    public int getIsDay() {
        return isDay;
    }

    public void setIsDay(int isDay) {
        this.isDay = isDay;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public double getWindMph() {
        return windMph;
    }

    public void setWindMph(double windMph) {
        this.windMph = windMph;
    }

    public double getWindKph() {
        return windKph;
    }

    public void setWindKph(double windKph) {
        this.windKph = windKph;
    }

    public double getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(double windDegree) {
        this.windDegree = windDegree;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public double getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(double pressureMb) {
        this.pressureMb = pressureMb;
    }

    public double getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(double pressureIn) {
        this.pressureIn = pressureIn;
    }

    public double getPrecipMM() {
        return precipMM;
    }

    public void setPrecipMM(double precipMM) {
        this.precipMM = precipMM;
    }

    public double getPrecipIn() {
        return precipIn;
    }

    public void setPrecipIn(double precipIn) {
        this.precipIn = precipIn;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getCloud() {
        return cloud;
    }

    public void setCloud(double cloud) {
        this.cloud = cloud;
    }

    public double getFeelsLikeC() {
        return feelsLikeC;
    }

    public void setFeelsLikeC(double feelsLikeC) {
        this.feelsLikeC = feelsLikeC;
    }

    public double getFeelsLikeF() {
        return feelsLikeF;
    }

    public void setFeelsLikeF(double feelsLikeF) {
        this.feelsLikeF = feelsLikeF;
    }

    public double getVisKm() {
        return visKm;
    }

    public void setVisKm(double visKm) {
        this.visKm = visKm;
    }

    public double getVisMiles() {
        return visMiles;
    }

    public void setVisMiles(double visMiles) {
        this.visMiles = visMiles;
    }

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }

    public double getGustMph() {
        return gustMph;
    }

    public void setGustMph(double gustMph) {
        this.gustMph = gustMph;
    }

    public double getGustKph() {
        return gustKph;
    }

    public void setGustKph(double gustKph) {
        this.gustKph = gustKph;
    }

    @Override
    public String toString() {
        return "Current{" +
                "lastUpdatedEpoch=" + lastUpdatedEpoch +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", tempC=" + tempC +
                ", tempF=" + tempF +
                ", isDay=" + isDay +
                ", condition=" + condition +
                ", windMph=" + windMph +
                ", windKph=" + windKph +
                ", windDegree=" + windDegree +
                ", windDir='" + windDir + '\'' +
                ", pressureMb=" + pressureMb +
                ", pressureIn=" + pressureIn +
                ", precipMM=" + precipMM +
                ", precipIn=" + precipIn +
                ", humidity=" + humidity +
                ", cloud=" + cloud +
                ", feelsLikeC=" + feelsLikeC +
                ", feelsLikeF=" + feelsLikeF +
                ", visKm=" + visKm +
                ", visMiles=" + visMiles +
                ", uv=" + uv +
                ", gustMph=" + gustMph +
                ", gustKph=" + gustKph +
                '}';
    }
}
