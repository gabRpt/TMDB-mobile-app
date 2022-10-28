package com.imt.tmdbpremium.pages.list

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.imt.tmdbpremium.R
import com.imt.tmdbpremium.services.TmdbService
import com.imt.tmdbpremium.entities.Movie
import com.imt.tmdbpremium.pages.detail.MovieDetailActivity

class MoviesListActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    private lateinit var tmdbService: TmdbService
    private lateinit var moviesListAdapter: MoviesListAdapter
    private var savedMovies: List<Movie>? = null

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies_list)

        tmdbService = TmdbService(this)
        savedMovies = savedInstanceState?.getParcelableArrayList<Movie>("MOVIES_LIST")
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onStart() {
        super.onStart()
        val moviesList = findViewById<RecyclerView>(R.id.movieList)

        moviesListAdapter = MoviesListAdapter({
            navigateToDetail(it)
        })

        moviesList.adapter = moviesListAdapter
        moviesList.layoutManager = GridLayoutManager(this, 3)

        if (savedMovies == null) {
            tmdbService.getLatestMovies(success = {
                runOnUiThread {
                    moviesListAdapter.dataSet = it
                }
            }, failure = {})
        } else {
            moviesListAdapter.dataSet = savedMovies as List<Movie>
        }
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