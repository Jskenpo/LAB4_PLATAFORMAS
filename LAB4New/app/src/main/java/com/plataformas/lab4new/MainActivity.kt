package com.plataformas.lab4new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var toastmsg: Button
    lateinit var descarga: Button
    lateinit var maps: ImageView
    lateinit var deti: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toastmsg = findViewById(R.id.boton)
        descarga = findViewById(R.id.descarga)
        maps = findViewById(R.id.imagen)
        deti = findViewById(R.id.det)
        initlisteners()
    }
    private fun initlisteners(){
        toastmsg.setOnClickListener {
            Toast.makeText(this, "José Pablo Santisteban Vargas", Toast.LENGTH_LONG).show()
        }

        maps.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://goo.gl/maps/X1wcz2VCDFDzmBV59"))
            startActivity(intent)
        }

        descarga.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://play.google.com/store/apps/details?id=com.kitkagames.fallbuddies&hl=es"))
            startActivity(intent)
        }

        deti.setOnClickListener {
            val intent = Intent(this, PermisosActivity::class.java)
            startActivity(intent)
        }
    }

    


}