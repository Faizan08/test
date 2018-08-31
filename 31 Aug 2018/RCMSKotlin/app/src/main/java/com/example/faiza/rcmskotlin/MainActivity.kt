package com.example.faiza.rcmskotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        VolunteerId.setOnClickListener {
            // Handler code here.
            val intent = Intent(this@MainActivity, LogInVolunteer::class.java)
            startActivity(intent);
        }

        TrainerId.setOnClickListener {
            // Handler code here.
            val intent = Intent(this@MainActivity, LogInTrainer::class.java)
            startActivity(intent);
        }

        UserId.setOnClickListener {
            // Handler code here.
            val intent = Intent(this@MainActivity, LogInUser::class.java)
            startActivity(intent);
        }
    }
}
