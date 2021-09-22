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
        //init UI val
        val btnRoll : Button = findViewById(R.id.btn_roll)
        val btnCountUp : Button = findViewById(R.id.btn_count_up)
        btnRoll.setOnClickListener{rollDice()}
        btnCountUp.setOnClickListener { countUpDice() }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val tvResult : TextView = findViewById(R.id.tv_result)
        tvResult.text = randomInt.toString()
        Toast.makeText(this,"Dice Result is ${tvResult.text}", Toast.LENGTH_SHORT).show()
    }

    private fun countUpDice() {
        val tvResult : TextView = findViewById(R.id.tv_result)
        //check if char more than 1 ("Hello World" Case)
        if(tvResult.text.length>1){
            tvResult.text = "1"
        }else{
            if (tvResult.text == "6"){

            }else{
                var plus_one = tvResult.text.toString().toInt() +1
                tvResult.text = plus_one.toString()
            }
        }
        Toast.makeText(this,"Your Number is ${tvResult.text}", Toast.LENGTH_SHORT).show()
    }
}