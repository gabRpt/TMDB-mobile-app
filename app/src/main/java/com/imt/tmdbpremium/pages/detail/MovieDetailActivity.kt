package com.imt.tmdbpremium.pages.detail

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.imt.tmdbpremium.R
import com.imt.tmdbpremium.datasources.remote.MockDataSource

class MovieDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onStart() {
        super.onStart()

        val id = intent.getIntExtra(INTENT_PARAM_ID, -1)
        val movie = MockDataSource().movies.find { it.id == id }

        findViewById<TextView>(R.id.movieTitle).text = movie?.title
        findViewById<TextView>(R.id.movieRating).text = movie?.averageVote.toString()
        findViewById<TextView>(R.id.movieOverview).text = movie?.overview
        findViewById<TextView>(R.id.movieCast).text = movie?.cast.toString()
    }

    companion object {
        const val INTENT_PARAM_ID = "movieId"
    }
}