package com.katrinaking.practicepro

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val myButton: Button = findViewById(R.id.button2)
        myButton.setOnClickListener {
            val intent = Intent(this, DashActivity::class.java)
            startActivity(intent)
        }


    }
}