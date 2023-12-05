package com.thirdandroid.forthhw

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class Tape2Activity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tape2)

        var btnReturn11 = findViewById<Button>(R.id.btnclose11)
        btnReturn11.setOnClickListener {
            finish()
        }
    }
}