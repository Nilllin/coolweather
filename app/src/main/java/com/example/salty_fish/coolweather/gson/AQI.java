package com.example.salty_fish.coolweather.gson;

/**
 * Created by salty-fish on 2017/5/22.
 */

public class AQI {

    public AQIcity city;

    public class AQIcity{
        public String aqi;
        public String pm25;
    }
}
