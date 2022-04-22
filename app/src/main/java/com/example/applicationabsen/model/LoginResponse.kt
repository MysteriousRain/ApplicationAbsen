package com.example.applicationabsen.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LoginResponse(
	val total: Int? = null,
	val data: Data? = null,
	val message: String? = null,
	val status: Boolean? = null
) : Parcelable

@Parcelize
data class Data(
	val absen: List<AbsenItem?>? = null
) : Parcelable

@Parcelize
data class AbsenItem(
	val idUser: String? = null,
	val password: String? = null,
	val username: String? = null
) : Parcelable
