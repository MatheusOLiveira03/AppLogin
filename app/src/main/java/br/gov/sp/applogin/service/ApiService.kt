package br.gov.sp.applogin.service

import br.gov.sp.applogin.model.Usuario

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST(value = "/cadastro")
    fun cadastrarUsuario(
        @Body    usuario : Usuario
    ): Call<Usuario>
}