package com.imt.tmdbpremium.datasources.remote

import android.os.Build
import androidx.annotation.RequiresApi
import com.imt.tmdbpremium.entities.Cast
import com.imt.tmdbpremium.entities.Movie

class MockDataSource {
    @RequiresApi(Build.VERSION_CODES.O)
    val movies: List<Movie> = listOf(
        Movie(
            id = 1,
            title = "Interstellar",
            averageVote = 8.6f,
            votesNumber = 9999,
            overview = "Best sci-fi movie ever",
            cast = listOf(
                Cast(name = "Matthew McConaughey"),
                Cast(name = "Jessica Chastain"),
                Cast(name = "Anne Hathaway"),
                Cast(name = "Michael Caine"),
            )
        ),
        Movie(
            id = 2,
            title = "The Batman",
            averageVote = 7.9f,
            votesNumber = 9999,
            overview = "Best Batman movie ever",
            cast = listOf(
                Cast(name = "Robert Pattinson"),
                Cast(name = "Zoe Kravitz"),
                Cast(name = "Paul Dano"),
            )
        ),
        Movie(
            id = 3,
            title = "Fight Club",
            averageVote = 8.8f,
            votesNumber = 9999,
            overview = "Best movie ever",
            cast = listOf(
                Cast(name = "Brad Pitt"),
                Cast(name = "Edward Norton"),
                Cast(name = "Helena Bonham Carter"),
            )
        )
    )
}
