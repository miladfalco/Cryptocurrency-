package com.example.fartakstok.cryptocurrency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fartakstok.cryptocurrency.api.crypto.current.CurrentCryptoApiRequest;
import com.example.fartakstok.cryptocurrency.model.BTC;
import com.example.fartakstok.cryptocurrency.model.CurrentCrypto;
import com.example.fartakstok.cryptocurrency.model.Rates;
import com.example.fartakstok.cryptocurrency.model.USD;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<CurrentCrypto> {

    private EditText editCryptoName;

    public static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editCryptoName = findViewById(R.id.editCryptoName);

    }

    public void onGetCurrentCrypto(View view) {

        String crypto = editCryptoName.getText().toString();
        CurrentCryptoApiRequest.getCurrentCrypto(crypto, this);
    }

    @Override
    public void onResponse(Call<CurrentCrypto> call, Response<CurrentCrypto> response) {
        Log.i(TAG, "onResponse: " + response.code());


        if (response.isSuccessful()) {
            CurrentCrypto body = response.body();
            String rate = body.getBTC().getRates().getUSD().getRate();
            Toast.makeText(this, " USD " + rate, Toast.LENGTH_LONG).show();


//            String rate1 = body.getETH().getRates().getUSD().getRate();
//            Toast.makeText(this, " USD " + rate1, Toast.LENGTH_LONG).show();



//            Rates rates = body.getBTC().getRates();
//            String time = body.getTime();
//            String rate = body.getBTC().getRates().getUSD().getRate();


//                String rate2 = body.getLTC().getRates().getUSD().getRate();

//                Toast.makeText(this, " USD " + rate2, Toast.LENGTH_LONG).show();


//            Log.i(TAG, "onResponse: rate" + rate + " usd ");


    } else
        Toast.makeText(this, "onResponse Failed ! ", Toast.LENGTH_SHORT).show();
    }



    @Override
    public void onFailure(Call<CurrentCrypto> call, Throwable t) {
        Log.i("==>", "onFailure: ");

    }
}
