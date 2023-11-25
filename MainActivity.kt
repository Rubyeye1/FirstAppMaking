package com.thirdandroid.forthhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnNewActivity = findViewById<ImageButton>(R.id.LPImage)
        var btnNewActivity2 = findViewById<ImageButton>(R.id.CDimage)
        var btnNewActivity3 = findViewById<ImageButton>(R.id.tapeImage)

        btnNewActivity.setOnClickListener{
            var intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }

        btnNewActivity2.setOnClickListener {
            var intent2 = Intent(applicationContext, thirdActivity::class.java)
            startActivity(intent2)
        }

        btnNewActivity3.setOnClickListener {
            var intent3 = Intent(applicationContext, ForthActivity::class.java)
            startActivity(intent3)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        val minflater = menuInflater
        minflater.inflate(R.menu.menu_option, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.LPm -> {
                var intent = Intent(applicationContext, SecondActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.CDm -> {
                var intent2 = Intent(applicationContext, thirdActivity::class.java)
                startActivity(intent2)
                return true
            }
            R.id.TAPEm -> {
                var intent3 = Intent(applicationContext, ForthActivity::class.java)
                startActivity(intent3)
                return true
            }
            else -> return false
        }
    }

}