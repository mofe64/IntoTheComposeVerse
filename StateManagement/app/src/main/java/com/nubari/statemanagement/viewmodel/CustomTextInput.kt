package com.nubari.statemanagement.viewmodel

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun CustomInputField(
    value: String,
    placeholder: String,
    modifier: Modifier = Modifier,
    hasError: Boolean = false,
    errorMessage: String = "",
    onFocusChange: (FocusState) -> Unit,
    onValueChange: (String) -> Unit,
    textColor: Color = Color.Black,
) {
    val touched = remember {
        mutableStateOf(false)
    }
    OutlinedTextField(
        value = value,
        onValueChange = {
            touched.value = true
            onValueChange(it)
        },
        modifier = modifier.onFocusChanged {
            if (touched.value) onFocusChange(it);
        },
        isError = hasError,
        placeholder = {
            Text(
                text = placeholder, style = TextStyle(
                    textAlign = TextAlign.Center
                )
            )
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            errorBorderColor = Color.Red,
            errorLabelColor = Color.Red,
            errorLeadingIconColor = Color.Red,
            textColor = textColor,
            focusedBorderColor = Color.Green,
            unfocusedBorderColor = Color.LightGray,
        ),

        shape = RoundedCornerShape(20),
    )
    if (hasError) {
        Text(
            text = errorMessage,
            color = Color.Red,
            modifier = Modifier.padding(start = 10.dp)
        )
    }
}