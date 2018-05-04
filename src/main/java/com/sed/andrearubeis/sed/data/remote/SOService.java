package com.sed.andrearubeis.sed.data.remote;




import com.sed.andrearubeis.sed.data.model.Gps;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SOService {

    @GET("getGpsPosition.php")
    Call<Gps> getAnswers();

    @GET("getGpsPosition.php")
    Call<Gps> getAnswers(@Query("tagged") String tags);
}