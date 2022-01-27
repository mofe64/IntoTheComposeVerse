package com.nubari.recyclerviewexample

data class MealState(
    val meals: List<Meal> = listOf(
        Meal(
            name = "Cooked Coconut Mussels",
            time = 5,
            ingredients = 4,
            image = R.drawable.cookedcoconutmussels
        ),
        Meal(
            name = "Banana and Mandarin Buns",
            time = 45,
            ingredients = 6,
            image = R.drawable.bananaandmandarinbuns
        ),
        Meal(name = "Strawberry Meal", time = 59, ingredients = 3, image = R.drawable.strawberries),
        Meal(
            name = "Pizza",
            time = 50,
            ingredients = 7,
            image = R.drawable.pizza
        )

    )
)
