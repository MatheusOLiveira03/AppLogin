package br.sp.etec.sebrae

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AutorizacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autorizacao)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbarAutorizacao)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val btnAutorizar = findViewById<android.widget.Button>(R.id.btnAutorizar)
        btnAutorizar.setOnClickListener {
            val nome = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.editNome).text.toString().trim()
            val documento = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.editDocumento).text.toString().trim()
            val apartamento = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.editApartamento).text.toString().trim()

            if (nome.isEmpty() || documento.isEmpty() || apartamento.isEmpty()) {
                Toast.makeText(this, "Dados obrigatórios não preenchidos", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Autorização realizada", Toast.LENGTH_LONG).show()
                // Aqui você pode chamar a API depois
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}