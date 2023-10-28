package com.example.ismailov_argen_6_3_61

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter (private val foodList: ArrayList<Food>):RecyclerView.Adapter<FoodAdapter.FoodViewHolder>(){

    class FoodViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val  src:ImageView = itemView.findViewById(R.id.src)
        val  Name : TextView = itemView.findViewById(R.id.Name)
        val  description : TextView = itemView.findViewById(R.id.description)
        val  money : TextView = itemView.findViewById(R.id.money)
        val kcal: TextView = itemView.findViewById(R.id.Kcal)
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item,parent,false)
        return FoodViewHolder(view)
    }



    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foodList[position]
        holder.src.setImageResource(food.imeg)
        holder.Name.text = food.name
        holder.description.text = food.description
        holder.money.text = food.money
        holder.kcal.text = food.kcal
    }
    override fun getItemCount(): Int {
        return foodList.size
    }
}


