package com.qt.navegaciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.qt.navegaciones.adapters.PersonAdapter
import com.qt.navegaciones.databinding.ActivityPantalla3Binding
import com.qt.navegaciones.models.Globals
import com.qt.navegaciones.models.Persons
import com.qt.navegaciones.models.database.entities.PersonEntity

class Pantalla3 : AppCompatActivity() {

   lateinit var binding: ActivityPantalla3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantalla3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var persons : Persons = Persons(Globals.getdataBase(this)?.personDao()?.getAllPersons()!! as ArrayList<PersonEntity>)
        var adapter : PersonAdapter = PersonAdapter(this, persons)
        binding.lstPersonas.adapter = adapter
        Toast.makeText(this, Globals.listaPeronas.persons.size.toString(), Toast.LENGTH_LONG).show()


    }
}