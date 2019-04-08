package com.katrinaking.practicepro

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class ToolsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tools)


        val btnTunerActivity: Button = findViewById(R.id.button7)
        btnTunerActivity.setOnClickListener {
            val intent = Intent(this, TunerActivity::class.java)
            startActivity(intent)
        }

        val btnMetronomeActivity: Button = findViewById(R.id.button8)
        btnMetronomeActivity.setOnClickListener {
            val intent = Intent(this, ToolsActivity::class.java)
            startActivity(intent)
        }

    }
}