package com.imt.tmdbpremium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MovieDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
    }

    override fun onStart() {
        super.onStart()

        val movieId = 1;
        val movie = TmdbService().getMovieById(movieId)

        findViewById<TextView>(R.id.movieTitle).text = movie.title
        findViewById<TextView>(R.id.movieOverview).text = movie.overview
        findViewById<TextView>(R.id.movieRating).text = movie.averageVote.toString()
        findViewById<TextView>(R.id.movieCast).text = movie.cast.joinToString()
    }
}