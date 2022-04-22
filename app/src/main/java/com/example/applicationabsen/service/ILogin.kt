package com.example.applicationabsen.service


import com.example.applicationabsen.model.LoginRequest
import com.example.applicationabsen.model.UserResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ILogin {

    @Headers("X-Api-Key:7CEA5BD21C9B664D78E37276C91FAB02")
    @GET("api/absen/all")
    fun getAllLogin(@Query("filter")filter:String): Call<LoginRequest>



}