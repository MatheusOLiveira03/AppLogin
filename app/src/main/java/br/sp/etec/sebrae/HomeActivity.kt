package br.sp.etec.sebrae

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.btnBoleto).setOnClickListener {
            startActivity(Intent(this, BoletoActivity::class.java))
        }
        findViewById<Button>(R.id.btnReservas).setOnClickListener {
            startActivity(Intent(this, ReservaActivity::class.java))
        }
        findViewById<Button>(R.id.btnAutorizacao).setOnClickListener {
            startActivity(Intent(this, AutorizacaoActivity::class.java))
        }
        findViewById<Button>(R.id.btnComunicados).setOnClickListener {
            startActivity(Intent(this, ComunicadosActivity::class.java))
        }
        findViewById<Button>(R.id.btnPrestacao).setOnClickListener {
            startActivity(Intent(this, PrestacaoActivity::class.java))
        }
        findViewById<Button>(R.id.btnMudanca).setOnClickListener {
            startActivity(Intent(this, MudancaActivity::class.java))
        }
        findViewById<Button>(R.id.btnContatos).setOnClickListener {
            startActivity(Intent(this, ContatosActivity::class.java))
        }
    }
}