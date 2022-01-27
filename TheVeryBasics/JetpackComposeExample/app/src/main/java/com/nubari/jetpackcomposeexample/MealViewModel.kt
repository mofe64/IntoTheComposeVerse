package com.nubari.jetpackcomposeexample

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MealViewModel : ViewModel(){
    private val _state = mutableStateOf(MealState())
    val state = _state
}