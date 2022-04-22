package com.example.applicationabsen.service

import com.example.applicationabsen.model.AbsenstamptimeItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface HistoryService {


    @Headers("X-Api-Key:7CEA5BD21C9B664D78E37276C91FAB02")
    @GET("api/AbsenStampTime/all")
    fun fetchAllStamp():Call<AbsenstamptimeItem>




}