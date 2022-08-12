package com.plataformas.lab4new

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var toastmsg: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toastmsg = findViewById(R.id.boton)
        initlisteners()
    }
    private fun initlisteners(){
        toastmsg.setOnClickListener {
            Toast.makeText(this, "José Pablo Santisteban Vargas", Toast.LENGTH_LONG).show()
        }
    }
}