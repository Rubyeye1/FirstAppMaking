package com.thirdandroid.forthhw

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class Cd1Activity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cd1)
        var btnReturn7 = findViewById<Button>(R.id.btnclose7)
        btnReturn7.setOnClickListener {
            finish()
        }
    }
}