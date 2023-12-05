package com.thirdandroid.forthhw

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class Tape3Activity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tape3)

        var btnReturn12 = findViewById<Button>(R.id.btnclose12)
        btnReturn12.setOnClickListener {
            finish()
        }
    }
}