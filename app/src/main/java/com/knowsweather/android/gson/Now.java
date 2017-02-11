package com.knowsweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zoc on 2017/2/8.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }


}
