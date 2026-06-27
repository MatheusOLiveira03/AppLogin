package br.sp.etec.sebrae

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import br.sp.etec.sebrae.adapter.ContatoAdapter
import br.sp.etec.sebrae.model.Contato

class ContatosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contatos)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbarContatos)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recycler = findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.recyclerContatos)
        recycler.layoutManager = LinearLayoutManager(this)

        val contatos = listOf(
            Contato("José da Silva", "(11) 99999-1111", "Síndico"),
            Contato("Maria Oliveira", "(11) 99999-2222", "Zeladora"),
            Contato("Carlos Santos", "(11) 99999-3333", "Porteiro"),
            Contato("Ana Paula", "(11) 99999-4444", "Administradora")
        )
        recycler.adapter = ContatoAdapter(contatos)
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