package com.nubari.statemanagement.viewmodel

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun Login(
    loginViewModel: LoginViewModel = viewModel()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val loginFormState = loginViewModel.state.value
        CustomInputField(
            value = loginFormState.email.text,
            placeholder = "Email",
            onFocusChange = {
                loginViewModel.createEvent(
                    LoginEvent.FocusChange("email")
                )
            },
            onValueChange = { value ->
                loginViewModel.createEvent(
                    LoginEvent.EnteredEmail(value)
                )
            },
            hasError = !loginFormState.email.isValid,
            errorMessage = loginFormState.email.errorMessage,
            textColor = Color.Black
        )
        Spacer(modifier = Modifier.height(20.dp))
        CustomInputField(
            value = loginFormState.password.text,
            placeholder = "Password",
            onFocusChange = {
                loginViewModel.createEvent(
                    LoginEvent.FocusChange("password")
                )
            },
            onValueChange = { value ->
                loginViewModel.createEvent(
                    LoginEvent.EnteredPassword(value)
                )
            },
            hasError = !loginFormState.password.isValid,
            errorMessage = loginFormState.password.errorMessage,
            textColor = Color.Black
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.primary,
                contentColor = Color.White,
                disabledBackgroundColor = Color.Gray
            ),
            shape = RoundedCornerShape(20),
            enabled = loginFormState.formValid

        ) {
            Text(text = "Login")
        }
    }
}