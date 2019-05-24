package com.dilip.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    var username:String=""
    var password:String=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

       /* field.afterTextChanged {
            val content = it.text.toString()
            it.error = if (content.length >= 6) null else "message"
        }
        field.error = if (content.length >= 6) null else "message"*/

        username=ET_Name.text.toString()//for value pass
        password=ET_Password.text.toString()


        BT_Signin.setOnClickListener {
            var Status=if (ET_Name.text.toString().equals("dilip")&& ET_Password.text.toString().equals("12345") )
                "Login Success"
            else
                "Login Failed"
            Toast.makeText(this,Status,Toast.LENGTH_LONG).show()


            username=ET_Name.text.toString()
            password=ET_Password.text.toString()


       /* if (Status.trim().length>0)
        {
            Toast.makeText(applicationContext,"Message : "+Status,Toast.LENGTH_LONG).show()
        }
        else
        {
            Toast.makeText(applicationContext,"Please Enter Some Message!"+Status,Toast.LENGTH_LONG).show()
        }*/

        intent= Intent(this,MainActivity::class.java)
            intent.putExtra("User Name",username)
            startActivity(intent)
        }




    }
}
