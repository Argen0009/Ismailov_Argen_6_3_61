package com.example.ismailov_argen_6_3_61

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ismailov_argen_6_3_61.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var foodlist : ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
        loadData()
    }

    private fun initView() {
        recyclerView = findViewById(R.id.Food)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        foodlist = ArrayList()
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
    private fun loadData() {
        foodlist.add(Food(R.drawable.img,"Pipironi","Delicious pizza with pepperoni and olives","12$", "400Kcal"))
        foodlist.add(Food(R.drawable.img_1, "Burger", "Juicy burger with cheese and veggies", "8.99$", "600Kcal"))
        foodlist.add(Food(R.drawable.img_2, "Carbonara Pasta", "Italian pasta dish with creamy egg-based sauce, pancetta, and Parmesan cheese.", "17.99$", "500Kcal"))
        foodlist.add(Food(R.drawable.img_3, "Sushi", "Japanese dish of vinegared rice and raw fish or seafood, often served with soy sauce and wasabi.", "22.89$", "300Kcal"))
        foodlist.add(Food(R.drawable.img_4, "Curry", "Spiced dish from India with meat, vegetables, or fish in a flavorful sauce, often served with rice or naan", "15.2$", "700Kcal"))
        foodlist.add(Food(R.drawable.img_5, "Caesar Salad", "American salad featuring romaine lettuce, croutons, Parmesan cheese, and Caesar dressing, often with added chicken or shrimp.", "3.99$", "200Kcal"))


        foodAdapter = FoodAdapter(foodlist)
        recyclerView.adapter = foodAdapter

    }
}