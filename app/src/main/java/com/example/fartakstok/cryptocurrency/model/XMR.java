
package com.example.fartakstok.cryptocurrency.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class XMR {

    @SerializedName("name")
    private String mName;
    @SerializedName("rates")
    private Rates mRates;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Rates getRates() {
        return mRates;
    }

    public void setRates(Rates rates) {
        mRates = rates;
    }

}
