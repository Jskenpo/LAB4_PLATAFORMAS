package com.plataformas.lab4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var buttonNextActivity: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonNextActivity = findViewById(R.id.btn_mainActivity_toNextActivity)

        initListeners()
    }

    fun initListeners(){
        buttonNextActivity.setOnClickListener {
            val intent = Intent(this, AppActivity::class.java)
            startActivity(intent)
        }
    }
}