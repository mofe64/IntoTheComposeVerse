package com.nubari.statemanagement.viewmodel

data class LoginFormState(
    val email : InputState = InputState(type = InputType.EMAIL),
    val password: InputState = InputState(type = InputType.PASSWORD),
    val formValid: Boolean
)
