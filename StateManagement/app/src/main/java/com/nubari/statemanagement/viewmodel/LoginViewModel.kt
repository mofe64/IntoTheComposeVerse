package com.nubari.statemanagement.viewmodel

import android.text.TextUtils
import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    private val _state = mutableStateOf(LoginFormState(formValid = true))
    val state: State<LoginFormState> = _state
    fun createEvent(event: LoginEvent) {
        onEvent(event)
    }

    private fun onEvent(event: LoginEvent) {
        when (event) {
            is LoginEvent.EnteredEmail -> {
                _state.value = state.value.copy(
                    email = state.value.email.copy(
                        text = event.value
                    )
                )
            }
            is LoginEvent.EnteredPassword -> {
                _state.value = state.value.copy(
                    password = state.value.password.copy(
                        text = event.value
                    )
                )
            }
            is LoginEvent.FocusChange -> {
                when (event.focusFieldName) {
                    "email" -> {
                        val emailValid = validateInput(state.value.email.text, InputType.EMAIL)
                        _state.value = state.value.copy(
                            email = state.value.email.copy(
                                isValid = emailValid,
                                errorMessage = "Email is not valid"
                            ),
                            formValid = emailValid
                        )
                    }
                    "password" -> {
                        val passwordValid = validateInput(
                            state.value.password.text,
                            InputType.PASSWORD
                        )
                        _state.value = state.value.copy(
                            password = state.value.password.copy(
                                isValid = passwordValid,
                                errorMessage = "Password is not valid"
                            ),
                            formValid = passwordValid
                        )
                    }
                }
            }
        }
    }

    private fun validateInput(inputValue: String, inputType: InputType): Boolean {
        when (inputType) {
            InputType.EMAIL -> {
                return !TextUtils.isEmpty(inputValue) && android.util.Patterns.EMAIL_ADDRESS.matcher(
                    inputValue
                ).matches()
            }
            InputType.PASSWORD -> {
                return !TextUtils.isEmpty(inputValue) && inputValue.length > 5

            }
            InputType.TEXT -> {
                // custom validation logic for text inputs
                return true
            }
            InputType.NUMBER -> {
                // custom validation logic for number inputs
                return true
            }

        }

    }
}