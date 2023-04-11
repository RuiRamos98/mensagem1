package com.example.mensagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEnviar=findViewById<Button>(R.id.buttonEnviar)
        buttonEnviar.setOnClickListener { enviaMensagem() }
    }

    private fun enviaMensagem() {

    }
}