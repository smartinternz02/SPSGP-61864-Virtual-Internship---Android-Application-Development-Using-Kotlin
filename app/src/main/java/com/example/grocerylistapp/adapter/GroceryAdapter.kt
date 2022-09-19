package com.example.grocerylistapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.grocerylistapp.database.entity.GroceryItems
import com.example.grocerylistapp.R
import com.example.grocerylistapp.ui.GroceryViewModel
//import kotlinx.android.synthetic.main.groceryadapter.view.*

class GroceryAdapter(
        var list: List<GroceryItems>,
        val viewModel: GroceryViewModel
        ) : RecyclerView.Adapter<GroceryAdapter.GroceryViewHolder>() {

        inner class GroceryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
                val nameTV = itemView.findViewById<TextView>(R.id.tv_item_name)
                val quantityTV = itemView.findViewById<TextView>(R.id.tv_item_quntity)
                val rateTV = itemView.findViewById<TextView>(R.id.tv_item_rate)
                val amountTV = itemView.findViewById<TextView>(R.id.tv_total_amount)
                val deleteIV = itemView.findViewById<ImageView>(R.id.tv_item_delete)
        }

        interface GroceryItemClickInterface {
                fun onItemClick(groceryItems: GroceryItems)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroceryViewHolder {
                TODO("Not yet implemented")
        }

        override fun onBindViewHolder(holder: GroceryViewHolder, position: Int) {
                TODO("Not yet implemented")
        }

        override fun getItemCount(): Int {
                TODO("Not yet implemented")
        }

}
