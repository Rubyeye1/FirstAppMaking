package com.thirdandroid.forthhw

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class SecondActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)

        var btnReturn1 = findViewById<Button>(R.id.btnclose1)
        var btnNewActivity3 = findViewById<Button>(R.id.btnthird)


        btnNewActivity3.setOnClickListener{
            var intent3 = Intent(applicationContext, thirdActivity::class.java)
            startActivity(intent3)
        }

        btnReturn1.setOnClickListener{
            finish()
        }




    }
}