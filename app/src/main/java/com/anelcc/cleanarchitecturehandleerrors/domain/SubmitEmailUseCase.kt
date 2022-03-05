package com.anelcc.cleanarchitecturehandleerrors.domain

import com.anelcc.cleanarchitecturehandleerrors.R
import com.anelcc.cleanarchitecturehandleerrors.data.Repository
import com.anelcc.cleanarchitecturehandleerrors.util.Resource
import com.anelcc.cleanarchitecturehandleerrors.util.UiText

class SubmitEmailUseCase(val repository: Repository = Repository()) {

    suspend fun execute(email: String): Resource<Unit> {
        if (!email.contains("@")) {
            return Resource.Error(UiText.StringResource(R.string.error_invalid_email))
        }
        return repository.submitEmail(email)
    }

}