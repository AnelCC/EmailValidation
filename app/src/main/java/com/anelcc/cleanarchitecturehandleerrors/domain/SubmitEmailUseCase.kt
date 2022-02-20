package com.anelcc.cleanarchitecturehandleerrors.domain

class SubmitEmailUseCase {

    fun execute(email: String) {
        if (!email.contains("@")) {
            throw InvalidEmailException()
        }

    }

    class InvalidEmailException: Exception("This is not an email")
}