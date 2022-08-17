package com.plataformas.lab4new

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat



class PermisosActivity : AppCompatActivity() {

    lateinit var visita: Button
    lateinit var llamar: TextView
    lateinit var num: TextView
    private val permissionCode = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permisos)
        visita = findViewById(R.id.vista)
        llamar = findViewById(R.id.llamar)
        num = findViewById(R.id.num)
        initlisteners()
    }

    private fun initlisteners() {
        visita.setOnClickListener {
            permisos(android.Manifest.permission.CAMERA, permissionCode)
        }
        llamar.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:${num.text}")
            startActivity(intent)
        }
    }

    fun permisos(permiso:String, codigo:Int){
        if (ActivityCompat.checkSelfPermission(this, permiso) == PackageManager.PERMISSION_DENIED) {
            ActivityCompat.requestPermissions(this, arrayOf(permiso), codigo)
        } else {
            Toast.makeText(this, "Permiso otorgado", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == permissionCode) {
            if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Permiso otorgado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Permiso denegado", Toast.LENGTH_SHORT).show()
            }
        }
    }

}

