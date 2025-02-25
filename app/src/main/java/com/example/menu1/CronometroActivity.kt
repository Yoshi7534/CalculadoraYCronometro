package com.example.menu1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CronometroActivity : AppCompatActivity() {
    private lateinit var txtTiempo: TextView
    private lateinit var btnIniciar: Button
    private lateinit var btnPausar: Button
    private lateinit var btnReiniciar: Button
    private lateinit var btnRegresar: Button

    private var tiempo = 0
    private var corriendo = false
    private val handler = Handler(Looper.getMainLooper())

    private val runnable = object : Runnable {
        override fun run() {
            if (corriendo) {
                tiempo++
                val minutos = tiempo / 60
                val segundos = tiempo % 60
                txtTiempo.text = String.format("%02d:%02d", minutos, segundos)
                handler.postDelayed(this, 1000)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cronometro)

        txtTiempo = findViewById(R.id.txtTiempo)
        btnIniciar = findViewById(R.id.btnIniciar)
        btnPausar = findViewById(R.id.btnPausar)
        btnReiniciar = findViewById(R.id.btnReiniciar)
        btnRegresar = findViewById(R.id.btnRegresar)

        btnRegresar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        btnIniciar.setOnClickListener {
            if (!corriendo) {
                corriendo = true
                handler.post(runnable)
            }
        }

        btnPausar.setOnClickListener {
            corriendo = false
        }

        btnReiniciar.setOnClickListener {
            corriendo = false
            tiempo = 0
            txtTiempo.text = "00:00"
        }
    }
}
