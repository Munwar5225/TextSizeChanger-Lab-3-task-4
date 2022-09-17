package com.example.textsizechanger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)
        val text : TextView = findViewById(R.id.name)
        var size = 14f
        button.setOnClickListener {
            if(size<72){
                size+=2
                text.setTextSize(TypedValue.COMPLEX_UNIT_SP, size)
            }
            else
            {
                Toast.makeText(this, "Maximum size reached", Toast.LENGTH_LONG).show()
            }
        }
        button2.setOnClickListener {
            if(size>2){
                size-=2
                text.setTextSize(TypedValue.COMPLEX_UNIT_SP, size)
            }
            else
            {
                Toast.makeText(this, "Minimum size reached", Toast.LENGTH_LONG).show()
            }
        }
    }
}