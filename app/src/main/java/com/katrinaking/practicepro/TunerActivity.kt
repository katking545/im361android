package com.katrinaking.practicepro

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class TunerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuner)

    val btnMetroActivity: Button = findViewById(R.id.button40)
    btnMetroActivity.setOnClickListener {
        val intent = Intent(this, ToolsActivity::class.java)
        startActivity(intent)
    }

        val btnTuneActivity: Button = findViewById(R.id.button41)
        btnTuneActivity.setOnClickListener {
            val intent = Intent(this, TunerActivity::class.java)
            startActivity(intent)
        }



    }
}