package com.example.weather.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weather.R;
import com.example.weather.WeatherDisplayActivity;
import com.example.weather.pojo.Hour;
import com.example.weather.pojo.Weather;
import com.example.weather.util.MyDate;

import java.text.DecimalFormat;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WeatherDisplayHourlyRecyAdapter extends RecyclerView.Adapter<WeatherDisplayHourlyRecyAdapter.ViewHolder> {

    private Context context;
    private Weather weather;
    private String bgCondition;
    private List<Hour> hourList;

    public WeatherDisplayHourlyRecyAdapter(Context context, Weather weather, String bgCondition) {
        this.context = context;
        this.weather = weather;
        this.bgCondition = bgCondition;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_weather_display_hourly, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        DecimalFormat df = new DecimalFormat("0");

        hourList = weather.getForecast().getForecastDayList().get(0).getHourList();
        String date = hourList.get(position).getTime();

        holder.linearLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.rounded_rectangle_light_blue));
        holder.txtHour.setText(String.valueOf(MyDate.getHour(date) + ":00"));
        holder.txtTemp.setText(String.valueOf(df.format(hourList.get(position).getTempC())));
        changeBg(holder.linearLayout);

        Log.d("tag", "onBindViewHolder: " + hourList);

    }

    @Override
    public int getItemCount() {
        hourList = weather.getForecast().getForecastDayList().get(0).getHourList();
        return hourList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.linear_layout)
        LinearLayout linearLayout;
        @BindView(R.id.txt_hour)
        TextView txtHour;
        @BindView(R.id.img_condition)
        ImageView imgCondition;
        @BindView(R.id.txt_temp)
        TextView txtTemp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public void changeBg(LinearLayout linearLayout) {

        Log.d("tag", "changeBg: " + bgCondition);

        if (bgCondition.equals("Sunny"))
            linearLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.rounded_rectangle_light_blue));

        if (bgCondition.equals("Clear"))
            linearLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.rounded_rectangle_more_darker_blue));

        if (bgCondition.equals("Partly cloudy"))
            linearLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.rounded_rectangle_light_blue));

        if (bgCondition.equals("Partly cloudy night"))
            linearLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.rounded_rectangle_dark));

        if (bgCondition.equals("Cloudy"))
            linearLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.rounded_rectangle_gray));

        if (bgCondition.equals("Rainy"))
            linearLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.rounded_rectangle_gray));

        if (bgCondition.equals("Snow"))
            linearLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.rounded_rectangle_more_darker_blue));

        switch (bgCondition) {

        }
    }
}
