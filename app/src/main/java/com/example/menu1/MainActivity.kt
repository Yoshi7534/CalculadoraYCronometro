package com.example.menu1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculadora = findViewById<Button>(R.id.btnCalculadora)
        val btnCronometro = findViewById<Button>(R.id.btnCronometro)

        btnCalculadora.setOnClickListener {
            startActivity(Intent(this, CalculadoraActivity::class.java))
        }

        btnCronometro.setOnClickListener {
            startActivity(Intent(this, CronometroActivity::class.java))
        }
    }
}
