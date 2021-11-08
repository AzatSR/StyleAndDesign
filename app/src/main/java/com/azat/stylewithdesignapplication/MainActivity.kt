package com.azat.stylewithdesignapplication

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textViewTelega:TextView
    private lateinit var textViewVk:TextView
    private lateinit var textViewInsta:TextView
    private lateinit var textViewFacebook:TextView
    private lateinit var textViewWhatsapp:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewTelega = findViewById(R.id.text_view_telega)
        textViewVk = findViewById(R.id.text_view_vk)
        textViewInsta = findViewById(R.id.text_view_insta)
        textViewFacebook = findViewById(R.id.text_view_facebook)
        textViewWhatsapp = findViewById(R.id.text_view_whatsapp)


    }
}

