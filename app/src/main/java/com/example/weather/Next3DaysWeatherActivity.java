package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.weather.adapter.Next3WeatherRecyAdapter;
import com.example.weather.util.ItemDecoration;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Next3DaysWeatherActivity extends AppCompatActivity {

    @BindView(R.id.recy_next_3_weather)
    RecyclerView recyNext3Weather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next3_days_weather);
        ButterKnife.bind(this);

        recyNext3Weather.setAdapter(new Next3WeatherRecyAdapter());
        recyNext3Weather.setLayoutManager(new GridLayoutManager(this, 2));
        recyNext3Weather.addItemDecoration(new ItemDecoration(32));

    }
}