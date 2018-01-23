
package com.example.fartakstok.cryptocurrency.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class USD {

    @SerializedName("name")
    private String mName;
    @SerializedName("rate")
    private String mRate;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getRate() {
        return mRate;
    }

    public void setRate(String rate) {
        mRate = rate;
    }

}
