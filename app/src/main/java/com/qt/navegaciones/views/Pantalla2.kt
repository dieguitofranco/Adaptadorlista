package com.qt.navegaciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.qt.navegaciones.databinding.ActivityPantalla2Binding
import com.qt.navegaciones.models.Globals
import com.qt.navegaciones.models.Person

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
                var person = Person(
                    binding.txtNamePerson.text.toString(),
                    binding.txtSurnamePeron.text.toString(),
                    binding.txtPhoneNumber.text.toString(),
                    binding.txtEmail.text.toString(),
                    binding.txtUrl.text.toString()
                )
                Globals.listaPeronas.persons.add(person)
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


