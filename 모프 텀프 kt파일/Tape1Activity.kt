package com.thirdandroid.forthhw

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class Tape1Activity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tape1)

        var btnReturn10 = findViewById<Button>(R.id.btnclose10)
        btnReturn10.setOnClickListener {
            finish()
        }
    }
}