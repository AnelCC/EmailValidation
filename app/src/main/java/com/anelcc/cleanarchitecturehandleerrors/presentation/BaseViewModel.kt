package com.anelcc.cleanarchitecturehandleerrors.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.anelcc.cleanarchitecturehandleerrors.domain.SubmitEmailUseCase
import com.anelcc.cleanarchitecturehandleerrors.util.Resource
import com.anelcc.cleanarchitecturehandleerrors.util.UiText
import kotlinx.coroutines.launch

class BaseViewModel(val submitEmailUseCase: SubmitEmailUseCase = SubmitEmailUseCase()) : ViewModel() {

    var email by mutableStateOf("")
        private set

    var error by mutableStateOf<UiText?>(null)
        private set


    fun onEmailChange(email: String) {
        this.email = email
    }

    fun submitEmail() {
        viewModelScope.launch {
            val result = submitEmailUseCase.execute(email)
            when(result) {
                is Resource.Success -> {
//                    error = result.message
                }
                is Resource.Error -> {
                    error = result.message
                }
            }
        }
    }
}