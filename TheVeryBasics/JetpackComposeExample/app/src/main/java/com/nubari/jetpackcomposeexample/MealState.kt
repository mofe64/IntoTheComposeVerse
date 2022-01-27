package com.nubari.jetpackcomposeexample

data class MealState(
    val recipes: List<Meal> = listOf(
        Meal(
            "Banana and Mandarin buns",
            R.drawable.bananaandmandarinbuns,
            5,
            20
        ),
        Meal(
            "Cooked Coconut Mussels",
            R.drawable.cookedcoconutmussels,
            7,
            11
        ),
        Meal(
            "Fancy",
            R.drawable.feedimage2,
            9,
            11,
        ),
        Meal(
            "Italian",
            R.drawable.pizza,
            4,
            20
        ),
    ),
)
