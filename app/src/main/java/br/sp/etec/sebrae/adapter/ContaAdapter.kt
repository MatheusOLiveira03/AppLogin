package br.sp.etec.sebrae.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.sp.etec.sebrae.R
import br.sp.etec.sebrae.model.Conta

class ContaAdapter(private val contas: List<Conta>) :
    RecyclerView.Adapter<ContaAdapter.ContaViewHolder>() {

    class ContaViewHolder(itemView: android.view.View) : RecyclerView.ViewHolder(itemView) {
        val descricao: android.widget.TextView = itemView.findViewById(R.id.txtDescricaoConta)
        val valor: android.widget.TextView = itemView.findViewById(R.id.txtValorConta)
        val tipo: android.widget.TextView = itemView.findViewById(R.id.txtTipoConta)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_conta, parent, false)
        return ContaViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContaViewHolder, position: Int) {
        val conta = contas[position]
        holder.descricao.text = conta.descricao
        holder.valor.text = "R$ %.2f".format(conta.valor)
        holder.tipo.text = conta.tipo
    }

    override fun getItemCount(): Int = contas.size
}