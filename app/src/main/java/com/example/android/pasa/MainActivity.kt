package com.example.android.pasa

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
  lateinit var ShowingNumber : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val RollingDice : Button=findViewById(R.id.dice)
        ShowingNumber=findViewById(R.id.pasaImage) as ImageView;
        RollingDice.setOnClickListener {DiceIsRolling() }
    }
    private fun DiceIsRolling(){
        val diceNumber=(1..6).random()
        var img=when(diceNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        ShowingNumber.setImageResource(img)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_exp1,menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       return when(item.itemId){
            R.id.reset ->{
                ShowingNumber.setImageResource(R.drawable.empty_dice)
                return true;
            }
            else->{
                return super.onOptionsItemSelected(item)
            }
        }

    }


}