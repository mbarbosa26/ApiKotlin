package com.myapplication.repository

import com.myapplication.data.model.MovieList

interface MovieRepository {

    suspend fun getUpcomingMovies(): MovieList

    suspend fun getTopRatedMovies(): MovieList

    suspend fun getPopularMovies(): MovieList

}