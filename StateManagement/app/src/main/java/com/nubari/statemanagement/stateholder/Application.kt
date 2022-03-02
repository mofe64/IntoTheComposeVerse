package com.nubari.statemanagement.stateholder

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.nubari.statemanagement.simple.statehoisting.InputGreeting
import com.nubari.statemanagement.simple.statehoisting.Question

@Composable
fun CustomApplication() {
    val applicationState = rememberApplicationState(initialName = "")
    InputGreeting(value = applicationState.name, onValueChange = {
        applicationState.updateName(it)
    })
    if (applicationState.shouldDisplayName) {
        Text(text = applicationState.greeting)
        Question(value = applicationState.name)
    } else {
        Text(text = applicationState.greeting)
    }
}