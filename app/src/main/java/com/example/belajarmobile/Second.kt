package com.example.belajarmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class Second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val getText:String = intent.getDoubleExtra("Hasil", 0.0).toString()
        ethasil.setText(getText)

        ivBack.setOnClickListener{

            val intent = Intent(Second@ this, MainActivity :: class.java)
            startActivity(intent)
        }

    }
}
