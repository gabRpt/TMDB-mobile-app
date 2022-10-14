package com.imt.tmdbpremium

import android.os.Build
import androidx.annotation.RequiresApi

class TmdbService {
    private val dataSource = MockDataSource()

    fun getMovieDetail(id: Int, success: (movie: Movie?) -> Unit, failure: () -> Unit) {
        success(dataSource.movies.find { it.id == id })
    }

    fun getLatestMovies(success: (movies: List<Movie>) -> Unit, failure: () -> Unit) {
        success(dataSource.movies)
    }
}
