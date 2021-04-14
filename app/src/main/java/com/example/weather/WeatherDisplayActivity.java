package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.weather.adapter.WeatherDisplayHourlyRecyAdapter;
import com.example.weather.api.ApiClient;
import com.example.weather.api.WeatherService;
import com.example.weather.pojo.Condition;
import com.example.weather.pojo.Day;
import com.example.weather.pojo.Weather;
import com.example.weather.util.HorizontalSpaceItemDecoration;
import com.example.weather.util.MyDate;
import com.github.matteobattilana.weather.PrecipType;
import com.github.matteobattilana.weather.WeatherView;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherDisplayActivity extends AppCompatActivity {

    @BindView(R.id.linear_layout_display_background)
    LinearLayout linearLayoutDisplayBackground;
    @BindView(R.id.txt_city_name)
    TextView txtCityName;
    @BindView(R.id.txt_update_status)
    TextView txtUpdateStatus;
    @BindView(R.id.weather_view)
    WeatherView weatherView;
    @BindView(R.id.progress_bar)
    ProgressBar progressBar;
    @BindView(R.id.img_search_location)
    ImageView imgSearchLocation;
    @BindView(R.id.img_more)
    ImageView imgMore;
    @BindView(R.id.txt_condition)
    TextView txtCondition;
    @BindView(R.id.txt_date)
    TextView txtDate;
    @BindView(R.id.img_sun)
    ImageView imgSun;
    @BindView(R.id.linear_layout_whv_display)
    LinearLayout linearLayoutWhvDisplay;
    @BindView(R.id.recy_weather_display_hourly)
    RecyclerView recyWeatherDisplayHourly;
    @BindView(R.id.linear_layout_next_3_days)
    LinearLayout linearLayoutNext3Days;
    @BindView(R.id.txt_temp_current)
    TextView txtTempCurrent;
    @BindView(R.id.txt_temp_max_min)
    TextView txtTempMaxMin;
    @BindView(R.id.txt_current_wind)
    TextView txtCurrentWind;
    @BindView(R.id.txt_current_humidity)
    TextView txtCurrentHumidity;
    @BindView(R.id.txt_current_visibility)
    TextView txtCurrentVisibility;
    private WeatherService weatherService;
    private Weather currentWeather;
    private Weather forecastWeather;
    private String bgColorCondition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_display);
        ButterKnife.bind(this);

        weatherService = ApiClient.getRetrofit().create(WeatherService.class);

        getCurrentWeather();
        getForecastWeather();

        Log.d("tag", "onCreate: " + MyDate.getHour("1998-01-14 11:16"));

        linearLayoutNext3Days.setOnClickListener(v -> {
            goToNext14DaysActivity();
        });

    }

    public void goToNext14DaysActivity() {

        if (forecastWeather != null) {
            Intent intent = new Intent(this, Next3DaysWeatherActivity.class);
            startActivity(intent);
        }
    }

    public void getCurrentWeather() {

        weatherService.getCurrentWeather()
                .enqueue(new Callback<Weather>() {
                    @Override
                    public void onResponse(Call<Weather> call, Response<Weather> response) {

                        currentWeather = response.body();

                        changeWeatherCondition(currentWeather.getCurrent().getCondition().getText(), currentWeather.getCurrent().getLastUpdated());

                        txtCityName.setText(currentWeather.getLocation().getName());
                        progressBar.setVisibility(View.GONE);
                        txtUpdateStatus.setVisibility(View.VISIBLE);
                        txtCondition.setText(currentWeather.getCurrent().getCondition().getText());
                        txtTempCurrent.setText(String.valueOf(currentWeather.getCurrent().getTempC()));
                        txtDate.setText(MyDate.strDateFormat(currentWeather.getCurrent().getLastUpdated()));
                        txtCurrentWind.setText(String.valueOf(currentWeather.getCurrent().getWindKph() + "km/h"));
                        txtCurrentHumidity.setText(String.valueOf(currentWeather.getCurrent().getHumidity() + "%"));
                        txtCurrentVisibility.setText(String.valueOf(currentWeather.getCurrent().getVisKm() + "km"));
                    }

                    @Override
                    public void onFailure(Call<Weather> call, Throwable t) {
                        Log.d("tag", "onFailure: " + t.getMessage());
                    }
                });

    }

    public void getForecastWeather() {

        weatherService.getForecastWeather()
                .enqueue(new Callback<Weather>() {
                    @Override
                    public void onResponse(Call<Weather> call, Response<Weather> response) {
                        forecastWeather = response.body();

                        DecimalFormat df = new DecimalFormat("0");
                        Day currentDay = forecastWeather.getForecast().getForecastDayList().get(0).getDay();

                        String maxTemp = df.format(currentDay.getMaxTempC());
                        String minTemp = df.format(currentDay.getMinTempC());

                        txtTempMaxMin.setText(String.valueOf(maxTemp + "/" + minTemp));

                        recyWeatherDisplayHourly.setAdapter(new WeatherDisplayHourlyRecyAdapter(WeatherDisplayActivity.this, forecastWeather, bgColorCondition));
                        recyWeatherDisplayHourly.setLayoutManager(new LinearLayoutManager(WeatherDisplayActivity.this, LinearLayoutManager.HORIZONTAL, false));
                        recyWeatherDisplayHourly.addItemDecoration(new HorizontalSpaceItemDecoration(16));
                    }

                    @Override
                    public void onFailure(Call<Weather> call, Throwable t) {
                        Log.d("tag", "onFailure: " + t.getMessage());
                        t.printStackTrace();
                    }
                });

    }

    public void changeWeatherCondition(String conditionText, String date) {

        int hour = MyDate.getHour(date);

        if (conditionText.equals("Sunny")) {
            linearLayoutDisplayBackground.setBackground(ContextCompat.getDrawable(this, R.drawable.sunny_day));
            linearLayoutWhvDisplay.setBackground(ContextCompat.getDrawable(this, R.drawable.rounded_rectangle_light_blue));
            imgSun.setVisibility(View.VISIBLE);
            bgColorCondition = "Sunny";
        }

        if (conditionText.equals("Clear")) {
            linearLayoutDisplayBackground.setBackground(ContextCompat.getDrawable(this, R.drawable.clear));
            linearLayoutWhvDisplay.setBackground(ContextCompat.getDrawable(this, R.drawable.rounded_rectangle_more_darker_blue));
            imgSun.setVisibility(View.GONE);
            bgColorCondition = "Clear";
        }

        if (conditionText.equals("Partly cloudy") && hour < 18) {
            linearLayoutDisplayBackground.setBackground(ContextCompat.getDrawable(this, R.drawable.sunny_day));
            linearLayoutWhvDisplay.setBackground(ContextCompat.getDrawable(this, R.drawable.rounded_rectangle_light_blue));
            imgSun.setVisibility(View.GONE);
            bgColorCondition = "Partly cloudy";
        }

        if (conditionText.equals("Partly cloudy") && hour >= 18) {
            linearLayoutDisplayBackground.setBackground(ContextCompat.getDrawable(this, R.drawable.partly_cloudy_night));
            linearLayoutWhvDisplay.setBackground(ContextCompat.getDrawable(this, R.drawable.rounded_rectangle_dark));
            imgSun.setVisibility(View.GONE);
            bgColorCondition = "Partly cloudy night";
        }

        if (conditionText.equals("Cloudy")) {
            linearLayoutDisplayBackground.setBackground(ContextCompat.getDrawable(this, R.drawable.cloudy_day));
            linearLayoutWhvDisplay.setBackground(ContextCompat.getDrawable(this, R.drawable.rounded_rectangle_gray));
            imgSun.setVisibility(View.GONE);
            bgColorCondition = "Cloudy";
        }

        if (conditionText.equals("Patchy light drizzle") || conditionText.equals("Light drizzle")
                || conditionText.equals("Patchy light rain") || conditionText.equals("Light rain")
                || conditionText.equals("Moderate rain") || conditionText.equals("Heavy rain")
                || conditionText.equals("Light sleet") || conditionText.equals("Moderate or heavy sleet")
                || conditionText.equals("Light rain shower") || conditionText.equals("Moderate or heavy rain shower")
                || conditionText.equals("Torrential rain shower") || conditionText.equals("Patchy light rain with thunder")
                || conditionText.equals("Moderate or heavy rain with thunder")) {

            txtCondition.setVisibility(View.GONE);

            linearLayoutDisplayBackground.setBackground(ContextCompat.getDrawable(this, R.drawable.cloudy_day));
            linearLayoutWhvDisplay.setBackground(ContextCompat.getDrawable(this, R.drawable.rounded_rectangle_gray));
            imgSun.setVisibility(View.GONE);

            weatherView.setWeatherData(PrecipType.RAIN);
            weatherView.setAngle(15);
            weatherView.setEmissionRate(500);
            weatherView.setSpeed(1000);

            bgColorCondition = "Rainy";

        }

        if (conditionText.equals("Blowing snow") || conditionText.equals("Blizzard") ||
                conditionText.equals("Freezing fog") || conditionText.equals("Freezing drizzle") ||
                conditionText.equals("Heavy freezing drizzle") || conditionText.equals("Light freezing rain") ||
                conditionText.equals("Moderate or heavy freezing rain") || conditionText.equals("Patchy light snow") ||
                conditionText.equals("Light snow") || conditionText.equals("Patchy moderate snow") ||
                conditionText.equals("Moderate snow") || conditionText.equals("Patchy heavy snow") ||
                conditionText.equals("Heavy snow") || conditionText.equals("Ice pellets") ||
                conditionText.equals("Light sleet showers") || conditionText.equals("Moderate or heavy sleet showers") ||
                conditionText.equals("Light snow showers") || conditionText.equals("Moderate or heavy snow showers") ||
                conditionText.equals("Light showers of ice pellets") || conditionText.equals("Moderate or heavy showers of ice pellets") ||
                conditionText.equals("Patchy light snow with thunder") || conditionText.equals("Moderate or heavy snow with thunder")) {

            txtCondition.setVisibility(View.GONE);

            linearLayoutDisplayBackground.setBackground(ContextCompat.getDrawable(this, R.drawable.snowy_day));
            linearLayoutWhvDisplay.setBackground(ContextCompat.getDrawable(this, R.drawable.rounded_rectangle_dark_blue));
            imgSun.setVisibility(View.GONE);

            weatherView.setWeatherData(PrecipType.SNOW);
            weatherView.setAngle(15);
            weatherView.setEmissionRate(500);
            weatherView.setSpeed(500);

            bgColorCondition = "Snow";
        }


    }
}