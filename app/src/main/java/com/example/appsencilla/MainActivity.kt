package com.example.appsencilla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

   private lateinit var textoNombre : EditText
   private lateinit var btnAceptar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        textoNombre = findViewById(R.id.txtNombre)
        btnAceptar = findViewById(R.id.btnAceptar)

        btnAceptar.setOnClickListener {

            val intent = Intent(this@MainActivity, SaludoActivity::class.java)

            intent.putExtra("NOMBRE", textoNombre.text.toString())

            startActivity(intent)
        }

    }
}