package com.imt.tmdbpremium

import android.content.ClipData.newIntent
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.GridLayoutManager
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

        val moviesListAdapter = MoviesListAdapter({
            navigateToDetail(it)
        })

        tmdbService.getLatestMovies(success = {
            moviesListAdapter.dataSet = it
        }, failure = {})

        val moviesList = findViewById<RecyclerView>(R.id.movieList)
        moviesList.adapter = moviesListAdapter
        moviesList.layoutManager = GridLayoutManager(this, 3)
    }

    private fun navigateToDetail(movie: Movie) {
        val intent = Intent(this, MovieDetailActivity::class.java)
        intent.putExtra(MovieDetailActivity.INTENT_PARAM_ID, movie.id)
        startActivity(intent)
    }
}