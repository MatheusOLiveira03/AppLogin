package br.sp.etec.sebrae.model

data class Boleto(
    val id: Long,
    val descricao: String,
    val valor: Double,
    val vencimento: String
)

