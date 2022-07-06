package com.luismorales17106494.a011_lanzarunsegundaactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.luismorales17106494.a011_lanzarunsegundaactivity.databinding.ActivityTercerBinding

class TercerActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityTercerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityTercerBinding.inflate(layoutInflater)
        setContentView(_binding.root)


        _binding.btRegresar.setOnClickListener(){
            finish()
        }
    }
}