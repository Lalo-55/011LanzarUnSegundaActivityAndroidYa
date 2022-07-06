package com.luismorales17106494.a011_lanzarunsegundaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.luismorales17106494.a011_lanzarunsegundaactivity.databinding.ActivitySegundaBinding

/*
Problema propuesto para resolver
Realizar un programa que contenga dos Activity. En el primero que solicite el ingreso de una
clave (control Password) Si ingresa la clave "abc123" activar el segundo Activity mostrando en
un TextView un mensaje de bienvenida (mostrar en Toast si se ingresa la clave incorrecta en el
primer Activity).
 */


class SegundaActivity : AppCompatActivity() {
    private lateinit var _binding: ActivitySegundaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySegundaBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        val contraseña = "abc123"

        val miIntent = Intent(
            this,
            TercerActivity::class.java
        )
        _binding.btVerificar.setOnClickListener() {
            if (_binding.editTextTextPassword.text.toString() == contraseña) {
                startActivity(miIntent)
            } else {
                Toast.makeText(
                    this, "Contraseña incorrecta",
                    Toast.LENGTH_SHORT
                ).show()
            }


        }

        _binding.btSalir.setOnClickListener() {
            finish()
        }


    }
}