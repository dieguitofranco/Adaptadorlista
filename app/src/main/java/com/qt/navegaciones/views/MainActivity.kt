package com.qt.navegaciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.qt.navegaciones.databinding.ActivityMainBinding
import com.qt.navegaciones.models.Globals
import com.qt.navegaciones.models.Person

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnScreenOne.setOnClickListener(this)
        binding.btnScreenTwo.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnScreenOne -> {
                val intent = Intent(this, Pantalla2::class.java)
                startActivity(intent)
            }
            R.id.btnScreenTwo -> {
                val intent = Intent(this, Pantalla3::class.java)
                startActivity(intent)
            }
        }
    }
}