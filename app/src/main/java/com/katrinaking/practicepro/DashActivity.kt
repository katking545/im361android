package com.katrinaking.practicepro


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class DashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash)

        val myButton: Button = findViewById(R.id.button3)
        myButton.setOnClickListener {
            val intent = Intent(this, CalendarActivity::class.java)
            startActivity(intent)
        }

        val btnStartActivity: Button = findViewById(R.id.button4)
        btnStartActivity.setOnClickListener {
            val intent = Intent(this, PracticeActivity::class.java)
            startActivity(intent)
        }

        val btnLessonActivity: Button = findViewById(R.id.button5)
        btnLessonActivity.setOnClickListener {
            val intent = Intent(this, LessonActivity::class.java)
            startActivity(intent)
        }

        val btnToolsActivity: Button = findViewById(R.id.button6)
        btnToolsActivity.setOnClickListener {
            val intent = Intent(this, ToolsActivity::class.java)
            startActivity(intent)
        }


    }
    }


