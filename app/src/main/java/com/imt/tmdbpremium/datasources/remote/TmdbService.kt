package com.imt.tmdbpremium.datasources.remote

import android.os.Build
import androidx.annotation.RequiresApi
import com.imt.tmdbpremium.datasources.remote.dtos.MovieDto
import com.imt.tmdbpremium.datasources.remote.dtos.MoviesListDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

@RequiresApi(Build.VERSION_CODES.O)
interface TmdbService {
    @GET("movie/now_playing")
    suspend fun getLatestMovies(): Call<MoviesListDto>

    @GET("movie/{id}")
    suspend fun getMovieById(@Path("id") id: Int): Call<MovieDto>

    @GET("search/movie")
    suspend fun getMovieByName(@Query("query") query: String): Call<MoviesListDto>
}
