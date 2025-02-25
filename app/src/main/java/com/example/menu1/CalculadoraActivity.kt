package com.example.menu1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import net.objecthunter.exp4j.ExpressionBuilder

class CalculadoraActivity : AppCompatActivity() {
    private lateinit var txtResult: EditText
    private var expression: String = ""
    private lateinit var btnRegresar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        btnRegresar = findViewById(R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        txtResult = findViewById(R.id.txtResult)
    }

    fun onButtonClick(view: View) {
        val button = view as Button
        val buttonText = button.text.toString()

        when (buttonText) {
            "C" -> {
                expression = ""
            }
            "=" -> {
                try {
                    val result = ExpressionBuilder(expression).build().evaluate()
                    expression = result.toString()
                } catch (e: Exception) {
                    expression = "Error"
                }
            }
            else -> {
                expression += buttonText
            }
        }
        txtResult.setText(expression)
    }
}