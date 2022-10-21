package com.imt.tmdbpremium.datasources.remote

import android.os.Build
import androidx.annotation.RequiresApi
import com.imt.tmdbpremium.entities.Cast
import com.imt.tmdbpremium.entities.Movie
import java.time.LocalDate

class MockDataSource {
    val movies: List<Movie> = listOf(
        Movie(
            id = 1,
            title = "Interstellar",
            averageVote = 8.6f,
            votesNumber = 9999,
            overview = "Best sci-fi movie ever",
            cast = listOf(
                Cast("Matthew McConaughey", "Cooper"),
                Cast("Anne Hathaway", "Brand"),
                Cast("Jessica Chastain", "Murph"),
                Cast("Michael Caine", "Professor Brand"),
            )
        ),
        Movie(
            id = 2,
            title = "The Batman",
            averageVote = 7.9f,
            votesNumber = 9999,
            overview = "Best Batman movie ever",
            cast = listOf(
                Cast("Robert Pattinson", "Bruce Wayne"),
                Cast("Zoe Kravitz", "Selina Kyle"),
                Cast("Paul Dano", "Edward Nashton"),
                Cast("Jeffrey Wright", "James Gordon"),
            )
        ),
        Movie(
            id = 3,
            title = "Fight Club",
            averageVote = 8.8f,
            votesNumber = 9999,
            overview = "Best movie ever",
            cast = listOf(
                Cast("Edward Norton", "The Narrator"),
                Cast("Brad Pitt", "Tyler Durden"),
                Cast("Helena Bonham Carter", "Marla Singer"),
                Cast("Meat Loaf", "Robert Paulson"),
            )
        )
    )
}
