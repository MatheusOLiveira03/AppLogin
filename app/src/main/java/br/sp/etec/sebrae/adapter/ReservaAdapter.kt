package br.sp.etec.sebrae.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.sp.etec.sebrae.R
import br.sp.etec.sebrae.model.Reserva

class ReservaAdapter(private val reservas: List<Reserva>) :
    RecyclerView.Adapter<ReservaAdapter.ReservaViewHolder>() {

    class ReservaViewHolder(itemView: android.view.View) : RecyclerView.ViewHolder(itemView) {
        val nome: android.widget.TextView = itemView.findViewById(R.id.txtNomeReserva)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReservaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_reserva, parent, false)
        return ReservaViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReservaViewHolder, position: Int) {
        holder.nome.text = reservas[position].nome
    }

    override fun getItemCount(): Int = reservas.size
}