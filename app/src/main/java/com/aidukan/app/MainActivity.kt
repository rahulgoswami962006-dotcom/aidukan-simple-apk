package com.aidukan.app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val textView = TextView(this).apply {
            text = "🎉 Aidukan App\n\nVoice Assistant for Kirana Stores\n\nVersion 1.0"
            textSize = 24f
            setPadding(50, 100, 50, 50)
            textAlignment = TextView.TEXT_ALIGNMENT_CENTER
        }
        
        setContentView(textView)
    }
}
