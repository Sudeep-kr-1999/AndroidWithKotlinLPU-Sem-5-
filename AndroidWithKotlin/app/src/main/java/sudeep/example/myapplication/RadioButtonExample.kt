package sudeep.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.annotation.SuppressLint
import android.graphics.Color
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class RadioButtonExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button_example)
        var Rgrp = findViewById<RadioGroup>(R.id.RGrp)
        var BtnSubmit = findViewById<Button>(R.id.BtnSubmit)
        var BtnReset = findViewById<Button>(R.id.BtnReset)
        var txtView = findViewById<TextView>(R.id.txtView)

        BtnSubmit.setOnClickListener {
            val selectId:Int = Rgrp.checkedRadioButtonId
            var radioButton = findViewById<RadioButton>(selectId)
            var out:String = radioButton.text.toString()
            txtView.text = "Selected: $out "


        }
        BtnReset.setOnClickListener {
            Toast.makeText(applicationContext,"hello",Toast.LENGTH_SHORT).show()
            Rgrp.setOnCheckedChangeListener(null);
            Rgrp.clearCheck();
            txtView.text = " "
            Rgrp.setOnCheckedChangeListener(
                RadioGroup.OnCheckedChangeListener { group, checkedId ->
                    val radio: RadioButton = findViewById(checkedId)
                    Toast.makeText(
                        applicationContext, " On checked change : ${radio.text}",
                        Toast.LENGTH_SHORT
                    ).show()
                    // radio.setTextColor(Color.parseColor("#fe9c02"))
                }
            )


        }

        Rgrp.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(
                    applicationContext, " On checked change : ${radio.text}",
                    Toast.LENGTH_SHORT
                ).show()
                // radio.setTextColor(Color.parseColor("#fe9c02"))
            }
        )



    }
}