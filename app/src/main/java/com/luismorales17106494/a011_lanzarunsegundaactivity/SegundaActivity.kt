package com.luismorales17106494.a011_lanzarunsegundaactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.luismorales17106494.a011_lanzarunsegundaactivity.databinding.ActivitySegundaBinding

class SegundaActivity : AppCompatActivity() {
    private lateinit var _binding: ActivitySegundaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySegundaBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        _binding.btSalir.setOnClickListener(){
            finish()
        }


    }
}