package com.thirdandroid.forthhw

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class Cd3Activity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cd3)

        var btnReturn9 = findViewById<Button>(R.id.btnclose9)
        btnReturn9.setOnClickListener {
            finish()
        }
    }
}