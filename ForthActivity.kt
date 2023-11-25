package com.thirdandroid.forthhw

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class ForthActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forth)

        var btnReturn3 = findViewById<Button>(R.id.btnclose3)
        btnReturn3.setOnClickListener {
            finish()
        }
    }
}