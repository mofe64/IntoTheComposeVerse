package com.nubari.statemanagement.viewmodel

sealed class LoginEvent {
    data class EnteredEmail(val value: String) : LoginEvent()
    data class EnteredPassword(val value: String) : LoginEvent()
    data class FocusChange(val focusFieldName: String) : LoginEvent()
}
