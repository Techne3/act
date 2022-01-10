package com.example.act

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class secondAct: AppCompatActivity() {

    private lateinit var mainBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)

        mainBtn = findViewById(R.id.btnMain)
        mainBtn.text = getString(R.string.second_screen)
    }

}