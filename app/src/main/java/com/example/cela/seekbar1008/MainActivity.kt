package com.example.cela.seekbar1008

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.SeekBar
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {


        var post1:Int = 255
        var post2:Int = 255
        var post3:Int = 255
        lateinit var background : LinearLayout  /* 背景型態*/
        lateinit var seek_red:SeekBar
        lateinit var seek_green:SeekBar
        lateinit var seek_blue:SeekBar
        lateinit  var edit_red:EditText
        lateinit  var edit_green:EditText
        lateinit var edit_blue:EditText
        override fun onCreate(savedInstanceState: Bundle?) {   /*seek_red,seek_green,seek_blue要把數值貢獻給onCreate家族*/
            super.onCreate(savedInstanceState)
            setContentView(R.layout.seekbar)
            background = findViewById(R.id.background)
            seek_red = findViewById(R.id.seekBarRed)
            seek_green = findViewById(R.id.seekBarGreen)
            seek_blue = findViewById(R.id.seekBarBlue)
            edit_red = findViewById(R.id.edtRed)
            edit_green = findViewById(R.id.edtGreen)
            edit_blue =  findViewById(R.id.edtBlue)
            seek_red.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
                override fun onProgressChanged(
                    seekBar: SeekBar?,
                    progress: Int,
                    fromUser: Boolean
                ) {
                    edit_red.setText (progress.toString())
                    post1 = progress     /*progress才能變化數值，否則只會停再post1設定的255*/
                    background.setBackgroundColor(Color.rgb(post1,post2,post3))
                    Log.d("redVal=",post1.toString())
                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {
                }

                override fun onStopTrackingTouch(seekBar: SeekBar?) {
                 }
            })
            seek_green.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
                override fun onProgressChanged(
                    seekBar: SeekBar?,
                    progress: Int,
                    fromUser: Boolean
                ) {
                    edit_green.setText (progress.toString())
                    post2 = progress
                    background.setBackgroundColor(Color.rgb(post1,post2,post3))
                    Log.d("greenVal=",post2.toString())
                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {
                }

                override fun onStopTrackingTouch(seekBar: SeekBar?) {
                }
            })
            seek_blue.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
                override fun onProgressChanged(
                    seekBar: SeekBar?,
                    progress: Int,
                    fromUser: Boolean
                ) {
                    edit_blue.setText (progress.toString())
                    post3 = progress
                    background.setBackgroundColor(Color.rgb(post1,post2,post3))
                    Log.d("blueVal=",post3.toString())
                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {
                }

                override fun onStopTrackingTouch(seekBar: SeekBar?) {
                }
            })





    }

}
