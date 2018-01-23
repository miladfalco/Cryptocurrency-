
package com.example.fartakstok.cryptocurrency.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class TMN {

    @SerializedName("name")
    private String mName;
    @SerializedName("rate")
    private Long mRate;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Long getRate() {
        return mRate;
    }

    public void setRate(Long rate) {
        mRate = rate;
    }

}
