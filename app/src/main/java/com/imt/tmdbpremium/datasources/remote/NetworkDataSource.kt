package com.imt.tmdbpremium.datasources.remote

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.annotation.WorkerThread
import com.imt.tmdbpremium.entities.Movie
import com.imt.tmdbpremium.entities.transformers.movieDtoFromMovie
import com.imt.tmdbpremium.entities.transformers.moviesListDtoToMoviesList


class NetworkDataSource {
    @RequiresApi(Build.VERSION_CODES.O)
    @WorkerThread
    suspend fun getLatestMovies(success: (movies: List<Movie>) -> Unit, failure: () -> Unit) {
        try {
            val response = ApiClient.tmdbService.getLatestMovies().execute()

            if (response.isSuccessful && response.body() != null) {
                val content = response.body()
                content?.let {
                    success(moviesListDtoToMoviesList(it))
                }
            } else
                failure()
        } catch (e: Exception) {
            Log.d("NetworkDataSource", e.toString())
            failure()
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @WorkerThread
    suspend fun getMoviesByName(name: String, success: (movies: List<Movie>) -> Unit, failure: () -> Unit) {
        try {
            val response = ApiClient.tmdbService.getMovieByName(name).execute()

            if (response.isSuccessful && response.body() != null) {
                val content = response.body()
                content?.let {
                    success(moviesListDtoToMoviesList(it))
                }
            } else
                failure()
        } catch (e: Exception) {
            Log.d("NetworkDataSource", e.toString())
            failure()
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @WorkerThread
    suspend fun getMovieById(id: Int, success: (movie: Movie) -> Unit, failure: () -> Unit) {
        try {
            val response = ApiClient.tmdbService.getMovieById(id).execute()

            if (response.isSuccessful && response.body() != null) {
                val content = response.body()
                content?.let {
                    success(movieDtoFromMovie(it))
                }
            } else
                failure()
        } catch (e: Exception) {
            Log.d("NetworkDataSource", e.toString())
            failure()
        }
    }
}