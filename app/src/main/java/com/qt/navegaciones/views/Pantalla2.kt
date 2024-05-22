package com.qt.navegaciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.qt.navegaciones.databinding.ActivityPantalla2Binding
import com.qt.navegaciones.models.Globals
import com.qt.navegaciones.models.database.entities.PersonEntity

class Pantalla2 : AppCompatActivity(), View.OnClickListener {
     lateinit var binding : ActivityPantalla2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantalla2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var intent = intent
 binding.btnAceptar.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btnAceptar -> {
                var personEntity = PersonEntity()
                personEntity.email = binding.txtEmail.text.toString()
                personEntity.name = binding.txtNamePerson.text.toString()
                personEntity.phone = binding.txtPhoneNumber.text.toString()
                personEntity.surname = binding.txtSurnamePeron.text.toString()
                personEntity.url = binding.txtUrl.text.toString()
                Globals.getdataBase(this)?.personDao()?.insertPerson(personEntity)
                Toast.makeText(this, "Se ha agregado una persona", Toast.LENGTH_LONG).show()
                clearFields()
            }
        }

    }

    private fun clearFields() {
        binding.txtNamePerson.setText("")
        binding.txtSurnamePeron.setText("")
        binding.txtPhoneNumber.setText("")
        binding.txtEmail.setText("")
        binding.txtUrl.setText("")
    }
}


