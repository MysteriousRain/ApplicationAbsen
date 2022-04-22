package com.example.applicationabsen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.applicationabsen.model.UserRequest
import com.example.applicationabsen.model.UserResponse
import com.example.applicationabsen.service.RetrofitConfig
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initAction()

    }

    fun initAction(){
        btnLogin.setOnClickListener({
                login()
        })
    }

    fun login(){
        val request = UserRequest()
        request.username = loginEditFieldUsername.toString().trim()
        request.password = loginEditFieldPassword.toString().trim()

        val retro = RetrofitConfig().getLogin().getAllLogin(request).enqueue(object :Callback<UserResponse>{
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                Toast.makeText(this@MainActivity,(response.body() as UserResponse).message,Toast.LENGTH_LONG).show()
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                Log.e("error post data",t.localizedMessage.toString())
            }

        })
    }

}