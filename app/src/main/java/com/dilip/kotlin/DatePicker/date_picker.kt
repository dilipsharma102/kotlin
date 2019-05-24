package com.dilip.kotlin.DatePicker

import android.app.DatePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import com.dilip.kotlin.R
import kotlinx.android.synthetic.main.activity_date_picker.*
import java.util.*

class date_picker : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        BT_DatePicker.setOnClickListener {
            var Cal = Calendar.getInstance()
            var year = Cal.get(Calendar.YEAR)
            var month = Cal.get(Calendar.MONTH)
            var day = Cal.get(Calendar.DAY_OF_MONTH)

            val date:DatePickerDialog= DatePickerDialog(this,DatePickerDialog.OnDateSetListener{
                View, year,month,dayOfMonth ->
                val month=month+1
                TV_Date.setText(""+dayOfMonth+"/"+month+"/"+year)
            },year,month,day)
            date.show()
        }
    }
}
