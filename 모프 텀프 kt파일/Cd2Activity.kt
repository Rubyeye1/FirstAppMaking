package com.thirdandroid.forthhw

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class Cd2Activity:Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cd2)
        var btnReturn8 = findViewById<Button>(R.id.btnclose8)
        btnReturn8.setOnClickListener {
            finish()
        }
    }
}