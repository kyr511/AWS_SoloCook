package com.example.solocook

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.solocook.databinding.ActivityBudgetRecipeBinding

class BudgetRecipeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBudgetRecipeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_budget_recipe)

        binding.btnGenerate.setOnClickListener {
            val intent = Intent(this, BudgetRecipeInsideActivity::class.java)
            startActivity(intent)
        }

        binding.back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}