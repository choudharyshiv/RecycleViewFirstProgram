package com.zopsmart.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SpecificFlowerActivity : AppCompatActivity() {

    private lateinit var textView : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_specific_flower)

        textView = findViewById(R.id.specificFlowerTextView)

        if(intent != null)
        {
            //get flower name from intent
            var flowerName = intent.getStringExtra("flowerName")
            textView.text = "My nam is : "+flowerName
        }
    }
}