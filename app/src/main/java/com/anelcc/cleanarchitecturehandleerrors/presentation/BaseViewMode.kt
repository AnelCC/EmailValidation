package com.anelcc.cleanarchitecturehandleerrors.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class BaseViewMode {

    var email by mutableStateOf("")
        private set

    var error by mutableStateOf<String?>(null)
        private set


    fun onEmailChange(email: String) {
        this.email = email
    }
}