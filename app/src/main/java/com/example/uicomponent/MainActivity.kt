package com.example.uicomponent

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgBtn = findViewById<ImageButton>(R.id.addbutton)
        imgBtn.setOnClickListener{
            Toast.makeText(Context: this@MainActivity,text: "Berhasil",Toast.length_long).show()
        }
    }
}