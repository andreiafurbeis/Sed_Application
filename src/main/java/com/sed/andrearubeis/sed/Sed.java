package com.sed.andrearubeis.sed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.maps.MapView;
import com.sed.andrearubeis.sed.data.model.Gps;
import com.sed.andrearubeis.sed.data.remote.ApiUtils;
import com.sed.andrearubeis.sed.data.remote.SOService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Sed extends AppCompatActivity {

    private MapView mapView;
    private SOService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sed);

        Mapbox.getInstance(getApplicationContext() , getResources().getString(R.string.map_token));

        mapView = (MapView) findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);

        service = ApiUtils.getSOService();

        loadAnswers();

    }



    public void loadAnswers() {
        service.getAnswers().enqueue(new Callback<Gps>() {
            @Override
            public void onResponse(Call<Gps> call, Response<Gps> response) {

                if(response.isSuccessful()) {
                    Log.d("MainActivity", "posts loaded from API");
                    Log.d("MainActivity" , "Il time_istant é : " + response.body().toString());
                }else {
                    int statusCode  = response.code();
                    // handle request errors depending on status code
                }
            }

            @Override
            public void onFailure(Call<Gps> call, Throwable t) {
                Log.d("MainActivity", "error loading from API");

            }
        });
    }




}
