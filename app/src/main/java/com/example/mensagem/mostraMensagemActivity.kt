package com.example.mensagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class mostraMensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_mensagem)

        val mensagem=intent.getStringExtra("mensagem")

        val textViewMostraMensagemRecebida=findViewById<TextView>(R.id.textViewMostraMensagemRecebida)
        textViewMostraMensagemRecebida.text=mensagem
    }
}