package com.example.solocook.rvAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.solocook.R
import com.example.solocook.model.budget_item

class BudgetRVAdapter (private val dataset: ArrayList<budget_item>) : RecyclerView.Adapter<BudgetRVAdapter.ViewHolder>() {

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems( items: String) {
            //여기 작성
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_budget_recipe_inside, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //여기 작성
    }

    override fun getItemCount(): Int {
        return dataset.size
    }


}