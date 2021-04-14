package com.example.weather.pojo;

import com.google.gson.annotations.SerializedName;

public class Hour {

    @SerializedName("time_epoch")
    private long timeEpoch;
    @SerializedName("time")
    private String time;
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
    private int windDegree;
    @SerializedName("wind_dir")
    private String windDir;
    @SerializedName("pressure_mb")
    private double pressureMb;
    @SerializedName("pressure_in")
    private double pressureIn;
    @SerializedName("precip_mm")
    private double precipMm;
    @SerializedName("precip_in")
    private double precipIn;
    private int humidity;
    private int cloud;
    @SerializedName("feelslike_c")
    private double feelsLikeC;
    @SerializedName("feelslike_f")
    private double feelsLikeF;
    @SerializedName("windchill_c")
    private double windChillC;
    @SerializedName("windchill_f")
    private double windChillF;
    @SerializedName("heatindex_c")
    private double heatIndexC;
    @SerializedName("heatindex_f")
    private double heatIndexF;
    @SerializedName("dewpoint_c")
    private double dewPointC;
    @SerializedName("dewpoint_f")
    private double dewPointF;
    @SerializedName("will_it_rain")
    private int willItRain;
    @SerializedName("chance_of_rain")
    private int chanceOfRain;
    @SerializedName("will_it_snow")
    private int willItSnow;
    @SerializedName("chance_of_snow")
    private int chanceOfSnow;
    @SerializedName("vis_km")
    private double visKm;
    @SerializedName("vis_miles")
    private double visMiles;
    @SerializedName("gust_mph")
    private double gustMph;
    @SerializedName("gust_kph")
    private double gustKph;
    @SerializedName("uv")
    private double uv;

    public long getTimeEpoch() {
        return timeEpoch;
    }

    public void setTimeEpoch(long timeEpoch) {
        this.timeEpoch = timeEpoch;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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

    public int getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(int windDegree) {
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

    public double getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(double precipMm) {
        this.precipMm = precipMm;
    }

    public double getPrecipIn() {
        return precipIn;
    }

    public void setPrecipIn(double precipIn) {
        this.precipIn = precipIn;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public void setCloud(int cloud) {
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

    public double getWindChillC() {
        return windChillC;
    }

    public void setWindChillC(double windChillC) {
        this.windChillC = windChillC;
    }

    public double getWindChillF() {
        return windChillF;
    }

    public void setWindChillF(double windChillF) {
        this.windChillF = windChillF;
    }

    public double getHeatIndexC() {
        return heatIndexC;
    }

    public void setHeatIndexC(double heatIndexC) {
        this.heatIndexC = heatIndexC;
    }

    public double getHeatIndexF() {
        return heatIndexF;
    }

    public void setHeatIndexF(double heatIndexF) {
        this.heatIndexF = heatIndexF;
    }

    public double getDewPointC() {
        return dewPointC;
    }

    public void setDewPointC(double dewPointC) {
        this.dewPointC = dewPointC;
    }

    public double getDewPointF() {
        return dewPointF;
    }

    public void setDewPointF(double dewPointF) {
        this.dewPointF = dewPointF;
    }

    public int getWillItRain() {
        return willItRain;
    }

    public void setWillItRain(int willItRain) {
        this.willItRain = willItRain;
    }

    public int getChanceOfRain() {
        return chanceOfRain;
    }

    public void setChanceOfRain(int chanceOfRain) {
        this.chanceOfRain = chanceOfRain;
    }

    public int getWillItSnow() {
        return willItSnow;
    }

    public void setWillItSnow(int willItSnow) {
        this.willItSnow = willItSnow;
    }

    public int getChanceOfSnow() {
        return chanceOfSnow;
    }

    public void setChanceOfSnow(int chanceOfSnow) {
        this.chanceOfSnow = chanceOfSnow;
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

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }

    @Override
    public String toString() {
        return "Hour{" +
                "timeEpoch=" + timeEpoch +
                ", time='" + time + '\'' +
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
                ", precipMm=" + precipMm +
                ", precipIn=" + precipIn +
                ", humidity=" + humidity +
                ", cloud=" + cloud +
                ", feelsLikeC=" + feelsLikeC +
                ", feelsLikeF=" + feelsLikeF +
                ", windChillC=" + windChillC +
                ", windChillF=" + windChillF +
                ", heatIndexC=" + heatIndexC +
                ", heatIndexF=" + heatIndexF +
                ", dewPointC=" + dewPointC +
                ", dewPointF=" + dewPointF +
                ", willItRain=" + willItRain +
                ", chanceOfRain=" + chanceOfRain +
                ", willItSnow=" + willItSnow +
                ", chanceOfSnow=" + chanceOfSnow +
                ", visKm=" + visKm +
                ", visMiles=" + visMiles +
                ", gustMph=" + gustMph +
                ", gustKph=" + gustKph +
                ", uv=" + uv +
                '}';
    }
}
