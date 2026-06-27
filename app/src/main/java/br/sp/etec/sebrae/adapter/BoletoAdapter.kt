package br.sp.etec.sebrae.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.sp.etec.sebrae.R
import br.sp.etec.sebrae.model.Boleto

class BoletoAdapter(private val boletos: List<Boleto>) :
    RecyclerView.Adapter<BoletoAdapter.BoletoViewHolder>() {

    class BoletoViewHolder(itemView: android.view.View) : RecyclerView.ViewHolder(itemView) {
        val taxa: TextView = itemView.findViewById(R.id.txtTitulo)
        val valor: TextView = itemView.findViewById(R.id.txtValor)
        val vencimento: TextView = itemView.findViewById(R.id.txtVencimento)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoletoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_boleto, parent, false)
        return BoletoViewHolder(view)
    }

    override fun onBindViewHolder(holder: BoletoViewHolder, position: Int) {
        val boleto = boletos[position]
        holder.taxa.text = boleto.descricao
        holder.valor.text = "R$ %.2f".format(boleto.valor)
        holder.vencimento.text = boleto.vencimento
    }

    override fun getItemCount(): Int = boletos.size
}