package br.sp.etec.sebrae

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import br.sp.etec.sebrae.adapter.BoletoAdapter
import br.sp.etec.sebrae.model.Boleto

class BoletoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boleto)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbarBoleto)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recycler = findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.recyclerBoleto)
        recycler.layoutManager = LinearLayoutManager(this)

        val boletos = listOf(
            Boleto(1, "Taxa Condominio Abril", 1000.0, "30/05/2026"),
            Boleto(2, "Taxa Condominio Maio", 950.0, "30/06/2026"),
            Boleto(3, "Taxa Condominio Junho", 750.0, "30/07/2026"),
            Boleto(4, "Taxa Condominio Julho", 2000.0, "30/08/2026"),
            Boleto(5, "Taxa Condominio Agosto", 1500.0, "30/09/2026")
        )
        recycler.adapter = BoletoAdapter(boletos)
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