package com.nubari.statemanagement.stateholder

import android.util.Log
import androidx.compose.runtime.*

class ApplicationState(initialName: String) {
    private val rejectedNames: List<String> = listOf("Name1", "Name2", "Name3", "Name4")
    var name by mutableStateOf(initialName)
    val shouldDisplayName: Boolean
        get() = !rejectedNames.contains(name)
    val greeting: String
        get() = if (rejectedNames.contains(name)) {
            "You are not welcome your name is not allowed"
        } else {
            if (name.isNotEmpty()) {
                "Welcome $name"
            } else {
                ""
            }
        }

    fun updateName(newName: String) {
        name = newName
    }
}

@Composable
fun rememberApplicationState(initialName: String): ApplicationState = remember {
    ApplicationState(initialName = initialName)
}
