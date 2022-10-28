package com.imt.tmdbpremium.pages.detail

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.imt.tmdbpremium.datasources.remote.MockDataSource
import com.imt.tmdbpremium.R
import com.imt.tmdbpremium.services.TmdbService

class MovieDetailActivity : AppCompatActivity() {
    private lateinit var tmdbService: TmdbService

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        tmdbService = TmdbService(this)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onStart() {
        super.onStart()

        val id = intent.getIntExtra(INTENT_PARAM_ID, -1)

        tmdbService.getMovieDetail(id, success = { movie ->
            movie?.let { movie ->
                findViewById<TextView>(R.id.movieTitle).text = movie.title
                findViewById<TextView>(R.id.movieRating).text = getString(
                    R.string.votes,
                    movie.averageVote.toString(),
                    movie.votesNumber.toString()
                )
                findViewById<TextView>(R.id.movieOverview).text = movie.overview

                // log rating and cast
                println("Movie rating: ${movie.voteAverage}")
                println("Movie cast: ${movie.cast?.map { cast -> cast.name }}")
            }
        }, failure = {})
    }

    companion object {
        const val INTENT_PARAM_ID = "movieId"
    }
}