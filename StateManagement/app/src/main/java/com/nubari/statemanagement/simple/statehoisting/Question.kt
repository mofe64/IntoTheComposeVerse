package com.nubari.statemanagement.simple.statehoisting

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun Question(value: String) {
    Text(text = "How are you today $value ?")
}