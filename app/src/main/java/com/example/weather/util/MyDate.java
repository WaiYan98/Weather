package com.example.weather.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {

    public static String splitDate(String date) {

        String[] dateArray = date.split(" ");

        return dateArray[0];
    }

    public static String strDateFormat(String date) {

        String d = splitDate(date);
        String resultDate = "";

        try {
            Date strDate = new SimpleDateFormat("yyy-MM-dd").parse(d);
            String[] dateArray = strDate.toString().split(" ");
            resultDate = dateArray[0] + "," + dateArray[2] + "," + dateArray[1];
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultDate;
    }

    public static int getHour(String date) {

        String[] d = date.split(" ");

        String[] hourArray = d[1].split(":");

        return Integer.parseInt(hourArray[0]);
    }
}
