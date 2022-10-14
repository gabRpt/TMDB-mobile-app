package com.imt.tmdbpremium

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MoviesListActivity : AppCompatActivity() {
    private val tmdbService: TmdbService = TmdbService()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies_list)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onStart() {
        super.onStart()

        val moviesListAdapter = MoviesListAdapter()

        tmdbService.getLatestMovies(success = {
            moviesListAdapter.dataSet = it
        }, failure = {})

        val moviesList = findViewById<RecyclerView>(R.id.movieList)
        moviesList.adapter = moviesListAdapter
        moviesList.layoutManager = LinearLayoutManager(this)
    }
}