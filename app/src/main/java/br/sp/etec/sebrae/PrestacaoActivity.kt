package br.sp.etec.sebrae

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import br.sp.etec.sebrae.adapter.ContaAdapter
import br.sp.etec.sebrae.model.Conta

class PrestacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prestacao)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbarPrestacao)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recycler = findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.recyclerContas)
        recycler.layoutManager = LinearLayoutManager(this)

        val contas = listOf(
            Conta("Taxa de Condomínio", 800.00, "Despesa"),
            Conta("Água", 120.50, "Despesa"),
            Conta("Luz", 95.75, "Despesa"),
            Conta("Seguro", 60.00, "Despesa"),
            Conta("Aluguel de salão", 200.00, "Receita"),
            Conta("Contribuição Extra", 300.00, "Receita")
        )
        recycler.adapter = ContaAdapter(contas)
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