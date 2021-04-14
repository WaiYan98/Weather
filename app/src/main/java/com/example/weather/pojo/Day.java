package com.example.weather.pojo;

import com.google.gson.annotations.SerializedName;

public class Day {

    @SerializedName("maxtemp_c")
    private double maxTempC;
    @SerializedName("maxtemp_f")
    private double maxTempF;
    @SerializedName("mintemp_c")
    private double minTempC;
    @SerializedName("mintemp_f")
    private double minTempF;
    @SerializedName("avgtemp_c")
    private double avgTempC;
    @SerializedName("avgtemp_f")
    private double avgTempF;
    @SerializedName("maxwind_mph")
    private double maxWindMph;
    @SerializedName("maxwind_kph")
    private double maxWindKph;
    @SerializedName("totalprecip_mm")
    private double totalPrecipMM;
    @SerializedName("totalprecip_in")
    private double toatlPrecipIn;
    @SerializedName("avgvis_km")
    private double avgvisKm;
    @SerializedName("avgvis_miles")
    private double avgVisMiles;
    @SerializedName("avghumidity")
    private double avgHumidity;
    @SerializedName("daily_will_it_rain")
    private int dailyWillItRain;
    @SerializedName("daily_chance_of_rain")
    private int dailyChanceOfRain;
    @SerializedName("daily_will_it_snow")
    private int dailyWillItSnow;
    @SerializedName("daily_chance_of_snow")
    private int dailyChanceOfSnow;
    private Condition condition;
    private double uv;

    public double getMaxTempC() {
        return maxTempC;
    }

    public void setMaxTempC(double maxTempC) {
        this.maxTempC = maxTempC;
    }

    public double getMaxTempF() {
        return maxTempF;
    }

    public void setMaxTempF(double maxTempF) {
        this.maxTempF = maxTempF;
    }

    public double getMinTempC() {
        return minTempC;
    }

    public void setMinTempC(double minTempC) {
        this.minTempC = minTempC;
    }

    public double getMinTempF() {
        return minTempF;
    }

    public void setMinTempF(double minTempF) {
        this.minTempF = minTempF;
    }

    public double getAvgTempC() {
        return avgTempC;
    }

    public void setAvgTempC(double avgTempC) {
        this.avgTempC = avgTempC;
    }

    public double getAvgTempF() {
        return avgTempF;
    }

    public void setAvgTempF(double avgTempF) {
        this.avgTempF = avgTempF;
    }

    public double getMaxWindMph() {
        return maxWindMph;
    }

    public void setMaxWindMph(double maxWindMph) {
        this.maxWindMph = maxWindMph;
    }

    public double getMaxWindKph() {
        return maxWindKph;
    }

    public void setMaxWindKph(double maxWindKph) {
        this.maxWindKph = maxWindKph;
    }

    public double getTotalPrecipMM() {
        return totalPrecipMM;
    }

    public void setTotalPrecipMM(double totalPrecipMM) {
        this.totalPrecipMM = totalPrecipMM;
    }

    public double getToatlPrecipIn() {
        return toatlPrecipIn;
    }

    public void setToatlPrecipIn(double toatlPrecipIn) {
        this.toatlPrecipIn = toatlPrecipIn;
    }

    public double getAvgvisKm() {
        return avgvisKm;
    }

    public void setAvgvisKm(double avgvisKm) {
        this.avgvisKm = avgvisKm;
    }

    public double getAvgVisMiles() {
        return avgVisMiles;
    }

    public void setAvgVisMiles(double avgVisMiles) {
        this.avgVisMiles = avgVisMiles;
    }

    public double getAvgHumidity() {
        return avgHumidity;
    }

    public void setAvgHumidity(double avgHumidity) {
        this.avgHumidity = avgHumidity;
    }

    public int getDailyWillItRain() {
        return dailyWillItRain;
    }

    public void setDailyWillItRain(int dailyWillItRain) {
        this.dailyWillItRain = dailyWillItRain;
    }

    public int getDailyChanceOfRain() {
        return dailyChanceOfRain;
    }

    public void setDailyChanceOfRain(int dailyChanceOfRain) {
        this.dailyChanceOfRain = dailyChanceOfRain;
    }

    public int getDailyWillItSnow() {
        return dailyWillItSnow;
    }

    public void setDailyWillItSnow(int dailyWillItSnow) {
        this.dailyWillItSnow = dailyWillItSnow;
    }

    public int getDailyChanceOfSnow() {
        return dailyChanceOfSnow;
    }

    public void setDailyChanceOfSnow(int dailyChanceOfSnow) {
        this.dailyChanceOfSnow = dailyChanceOfSnow;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }

    @Override
    public String toString() {
        return "Day{" +
                "maxTempC=" + maxTempC +
                ", maxTempF=" + maxTempF +
                ", minTempC=" + minTempC +
                ", minTempF=" + minTempF +
                ", avgTempC=" + avgTempC +
                ", avgTempF=" + avgTempF +
                ", maxWindMph=" + maxWindMph +
                ", maxWindKph=" + maxWindKph +
                ", totalPrecipMM=" + totalPrecipMM +
                ", toatlPrecipIn=" + toatlPrecipIn +
                ", avgvisKm=" + avgvisKm +
                ", avgVisMiles=" + avgVisMiles +
                ", avgHumidity=" + avgHumidity +
                ", dailyWillItRain=" + dailyWillItRain +
                ", dailyChanceOfRain=" + dailyChanceOfRain +
                ", dailyWillItSnow=" + dailyWillItSnow +
                ", dailyChanceOfSnow=" + dailyChanceOfSnow +
                ", condition=" + condition +
                ", uv=" + uv +
                '}';
    }
}
