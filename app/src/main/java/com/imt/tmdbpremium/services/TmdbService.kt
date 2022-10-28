package com.imt.tmdbpremium.services

import android.content.Context
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import com.imt.tmdbpremium.datasources.remote.MockDataSource
import com.imt.tmdbpremium.datasources.remote.NetworkDataSource
import com.imt.tmdbpremium.entities.Movie
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@RequiresApi(Build.VERSION_CODES.O)
class TmdbService (context: Context) {
    private val mockDataSource = MockDataSource()
    private val networkDataSource = NetworkDataSource()


    fun getMovieDetail(id: Int, success: (movie: Movie?) -> Unit, failure: () -> Unit) {
        CoroutineScope(Dispatchers.IO).launch {
            networkDataSource.getMovieById(id, success
            = { movie ->
                success(movie)
            }, failure = {
                failure()
            })
        }
    }

    fun getLatestMovies(success: (movies: List<Movie>) -> Unit, failure: () -> Unit) {
        CoroutineScope(Dispatchers.IO).launch {
            networkDataSource.getLatestMovies(success = { movies ->
                success(movies)
            }, failure = {
                failure()
            })
        }
    }
}
