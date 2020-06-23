package com.ds.jsonparser

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_100_kb.setOnClickListener {
            GsonModel.from(this, R.raw.mock_100_kb)
        }

        btn_500_kb.setOnClickListener {
            GsonModel.from(this, R.raw.mock_500_kb)
        }

        btn_1_mb.setOnClickListener {
            GsonModel.from(this, R.raw.mock_1_mb)
        }

        btn_2_mb.setOnClickListener {
            GsonModel.from(this, R.raw.mock_2_mb)
        }

        btn_4_mb.setOnClickListener {
            GsonModel.from(this, R.raw.mock_4_mb)
        }

        btn_8_mb.setOnClickListener {
            GsonModel.from(this, R.raw.mock_8_mb)
        }
    }
}