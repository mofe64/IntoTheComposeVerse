package com.nubari.statemanagement.viewmodel

enum class InputType {
    TEXT,
    EMAIL,
    PASSWORD,
    NUMBER
}
data class InputState(
    val text: String = "",
    val isValid: Boolean = true,
    val type: InputType,
    val errorMessage: String = ""
)