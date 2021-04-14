package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.github.matteobattilana.weather.PrecipType;
import com.github.matteobattilana.weather.WeatherView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private WeatherView weatherView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.linear_layout);
        weatherView = findViewById(R.id.weather_view);


        Log.d("tag", "onCreate: " + weatherView.getEmissionRate());

    }

    public void snow(View view) {
        linearLayout.setBackground(ContextCompat.getDrawable(this, R.drawable.snowy_day));
        weatherView.setWeatherData(PrecipType.SNOW);
        weatherView.setAngle(15);
        weatherView.setEmissionRate(500);
        weatherView.setSpeed(500);
    }

    public void rainy(View view) {
        linearLayout.setBackground(ContextCompat.getDrawable(this, R.drawable.cloudy_day));
        weatherView.setWeatherData(PrecipType.RAIN);
        weatherView.setAngle(15);
        weatherView.setEmissionRate(500);
        weatherView.setSpeed(1000);
    }

    public void sunny(View view) {
        linearLayout.setBackground(ContextCompat.getDrawable(this, R.drawable.sunny_day));
        weatherView.setWeatherData(PrecipType.CLEAR);
    }
}