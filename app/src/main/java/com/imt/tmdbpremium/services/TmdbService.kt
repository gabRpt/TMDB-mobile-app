package com.imt.tmdbpremium.services

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.room.Room
import com.imt.tmdbpremium.datasources.locale.AppDatabase
import com.imt.tmdbpremium.datasources.locale.MovieDao
import com.imt.tmdbpremium.datasources.remote.MockDataSource
import com.imt.tmdbpremium.datasources.remote.NetworkDataSource
import com.imt.tmdbpremium.entities.Movie
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TmdbService(context: Context, private val mock: Boolean = false) {
    private val mockDataSource = MockDataSource()
    private val networkDataSource = NetworkDataSource()
    private val movieDao: MovieDao

    init {
        val db = Room.databaseBuilder(
            context,
            AppDatabase::class.java, "my-database"
        ).build()

        movieDao = db.movieDao()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getMovieDetail(id: Int, success: (movie: Movie?) -> Unit, failure: () -> Unit) {
        if (mock)
            success(mockDataSource.movies.find { it.id == id })
        else
            CoroutineScope(Dispatchers.IO).launch {
                networkDataSource.getMovieById(id, success = { movie ->
                    val movieDb = movieDao.getById(id)
                    movieDb?.let {
                        movie.favorite = true
                    }
                    success(movie)
                }, failure = {
                    failure()
                })
            }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getLatestMovies(success: (movies: List<Movie>) -> Unit, failure: () -> Unit) {
        if (mock)
            success(mockDataSource.movies)
        else {
            CoroutineScope(Dispatchers.IO).launch {
                networkDataSource.getLatestMovies(success = { movies ->
                    val moviesDb = movieDao.getAll()
                    movies.map { movie ->
                        movie.favorite = moviesDb.any { it.id == movie.id }
                    }
                    success(movies)
                }, failure = {
                    failure()
                })
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getMoviesByName(name: String, success: (movies: List<Movie>) -> Unit, failure: () -> Unit) {
        if (mock)
            success(mockDataSource.movies)
        else {
            CoroutineScope(Dispatchers.IO).launch {
                networkDataSource.getMoviesByName(name, success = { movies ->
                    val moviesDb = movieDao.getAll()
                    movies.map { movie ->
                        movie.favorite = moviesDb.any { it.id == movie.id }
                    }
                    success(movies)
                }, failure = {
                    failure()
                })
            }
        }
    }

    fun toggleFavorite(movie: Movie, favorite: Boolean) {
        CoroutineScope(Dispatchers.IO).launch {
            if (favorite)
                movieDao.addFavorite(movie)
            else
                movieDao.removeFavorite(movie)
        }
    }
}