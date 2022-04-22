package com.example.applicationabsen.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HistoryResponse(

	@field:SerializedName("total")
	val total: Int? = null,

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
) : Parcelable

@Parcelize
data class Data(

	@field:SerializedName("absenstamptime")
	val absenstamptime: List<AbsenstamptimeItem?>? = null
) : Parcelable

@Parcelize
data class AbsenstamptimeItem(

	@field:SerializedName("tanggalMasuk")
	val tanggalMasuk: String? = null,

	@field:SerializedName("idStamp")
	val idStamp: String? = null,

	@field:SerializedName("dataFoto")
	val dataFoto: String? = null,

	@field:SerializedName("tanggalKeluar")
	val tanggalKeluar: String? = null,

	@field:SerializedName("lokasiGps")
	val lokasiGps: String? = null,

	@field:SerializedName("username")
	val username: String? = null
) : Parcelable
