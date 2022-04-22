package com.example.applicationabsen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_menu.*

class MainMenuActivity : AppCompatActivity() {

    var checkInStatus:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        if(checkInStatus == true){

            txtCheckin.setText("CHECK OUT")
        }else{
            txtCheckin.setText("CHECK IN")
        }

        historyCardView.setOnClickListener({
            val intent = Intent(this@MainMenuActivity, HistoryActivity::class.java)
            startActivity(intent)
        })
    }
}