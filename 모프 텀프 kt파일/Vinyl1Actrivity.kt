package com.thirdandroid.forthhw

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class Vinyl1Actrivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vinyl1)

        var btnReturn4 = findViewById<Button>(R.id.btnclose4)
        btnReturn4.setOnClickListener{
            finish()
        }

    }
}