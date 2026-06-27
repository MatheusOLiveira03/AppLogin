package br.sp.etec.sebrae.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.sp.etec.sebrae.R
import br.sp.etec.sebrae.model.Contato

class ContatoAdapter(private val contatos: List<Contato>) :
    RecyclerView.Adapter<ContatoAdapter.ContatoViewHolder>() {

    class ContatoViewHolder(itemView: android.view.View) : RecyclerView.ViewHolder(itemView) {
        val nome: android.widget.TextView = itemView.findViewById(R.id.txtNomeContato)
        val funcao: android.widget.TextView = itemView.findViewById(R.id.txtFuncaoContato)
        val telefone: android.widget.TextView = itemView.findViewById(R.id.txtTelefoneContato)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contato, parent, false)
        return ContatoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContatoViewHolder, position: Int) {
        val contato = contatos[position]
        holder.nome.text = contato.nome
        holder.funcao.text = contato.funcao
        holder.telefone.text = contato.telefone
    }

    override fun getItemCount(): Int = contatos.size
}