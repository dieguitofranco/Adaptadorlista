package com.qt.navegaciones.models

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

class Globals {
    companion object {
       var listaPeronas :Persons = Persons(ArrayList<Person>())


        fun addSharedPreference(context: Context, chapter: String, key: String, value: String ){
            val sharedPreference = context.getSharedPreferences(chapter, AppCompatActivity.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.putString(key, value)
            editor.apply()
        }

        fun getSharedPreference(context: Context,chapter:String, key: String): String? {
            val sharedPreference = context.getSharedPreferences(chapter, AppCompatActivity.MODE_PRIVATE)
            return sharedPreference.getString(key, "")
        }
    }



}