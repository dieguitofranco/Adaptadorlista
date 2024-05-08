package com.qt.navegaciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.qt.navegaciones.adapters.PersonAdapter
import com.qt.navegaciones.databinding.ActivityPantalla3Binding
import com.qt.navegaciones.models.Globals

class Pantalla3 : AppCompatActivity() {

   lateinit var binding: ActivityPantalla3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantalla3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var adapter : PersonAdapter = PersonAdapter(this, Globals.listaPeronas)
        binding.lstPersonas.adapter = adapter
        Toast.makeText(this, Globals.listaPeronas.persons.size.toString(), Toast.LENGTH_LONG).show()


    }
}