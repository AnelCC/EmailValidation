package com.anelcc.cleanarchitecturehandleerrors.domain

import com.anelcc.cleanarchitecturehandleerrors.util.Resource

class SubmitEmailUseCase {

    fun execute(email: String): Resource<Unit> {
        if (!email.contains("@")) {
            return Resource.Error("This is not a valid email")
        }

    }

    class InvalidEmailException: Exception("This is not an email")
}