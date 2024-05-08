package com.qt.navegaciones.models

class Person {
    var name: String = ""
    var surname: String = ""
    var phone: String = ""
    var email: String = ""
    var url : String = ""

    constructor(name: String, surname: String, phone: String, email: String, url: String) {
        this.name = name
        this.surname = surname
        this.phone = phone
        this.email = email
        this.url = url
    }

    fun getFullName(): String {
        return "$name $surname"
    }

}