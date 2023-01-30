package com.yashishu.rolldice

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var imgDice:ImageView
    private lateinit var textNum:TextView
    private lateinit var textNum2:TextView
    private lateinit var imgDice2:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnRoll: Button =findViewById(R.id.btnRoll)
        imgDice=findViewById(R.id.imgDice)
        imgDice2=findViewById(R.id.imgDice2)
        textNum=findViewById(R.id.textNum)
        textNum2=findViewById(R.id.textNum2)
        btnRoll.setOnClickListener{ rollDice() }
    }
    private fun rollDice(){
val num =(1..6).random()
        val num2=(1..6).random()

        textNum2.text=num2.toString()

        textNum.text=num.toString()

        val image= when(num) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else->R.drawable.dice_6
        }
        imgDice.setImageResource(image )


        val image2 = when(num2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else->R.drawable.dice_6
        }
        imgDice2.setImageResource(image2 )


    }
}