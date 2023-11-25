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
        var btnNewActivity4 = findViewById<Button>(R.id.btnSecond)


        btnNewActivity4.setOnClickListener{
            var intent4 = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent4)
        }

        btnReturn2.setOnClickListener{
            finish()
        }


    }
}