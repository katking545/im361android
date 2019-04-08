package com.katrinaking.practicepro

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class PracticeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice)


        val btnFinishPracticeActivity: Button = findViewById(R.id.button13)
        btnFinishPracticeActivity.setOnClickListener {
            val intent = Intent(this, PracticeFinishActivity::class.java)
            startActivity(intent)
        }





    }







}