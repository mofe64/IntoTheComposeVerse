package com.nubari.recyclerviewexample

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nubari.recyclerviewexample.databinding.MealCardBinding

class MealAdapter() : RecyclerView.Adapter<MealAdapter.ViewHolder>() {
    private var meals = emptyList<Meal>()

    class ViewHolder(binding: MealCardBinding) : RecyclerView.ViewHolder(binding.root) {
        val image = binding.mealImage
        val name = binding.mealName
        val time = binding.mealTime
        val noIngredients = binding.mealIngredients
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: MealCardBinding = MealCardBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val meal = meals[position]
        holder.image.setImageResource(meal.image)
        holder.name.text = meal.name
        holder.time.text = "${meal.time} minutes"
        holder.noIngredients.text = "${meal.ingredients} ingredients"
    }

    override fun getItemCount(): Int {
        return meals.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateMeals(meals: List<Meal>) {
        Log.i("test", meals.toString())
        this.meals = meals
        notifyDataSetChanged()
    }

}