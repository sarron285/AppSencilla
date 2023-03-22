package com.example.appsencilla

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SaludoActivity : AppCompatActivity () {

    private lateinit var textoSaludo : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludos)

        textoSaludo = findViewById(R.id.txtSaludo)
        val saludo = intent.getStringExtra("NOMBRE")

        textoSaludo.text = "Hola $saludo"

    }
}