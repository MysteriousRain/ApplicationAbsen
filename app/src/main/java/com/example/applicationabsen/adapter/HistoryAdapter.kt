package com.example.applicationabsen.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.applicationabsen.R
import com.example.applicationabsen.model.AbsenstamptimeItem
import com.example.applicationabsen.model.HistoryResponse
import com.example.applicationabsen.model.LoginResponse
import com.example.applicationabsen.service.RetrofitConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HistoryAdapter(val data:ArrayList<HistoryResponse>): RecyclerView.Adapter<HistoryViewHolder>() {
    lateinit var parent: ViewGroup
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        this.parent = parent

        return HistoryViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_holder,parent,false))
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int ) {
        holder.bindData(this@HistoryAdapter,position)

        RetrofitConfig().fetchDataStamp().fetchAllStamp().enqueue(object :Callback<AbsenstamptimeItem>{
            override fun onResponse(
                call: Call<AbsenstamptimeItem>,
                response: Response<AbsenstamptimeItem>
            ) {
                Toast.makeText(this@HistoryAdapter,(response.body() as HistoryResponse).message, Toast.LENGTH_LONG).show()
            }

            override fun onFailure(call: Call<AbsenstamptimeItem>, t: Throwable) {
                Log.e("error request",t.localizedMessage.toString())
            }

        })
    }

    override fun getItemCount(): Int {
        return data.size
    }
}