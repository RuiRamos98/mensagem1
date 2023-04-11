package com.example.mensagem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEnviar=findViewById<Button>(R.id.buttonEnviar)
        buttonEnviar.setOnClickListener { enviaMensagem() }
    }

    private fun enviaMensagem() {
        // CÓDIGO PARA TESTAR SE O BOTÃO ESTÁ A FUNCIONAR Toast.makeText(this, "Enviar Mensagem", Toast.LENGTH_SHORT).show()

        val editTextMensagem=findViewById<EditText>(R.id.editTextMensagem)
        val mensagem=editTextMensagem.text.toString()

        val intent=Intent(this,mostraMensagemActivity::class.java)
        startActivity(intent)
    }
}