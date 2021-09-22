package io.github.septianrin.ankofun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnRoll : Button = findViewById(R.id.btn_roll)
        btnRoll.setOnClickListener{rollDice()}

    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val tvResult : TextView = findViewById(R.id.tv_result)
        tvResult.text = randomInt.toString()
        Toast.makeText(this,"Dice Result is ${tvResult.text}", Toast.LENGTH_SHORT).show()
    }
}