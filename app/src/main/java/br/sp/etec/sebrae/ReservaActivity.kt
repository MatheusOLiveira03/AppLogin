package br.sp.etec.sebrae

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import br.sp.etec.sebrae.adapter.ReservaAdapter
import br.sp.etec.sebrae.model.Reserva

class ReservaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reserva)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbarReserva)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recycler = findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.recyclerReserva)
        recycler.layoutManager = LinearLayoutManager(this)

        val reservas = listOf(
            Reserva("Academia"),
            Reserva("Brinquedoteca"),
            Reserva("Churrasqueira"),
            Reserva("Salão de festa"),
            Reserva("Salão de jogos")
        )
        recycler.adapter = ReservaAdapter(reservas)
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