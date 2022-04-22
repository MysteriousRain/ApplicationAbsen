package com.example.applicationabsen.service


import com.example.applicationabsen.model.UserRequest
import com.example.applicationabsen.model.UserResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers

interface ILogin {

    @Headers("X-Api-Key:7CEA5BD21C9B664D78E37276C91FAB02")
    @GET("api/absen/all")
    fun getAllLogin(
        @Body userRequest: UserRequest
    ): Call<UserResponse>



}