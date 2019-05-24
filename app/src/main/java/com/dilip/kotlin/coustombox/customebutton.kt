package com.dilip.kotlin.coustombox

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import com.dilip.kotlin.MainActivity
import com.dilip.kotlin.R
import kotlinx.android.synthetic.main.activity_customebutton.*
import kotlinx.android.synthetic.main.activity_customebutton.view.*
import kotlinx.android.synthetic.main.loginbox.*
import kotlinx.android.synthetic.main.loginbox.view.*

class customebutton : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customebutton)

        BT_Boxbutton.setOnClickListener {
             val mDailogview = LayoutInflater.from(this).inflate(R.layout.loginbox,null)
            val mbuilder = AlertDialog.Builder(this)
                    .setView(mDailogview)
                    .setTitle("Login Form")

            val mAlertDialog = mbuilder.show()

            mDailogview.BT_Login.setOnClickListener {
                mAlertDialog.dismiss()
                val name = mDailogview.ET_Username.text.toString()
                val password = mDailogview.ET_UserPassword.text.toString()
                val phoneno = mDailogview.ET_Phoneno.text.toString()


                intent= Intent(this,MainActivity::class.java)
                intent.putExtra("username",name)
                intent.putExtra("password",password)
                intent.putExtra("phone",phoneno)
                startActivity(intent)



            }

        }
    }
}
