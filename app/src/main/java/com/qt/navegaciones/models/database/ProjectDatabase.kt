package com.qt.navegaciones.models.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.qt.navegaciones.models.database.dao.PersonDao
import com.qt.navegaciones.models.database.entities.PersonEntity

@Database(entities = arrayOf(PersonEntity::class), version = 1)
abstract class ProjectDatabase : RoomDatabase(){
   abstract fun personDao(): PersonDao
}