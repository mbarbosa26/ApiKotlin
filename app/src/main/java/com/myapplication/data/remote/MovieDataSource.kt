package com.myapplication.data.remote

import com.myapplication.aplication.AppConstans
import com.myapplication.data.model.MovieList
import com.myapplication.repository.WebService

class MovieDataSource(private val webService: WebService) {

    suspend fun getUpcomingMovies(): MovieList = webService.getUpcomingMovies(AppConstans.API_KEY)


    suspend fun getTopRatedMovies(): MovieList = webService.getTopRatedMovies(AppConstans.API_KEY)


    suspend fun getPopularMovies(): MovieList = webService.getPopularMovies(AppConstans.API_KEY)

}