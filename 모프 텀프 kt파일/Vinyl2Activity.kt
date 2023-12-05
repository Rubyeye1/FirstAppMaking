package com.thirdandroid.forthhw

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class Vinyl2Activity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vinyl2)

        var btnReturn5 = findViewById<Button>(R.id.btnclose5)
        btnReturn5.setOnClickListener {
            finish()
        }
    }
}