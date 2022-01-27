package com.nubari.recyclerviewexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MealViewModel : ViewModel() {
    private val _state = MutableLiveData(MealState())
    val state: LiveData<MealState>
        get() = _state


}