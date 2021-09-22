package io.github.septianrin.ankofun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //init UI val
        val btnRoll : Button = findViewById(R.id.btn_roll)
        btnRoll.setOnClickListener{rollDice()}
    }

    private fun rollDice() {
        val ivDice : ImageView = findViewById(R.id.iv_dice)
        val randomInt = (1..6).random()
        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        ivDice.setImageResource(drawableResource)
    }
}