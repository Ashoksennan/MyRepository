package com.example.admin.myapplication.Network;

import com.example.admin.myapplication.models.LoginPojo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {
    @GET("/BloodApp/login.php")
    Call<List<LoginPojo>> getLoginDetails();
}
