package com.nubari.jetpackcomposeexample

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun App(
    mealViewModel: MealViewModel = viewModel(),
) {
    val state = mealViewModel.state.value
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)) {
        items(state.recipes) { item: Meal ->
            MealCard(meal = item)
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}