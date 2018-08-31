package com.example.faiza.rcmskotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_log_in_trainer.*

class LogInTrainer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in_trainer)

        SignUpId.setOnClickListener {
            // Handler code here.
            val intent = Intent(this@LogInTrainer, RegisterTrainer::class.java)
            startActivity(intent);
        }
    }


}
