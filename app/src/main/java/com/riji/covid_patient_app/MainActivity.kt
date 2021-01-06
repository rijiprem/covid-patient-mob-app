package com.riji.covid_patient_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submit(view: View) {
        var getPatientName=findViewById<EditText>(R.id.pname);
        var getAddress=findViewById<EditText>(R.id.address);
        var getPhoneNumber=findViewById<EditText>(R.id.pnum);
        var getEmailId=findViewById<EditText>(R.id.email);
        var getSymptoms=findViewById<EditText>(R.id.symptoms);
        Toast.makeText(this,getPatientName.text.toString()+"  "
                +getAddress.text.toString()+"  "+getPhoneNumber.text.toString()+
                "  "+getEmailId.text.toString()+"  "+getSymptoms.text.toString()
                ,Toast.LENGTH_LONG).show();
    }
    fun backtohome(view: View) {
        Toast.makeText(this,"back to home",Toast.LENGTH_LONG).show();
    }
}