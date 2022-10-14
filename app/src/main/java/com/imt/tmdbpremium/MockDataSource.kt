package com.imt.tmdbpremium

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

class MockDataSource {
    @RequiresApi(Build.VERSION_CODES.O)
    val movies: List<Movie> = listOf(
        Movie(
            id = 1,
            title = "Interstellar",
            releaseDate = LocalDate.of(2014, 11, 5),
            overview = "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
            voteAverage = 8.3f,
            voteCount = 10000,
            cast = listOf(
                Cast("Matthew McConaughey", "Cooper"),
                Cast("Anne Hathaway", "Brand"),
                Cast("Jessica Chastain", "Murph"),
                Cast("Michael Caine", "Professor Brand"),
                Cast("John Lithgow", "Mann")
            )
        ),
        Movie(
            id = 2,
            title = "The Batman",
            releaseDate = LocalDate.of(2022, 3, 2),
            overview = "The Dark Knight of Gotham City begins his war on crime with his first major enemy being the clownishly homicidal Joker.",
            voteAverage = 9.3f,
            voteCount = 19000,
            cast = listOf(
                Cast("Robert Pattinson", "Bruce Wayne"),
                Cast("Zoe Kravitz", "Selina Kyle"),
                Cast("Paul Dano", "Edward Nashton"),
                Cast("Colin Farrell", "Penguin"),
                Cast("Andy Serkis", "Alfred Pennyworth")
            )
        ),
        Movie(
            id = 3,
            title = "Fight Club",
            releaseDate = LocalDate.of(1999, 11, 10),
            overview = "An insomniac office worker and a devil-may-care soapmaker form an underground fight club that evolves into something much, much more.",
            voteAverage = 8.8f,
            voteCount = 9457,
            cast = listOf(
                Cast("Edward Norton", "The Narrator"),
                Cast("Brad Pitt", "Tyler Durden"),
                Cast("Meat Loaf", "Robert 'Bob' Paulsen"),
                Cast("Jared Leto", "Angel Face"),
                Cast("Helena Bonham Carter", "Marla Singer")
            )
        )
    )
}
