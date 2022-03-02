package com.nubari.statemanagement.simple.statehoisting

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun GreetingContainer() {
    val text = remember { mutableStateOf("") }
    InputGreeting(
        value = text.value,
        onValueChange = {
            text.value = it
        }
    )
    Question(value = text.value)
}