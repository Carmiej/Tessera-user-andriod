package com.example.blake.tessera;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface QRCode {

    String BASE_URL = "https://dev-api.tessera-dev.haydenwoodhead.com/api/";

    @GET("v1/users/tickets/")
    Call<QRCode> loginUser(@Body LoginData ld);
}
