package com.luismorales17106494.a011_lanzarunsegundaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.luismorales17106494.a011_lanzarunsegundaactivity.databinding.ActivityMainBinding

/*
11 - Lanzar un segundo "Activity"
Hasta ahora todos los programas han tenido una sola ventana (Activity)

Es muy común que una aplicación tenga más de una ventana. Para implementar esto en
Android debemos plantear otros dos archivos uno xml con la interfaz y otro *.kt (Kotlin)
con la lógica (tengamos en cuenta que cuando utilizamos Android Studio automáticamente
cuando creamos un proyecto nos crea el archivo XML y el código en Kotlin del primer Activity)

Vamos a ver en este concepto los pasos que debemos dar para crear otro Activity y como
activarlo desde el Activity principal.
 */
/*
Problema:
Confeccionar un programa que muestre en la ventana principal un botón que al ser presionado
muestre otra ventana (Activity) mostrando un TextView con el nombre del programador de la
aplicación y un botón para cerrar la ventana o actividad y que vuelva al primer Activity.
 */

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btDatos.setOnClickListener() {
            val miIntent = Intent(
                this,
                SegundaActivity::class.java)
            startActivity(miIntent)
        }


    }
}