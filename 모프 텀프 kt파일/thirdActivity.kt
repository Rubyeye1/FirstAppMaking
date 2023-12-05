package com.thirdandroid.forthhw

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class thirdActivity : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third)

        var btnReturn2 = findViewById<Button>(R.id.btnclose2)
        var btnNewActivity7 = findViewById<Button>(R.id.Cdbtn1)
        var btnNewActivity8 = findViewById<Button>(R.id.Cdbtn2)
        var btnNewActivity9 = findViewById<Button>(R.id.Cdbtn3)
        btnNewActivity7.setOnClickListener {
            var intent7 = Intent(applicationContext, Cd1Activity::class.java)
            startActivity(intent7)
        }
        btnNewActivity8.setOnClickListener {
            var intent8 = Intent(applicationContext, Cd2Activity::class.java)
            startActivity(intent8)
        }
        btnNewActivity9.setOnClickListener {
            var intent9 = Intent(applicationContext, Cd3Activity::class.java)
            startActivity(intent9)
        }

        btnReturn2.setOnClickListener{
            finish()
        }


    }
}