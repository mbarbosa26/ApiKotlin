package com.myapplication.core

import java.lang.Exception

sealed class Resource<out T> {

    class Loandig<out T> : Resource<T>()
    data class Success<out T>(val data: T) : Resource<T>()
    data class Failure(val exception: Exception) : Resource<Nothing>()

}