package com.example.salty_fish.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by salty-fish on 2017/5/22.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
