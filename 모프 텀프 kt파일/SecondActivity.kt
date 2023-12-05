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
        var btnNewActivity4 = findViewById<Button>(R.id.Vinylbtn1)
        var btnNewActivity5 = findViewById<Button>(R.id.Vinylbtn2)
        var btnNewActivity6 = findViewById<Button>(R.id.Vinylbtn3)
        btnNewActivity4.setOnClickListener {
            var intent4 = Intent(applicationContext, Vinyl1Actrivity::class.java)
            startActivity(intent4)
        }
        btnNewActivity5.setOnClickListener {
            var intent5 = Intent(applicationContext, Vinyl2Activity::class.java)
            startActivity(intent5)
        }
        btnNewActivity6.setOnClickListener {
            var intent6 = Intent(applicationContext, Vinyl3Activity::class.java)
            startActivity(intent6)
        }
        btnReturn1.setOnClickListener{
            finish()
        }




    }
}