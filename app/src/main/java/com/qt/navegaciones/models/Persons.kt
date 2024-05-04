package com.qt.navegaciones.models

class Persons
{
    var persons = ArrayList<Person>()

   constructor(persons: ArrayList<Person>){
       this.persons = persons
   }

    fun getArrayListFullName(): ArrayList<String> {
        var list = ArrayList<String>()
        for (person in persons) {
            list.add(person.getFullName())
        }
        return list
    }
}



