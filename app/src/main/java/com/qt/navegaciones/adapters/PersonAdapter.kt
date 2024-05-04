package com.qt.navegaciones.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.qt.navegaciones.R
import com.qt.navegaciones.models.Persons

class PersonAdapter : BaseAdapter{
    var context : Context
    var persons : Persons

    constructor(context : Context, persons: Persons){
        this.context = context
        this.persons = persons
    }

    override fun getCount(): Int {
        return persons.persons.size
    }

    override fun getItem(p0: Int): Any {
        return persons.persons[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View? {
       var view : View? = p1
        if (view == null){
           view = View.inflate(context, R.layout.item_adapter, null)
      }
        var person = persons.persons[p0]
        var txtName = view?.findViewById<TextView>(R.id.txtFullName)
        txtName?.text = person.getFullName()
        var txtPhone = view?.findViewById<TextView>(R.id.txtItemPhone)
        txtPhone?.text = person.phone
        var txtEmail = view?.findViewById<TextView>(R.id.txtItemEmail)
        txtEmail?.text = person.email
    return view

    }

}