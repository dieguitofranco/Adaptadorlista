package com.qt.navegaciones.models

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.qt.navegaciones.models.database.ProjectDatabase
import com.qt.navegaciones.models.database.entities.PersonEntity

class Globals {
    companion object {
        var listaPeronas :Persons = Persons(ArrayList<PersonEntity>())
        var dataBase : ProjectDatabase ?= null


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

        fun getdataBase(context : Context): ProjectDatabase? {
            if (dataBase == null) {
               initDatabase(context)
            }
            return dataBase
        }

        fun initDatabase(context: Context){
            dataBase =  Room.databaseBuilder(context, ProjectDatabase::class.java, "project_database").allowMainThreadQueries().build()
    }



}}

