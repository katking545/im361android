package com.katrinaking.practicepro

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class PracticeFinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practicefinish)


        val btnPracticeDashActivity: Button = findViewById(R.id.button9)
        btnPracticeDashActivity.setOnClickListener {
            val intent = Intent(this, DashActivity::class.java)
            startActivity(intent)
        }

    }
}