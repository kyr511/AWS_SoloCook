package com.example.solocook

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.solocook.databinding.ActivityEnterIngredientsInsideBinding

class EnterIngredientsInside : AppCompatActivity() {

    private lateinit var binding: ActivityEnterIngredientsInsideBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_enter_ingredients_inside)

        binding.tryBtn.setOnClickListener { //try again 버튼 클릭

        }

        binding.backBtn.setOnClickListener { //Back to Home 버튼 클릭
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}