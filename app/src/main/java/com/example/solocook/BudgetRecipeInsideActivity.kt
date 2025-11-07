package com.example.solocook

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.solocook.databinding.ActivityBudgetRecipeInsideBinding
import com.example.solocook.rvAdapter.BudgetRVAdapter

class BudgetRecipeInsideActivity : AppCompatActivity() {

    private lateinit var binding : ActivityBudgetRecipeInsideBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_budget_recipe_inside)

        //Recyclerdview
        val rv : RecyclerView = binding.rv
        val items = ArrayList<String>()
        items.add("a")
        items.add("a")
        items.add("a")
        items.add("a")

        val rvAdapter = BudgetRVAdapter(items)
        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(this)


    }
}