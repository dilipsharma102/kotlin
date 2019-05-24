package com.dilip.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        var user:String=intent.getStringExtra("User Name")
        TV_Nameset.setText(user)*/

        var cusername:String=intent.getStringExtra("username")
        TV_cusername.setText(cusername)


        var cpassword:String=intent.getStringExtra("password")
        TV_cpassword.setText(cpassword)

        var cphoneno:String=intent.getStringExtra("phone")
        TV_cphoneno.setText(cphoneno)

    }
}
