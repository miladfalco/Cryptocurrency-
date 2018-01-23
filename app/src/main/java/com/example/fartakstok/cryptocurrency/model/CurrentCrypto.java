
package com.example.fartakstok.cryptocurrency.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class CurrentCrypto {

    @SerializedName("BTC")
    private com.example.fartakstok.cryptocurrency.model.BTC mBTC;
    @SerializedName("DASH")
    private com.example.fartakstok.cryptocurrency.model.DASH mDASH;
    @SerializedName("DOGE")
    private com.example.fartakstok.cryptocurrency.model.DOGE mDOGE;
    @SerializedName("ETC")
    private com.example.fartakstok.cryptocurrency.model.ETC mETC;
    @SerializedName("ETH")
    private com.example.fartakstok.cryptocurrency.model.ETH mETH;
    @SerializedName("FCT")
    private com.example.fartakstok.cryptocurrency.model.FCT mFCT;
    @SerializedName("LTC")
    private com.example.fartakstok.cryptocurrency.model.LTC mLTC;
    @SerializedName("time")
    private String mTime;
    @SerializedName("XMR")
    private com.example.fartakstok.cryptocurrency.model.XMR mXMR;
    @SerializedName("XRP")
    private com.example.fartakstok.cryptocurrency.model.XRP mXRP;
    @SerializedName("ZEC")
    private com.example.fartakstok.cryptocurrency.model.ZEC mZEC;

    public com.example.fartakstok.cryptocurrency.model.BTC getBTC() {
        return mBTC;
    }

    public void setBTC(com.example.fartakstok.cryptocurrency.model.BTC BTC) {
        mBTC = BTC;
    }

    public com.example.fartakstok.cryptocurrency.model.DASH getDASH() {
        return mDASH;
    }

    public void setDASH(com.example.fartakstok.cryptocurrency.model.DASH DASH) {
        mDASH = DASH;
    }

    public com.example.fartakstok.cryptocurrency.model.DOGE getDOGE() {
        return mDOGE;
    }

    public void setDOGE(com.example.fartakstok.cryptocurrency.model.DOGE DOGE) {
        mDOGE = DOGE;
    }

    public com.example.fartakstok.cryptocurrency.model.ETC getETC() {
        return mETC;
    }

    public void setETC(com.example.fartakstok.cryptocurrency.model.ETC ETC) {
        mETC = ETC;
    }

    public com.example.fartakstok.cryptocurrency.model.ETH getETH() {
        return mETH;
    }

    public void setETH(com.example.fartakstok.cryptocurrency.model.ETH ETH) {
        mETH = ETH;
    }

    public com.example.fartakstok.cryptocurrency.model.FCT getFCT() {
        return mFCT;
    }

    public void setFCT(com.example.fartakstok.cryptocurrency.model.FCT FCT) {
        mFCT = FCT;
    }

    public com.example.fartakstok.cryptocurrency.model.LTC getLTC() {
        return mLTC;
    }

    public void setLTC(com.example.fartakstok.cryptocurrency.model.LTC LTC) {
        mLTC = LTC;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String time) {
        mTime = time;
    }

    public com.example.fartakstok.cryptocurrency.model.XMR getXMR() {
        return mXMR;
    }

    public void setXMR(com.example.fartakstok.cryptocurrency.model.XMR XMR) {
        mXMR = XMR;
    }

    public com.example.fartakstok.cryptocurrency.model.XRP getXRP() {
        return mXRP;
    }

    public void setXRP(com.example.fartakstok.cryptocurrency.model.XRP XRP) {
        mXRP = XRP;
    }

    public com.example.fartakstok.cryptocurrency.model.ZEC getZEC() {
        return mZEC;
    }

    public void setZEC(com.example.fartakstok.cryptocurrency.model.ZEC ZEC) {
        mZEC = ZEC;
    }

}
