package com.king.dyce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dice = intArrayOf(R.drawable.dice_1, R.drawable.dice_2, R.drawable.dice_3,
            R.drawable.dice_4, R.drawable.dice_5, R.drawable.dice_6)

        // linking the roll button from its id..
        val button = findViewById<Button>(R.id.btVar1)

        // linking both the imageView of
        // the dice images from its id..
        val img1 = findViewById<ImageView>(R.id.ivVar1)
        val img2 = findViewById<ImageView>(R.id.ivVar2)


        var output :Int = 0
        var output2 : Int = 0


        val outcome = findViewById<TextView>(R.id.outcome)
        // call the on click function
        button.setOnClickListener(View.OnClickListener { // generate two random numbers
            // using Random function

            val random = Random()
            val num1 = random.nextInt(dice.size)
            val randomElement = dice[num1]
            val random1 = Random()
            val num2 = random1.nextInt(dice.size)
            val randomElement2 = dice[num2]


            // set the images from the array by the index
            // position of the numbers generated
            img1.setImageResource(randomElement)
            img2.setImageResource(randomElement2)

            when (randomElement) {
                R.drawable.dice_1 -> {
                    output = 1
                }
                R.drawable.dice_2 -> {
                    output = 2
                }
                R.drawable.dice_3 -> {
                    output = 3
                }
                R.drawable.dice_4 -> {
                    output = 4
                }
                R.drawable.dice_5 -> {
                    output = 5
                }
                R.drawable.dice_6 -> {
                    output = 6
                }
                else -> {
                }
            }

            when (randomElement2) {
                R.drawable.dice_1 -> {
                    output2 = 1
                }
                R.drawable.dice_2 -> {
                    output2 = 2
                }
                R.drawable.dice_3 -> {
                    output2 = 3
                }
                R.drawable.dice_4 -> {
                    output2 = 4
                }
                R.drawable.dice_5 -> {
                    output2 = 5
                }
                R.drawable.dice_6 -> {
                    output2 = 6
                }
                else -> {
                }
            }




            outcome.text="$output + $output2 = ${output + output2}"
        })
    }

    companion object {
        var button: Button? = null
        var textView: TextView? = null
        var img1: ImageView? = null
        var img2: ImageView? = null
    }
}