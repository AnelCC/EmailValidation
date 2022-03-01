package com.anelcc.cleanarchitecturehandleerrors.domain

import com.anelcc.cleanarchitecturehandleerrors.data.Repository
import com.anelcc.cleanarchitecturehandleerrors.util.Resource

class SubmitEmailUseCase(val repository: Repository = Repository()) {

    suspend fun execute(email: String): Resource<Unit> {
        if (!email.contains("@")) {
            return Resource.Error("This is not a valid email")
        }
        return repository.submitEmail(email)
    }

}