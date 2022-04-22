package com.example.applicationabsen.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class UserRequest (

    @field:SerializedName("username")
    var username:String? = null,

    @field:SerializedName("password")
    var password:String? = null

):Parcelable
