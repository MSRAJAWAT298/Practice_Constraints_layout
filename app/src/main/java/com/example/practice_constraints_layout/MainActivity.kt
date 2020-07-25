package com.example.practice_constraints_layout

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

//this main activitiy class is use to on click on button and text view display the color
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setLinstner() //call the function
    }

    private fun setLinstner() {//define calling function working In this function try to fetch the value of clikable value of text view and button//
        val clickableViews:List<View> =
            listOf(box_one_text,box_two_text,box_three_text,box_four_text,box_five_text,constraint_layout,red_button,yellow_button,green_button)
//this all are Id of differnet text view and button and layout also. and store in clickableViews array
        for (item in clickableViews) { //here we run the loop and fetfch the id of clickbale textview or button
            item.setOnClickListener { makeColored(it) } //this funtion is call for change the color of box
        }
    }


    private fun makeColored(view: View) { //here all the defination is define
        when (view.id) {//when id = ? then do according to id . On diffrent id changes the color.

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> box_two_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}