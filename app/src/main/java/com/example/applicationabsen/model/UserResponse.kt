package com.example.applicationabsen.model

import android.os.Parcelable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserResponse (
        @field:SerializedName("message")
        val message: String? = null,

        @field:SerializedName("status")
        val status: Boolean? = null
):Parcelable