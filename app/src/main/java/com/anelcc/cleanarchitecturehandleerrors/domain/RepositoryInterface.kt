package com.anelcc.cleanarchitecturehandleerrors.domain

import com.anelcc.cleanarchitecturehandleerrors.util.Resource

interface RepositoryInterface {
    suspend fun submitEmail(email: String): Resource<Unit>
}