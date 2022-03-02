package com.nubari.statemanagement.simple.internal

import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun InputGreeting() {
    val text = remember { mutableStateOf("")}
    OutlinedTextField(
        value = text.value,
        onValueChange = {
            text.value = it
        }
    )
    Text(text = "Hello ${text.value}")
}