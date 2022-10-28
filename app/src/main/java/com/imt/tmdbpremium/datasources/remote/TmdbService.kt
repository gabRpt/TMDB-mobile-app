package com.imt.tmdbpremium.datasources.remote

import com.imt.tmdbpremium.datasources.remote.dtos.MovieDto
import com.imt.tmdbpremium.datasources.remote.dtos.MoviesListDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface TmdbService {
    @GET("movie/now_playing")
    suspend fun getLatestMovies(): Response<MoviesListDto>

    @GET("movie/{id}")
    suspend fun getMovieById(@Path("id") id: Int): Response<MovieDto>
}