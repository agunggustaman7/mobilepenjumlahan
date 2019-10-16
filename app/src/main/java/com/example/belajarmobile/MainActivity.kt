package com.example.belajarmobile

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.content.Context
import kotlinx.android.synthetic.main.*
import android.os.Bundle
import kotlinx.android.synthetic.main.dashboard.*
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import kotlinx.android.synthetic.main.activity_second.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        btn_jumlah.setOnClickListener {
            if (text1.text.toString().isEmpty() || text2.text.toString().isEmpty()) {
                text1.setError("isi semua angka")
            } else {
                val a = text1.text.toString().toDouble()
                val b = text2.text.toString().toDouble()
                val c = tambah(a, b)


                val intent = Intent(MainActivity@ this, Second::class.java)
                intent.putExtra("Hasil", c)
                startActivity(intent)
            }
        }
    }
}
    fun tambah(a: Double, b: Double): Double {
        return a + b
    }

//    fun getContext(): Context{
//        return this
//    }
