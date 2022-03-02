package com.nubari.statemanagement.simple.statehoisting

import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun InputGreeting(
    value: String,
    onValueChange: (String) -> Unit,
) {

    OutlinedTextField(
        value = value,
        onValueChange = onValueChange
    )
    Text(text = "Hello $value")
}