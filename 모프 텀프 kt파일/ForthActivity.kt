package com.thirdandroid.forthhw

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class ForthActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forth)

        var btnReturn3 = findViewById<Button>(R.id.btnclose3)
        var btnNewActivity10 = findViewById<Button>(R.id.Tapebtn1)
        var btnNewActivity11 = findViewById<Button>(R.id.Tapebtn2)
        var btnNewActivity12 = findViewById<Button>(R.id.Tapebtn3)
        btnReturn3.setOnClickListener {
            finish()
        }
        btnNewActivity10.setOnClickListener {
            var intent10 = Intent(applicationContext, Tape1Activity::class.java)
            startActivity(intent10)
        }
        btnNewActivity11.setOnClickListener {
            var intent11 = Intent(applicationContext, Tape2Activity::class.java)
            startActivity(intent11)
        }
        btnNewActivity12.setOnClickListener {
            var intent12 = Intent(applicationContext, Tape3Activity::class.java)
            startActivity(intent12)
        }
    }
}