package com.sed.andrearubeis.sed.data.remote;

public class ApiUtils {

    public static final String BASE_URL = "http://washit.dek4.net/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}