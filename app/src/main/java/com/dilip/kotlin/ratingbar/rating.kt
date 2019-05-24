package com.dilip.kotlin.ratingbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dilip.kotlin.R
import kotlinx.android.synthetic.main.activity_rating.*

class rating : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)

        if(RB_Ratingbar!=null)


            BT_submit.setOnClickListener {
                val rate=RB_Ratingbar.rating.toString()
                Toast.makeText(this,rate,Toast.LENGTH_LONG).show()
            }
    }
}
