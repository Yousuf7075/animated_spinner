package com.example.animated_spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.animated_spinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val questions = ArrayList<String>()
        questions.add("What is your favourite color?")
        questions.add("What is your favourite food?")
        questions.add("What is your favourite pet`s name?")
        questions.add("What is your favourite pet`s name?")
        questions.add("What is your favourite coffee?")
        questions.add("Why Kotlin?")
        questions.add("What is your favourite color?")
        questions.add("What is your favourite food?")
        questions.add("What is your favourite pet`s name?")
        questions.add("What is your favourite pet`s name?")
        questions.add("What is your favourite coffee?")
        questions.add("Why Kotlin?")
        viewBinding.questionPSV.setItems(questions)
        viewBinding.questionPSV.setOnSpinnerItemSelectedListener <String>{ _, _, index, item ->
            Log.e("animated spinner:", item)
            Toast.makeText(this, "selected item: $item position: $index", Toast.LENGTH_SHORT).show()
        }
    }
}