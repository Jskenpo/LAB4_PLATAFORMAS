package com.plataformas.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class AppActivity : AppCompatActivity() {

    lateinit var toastmsg: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)
        toastmsg = findViewById(R.id.boton)

        toastmsg.setOnClickListener {
            Toast.makeText(this, "José Pablo Santisteban Vargas", Toast.LENGTH_LONG).show()
        }
    }
}