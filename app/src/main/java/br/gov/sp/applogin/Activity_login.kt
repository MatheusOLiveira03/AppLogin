package br.gov.sp.applogin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.gov.sp.applogin.model.Usuario
import br.gov.sp.applogin.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Activity_login : AppCompatActivity() {
    val apiService = ApiClient.instance
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var nome = findViewById<EditText>(R.id.editTextNome)
        var email = findViewById<EditText>(R.id.editTextemail)
        var cpf = findViewById<EditText>(R.id.editTextCPF)
        var telefone = findViewById<EditText>(R.id.editTextTelefone)
        var senha = findViewById<EditText>(R.id.editTextPassword1)
        var confirmeSenha = findViewById<EditText>(R.id.editTextPassword2)
        var btnCadastro = findViewById<Button>(R.id.button6)

        btnCadastro .setOnClickListener{
            var usuario = Usuario(
                nome = nome.text.toString(),
                email = email.text.toString(),
                cpf = cpf.text.toString(),
                telefone = telefone.text.toString(),
                senha = senha.text.toString()
            )
            cadastroUsuario(usuario)
        }

    }
    fun cadastroUsuario(usuario: Usuario) {
        apiService.cadastrarUsuario(usuario).enqueue(
            object : Callback<Usuario> {
                override fun onResponse(
                    call: Call<Usuario?>, response: Response<Usuario?>
                ) {
                    if (response.isSuccessful) {
                        println(
                            Toast.makeText(
                                this@Activity_login, "Cadastro realizado com sucesso",
                                Toast.LENGTH_LONG).show()
                            )

                    }
                }

                override fun onFailure(call: Call<Usuario?>, t: Throwable) {
                    Toast.makeText(this@Activity_login, t.message, Toast.LENGTH_LONG).show()
                }

            })

    }}
