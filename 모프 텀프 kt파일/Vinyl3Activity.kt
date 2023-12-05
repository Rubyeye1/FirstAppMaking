package com.thirdandroid.forthhw

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class Vinyl3Activity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vinyl3)

        var btnReturn6 = findViewById<Button>(R.id.btnclose6)
        btnReturn6.setOnClickListener {
            finish()
        }
    }
}