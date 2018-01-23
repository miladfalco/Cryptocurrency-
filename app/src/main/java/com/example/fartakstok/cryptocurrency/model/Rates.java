
package com.example.fartakstok.cryptocurrency.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Rates {

    @SerializedName("TMN")
    private com.example.fartakstok.cryptocurrency.model.TMN mTMN;
    @SerializedName("USD")
    private com.example.fartakstok.cryptocurrency.model.USD mUSD;

    public com.example.fartakstok.cryptocurrency.model.TMN getTMN() {
        return mTMN;
    }

    public void setTMN(com.example.fartakstok.cryptocurrency.model.TMN TMN) {
        mTMN = TMN;
    }

    public com.example.fartakstok.cryptocurrency.model.USD getUSD() {
        return mUSD;
    }

    public void setUSD(com.example.fartakstok.cryptocurrency.model.USD USD) {
        mUSD = USD;
    }

}
