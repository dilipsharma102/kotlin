package com.dilip.kotlin.dialogbox

import android.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dilip.kotlin.R
import kotlinx.android.synthetic.main.activity_rating.*

class dialog : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)

        BT_submit.setOnClickListener {
            val builder=AlertDialog.Builder(this)

            builder.setTitle("Delete?")
            builder.setMessage("Do You Want to Delete?")
            builder.setIcon(R.drawable.download)


            builder.setPositiveButton("Yes"){
                dialog,which ->
                Toast.makeText(this,"select Yes",Toast.LENGTH_LONG).show()
            }
            builder.setNegativeButton("No"){
                dialog,which ->
                Toast.makeText(this,"select No",Toast.LENGTH_LONG).show()
            }

            val alertDialog:AlertDialog=builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()

        }
    }
}

