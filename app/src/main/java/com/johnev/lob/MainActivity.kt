package com.johnev.lob

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.johnev.lob.ui.BroccoliApp
import com.johnev.lob.ui.theme.BroccoliTheme

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BroccoliTheme {
                BroccoliApp()
            }
        }
    }
}