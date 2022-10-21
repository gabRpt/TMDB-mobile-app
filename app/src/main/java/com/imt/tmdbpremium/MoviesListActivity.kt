package com.imt.tmdbpremium

import android.content.ClipData.newIntent
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MoviesListActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    private val tmdbService: TmdbService = TmdbService()
    private lateinit var moviesListAdapter: MoviesListAdapter
    private var savedMovies: List<Movie>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies_list)

        savedMovies = savedInstanceState?.getParcelableArrayList<Movie>("MOVIES_LIST")
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onStart() {
        super.onStart()

        moviesListAdapter = MoviesListAdapter({
            navigateToDetail(it)
        })

        if (savedMovies == null) {
            tmdbService.getLatestMovies(success = {
                moviesListAdapter.dataSet = it
            }, failure = {})
        } else {
            moviesListAdapter.dataSet = savedMovies as List<Movie>
        }

        val moviesList = findViewById<RecyclerView>(R.id.movieList)
        moviesList.adapter = moviesListAdapter
        moviesList.layoutManager = GridLayoutManager(this, 3)
    }

    private fun navigateToDetail(movie: Movie) {
        val intent = Intent(this, MovieDetailActivity::class.java)
        intent.putExtra(MovieDetailActivity.INTENT_PARAM_ID, movie.id)
        startActivity(intent)
    }


    override fun onSaveInstanceState(outState: Bundle) {
        outState.putParcelableArrayList("MOVIES_LIST", ArrayList(moviesListAdapter.dataSet))
        super.onSaveInstanceState(outState)
    }
}