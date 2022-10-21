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
        ),
        Movie(
            id = 4,
            title = "The Prestige",
            releaseDate = LocalDate.of(2006, 10, 19),
            overview = "After a tragic accident, two stage magicians engage in a battle to create the ultimate illusion while sacrificing everything they have to outwit each other.",
            voteAverage = 8.5f,
            voteCount = 8000,
            cast = listOf(
                Cast("Christian Bale", "Robert Angier"),
                Cast("Hugh Jackman", "Alfred Borden"),
                Cast("Scarlett Johansson", "Cleo Angier"),
                Cast("Michael Caine", "Nikola Tesla"),
                Cast("Piper Perabo", "Sarah Borden")
            )
        ),
        Movie(
            id = 5,
            title = "The Dark Knight",
            releaseDate = LocalDate.of(2008, 7, 18),
            overview = "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, the caped crusader must come to terms with one of the greatest psychological tests of his ability to fight injustice.",
            voteAverage = 8.9f,
            voteCount = 15000,
            cast = listOf(
                Cast("Christian Bale", "Bruce Wayne"),
                Cast("Heath Ledger", "Joker"),
                Cast("Aaron Eckhart", "Harvey Dent"),
                Cast("Michael Caine", "Alfred Pennyworth"),
                Cast("Maggie Gyllenhaal", "Rachel Dawes")
            )
        ),
        Movie(
            id = 6,
            title = "The Dark Knight Rises",
            releaseDate = LocalDate.of(2012, 7, 20),
            overview = "Eight years after the Joker's reign of anarchy, the Dark Knight, with the help of the enigmatic Selina, is forced from his imposed exile to save Gotham City, now on the edge of total annihilation, from the brutal",
            voteAverage = 8.4f,
            voteCount = 12000,
            cast = listOf(
                Cast("Christian Bale", "Bruce Wayne"),
                Cast("Tom Hardy", "Bane"),
                Cast("Anne Hathaway", "Selina Kyle"),
                Cast("Gary Oldman", "Commissioner Gordon"),
                Cast("Joseph Gordon-Levitt", "John Blake")
            )
        ),
        Movie(
            id = 7,
            title = "Inception",
            releaseDate = LocalDate.of(2010, 7, 16),
            overview = "A thief who steals corporate secrets through use of dream-sharing technology is given the inverse task of planting an idea into the mind of a CEO.",
            voteAverage = 8.8f,
            voteCount = 13000,
            cast = listOf(
                Cast("Leonardo DiCaprio", "Cobb"),
                Cast("Joseph Gordon-Levitt", "Arthur"),
                Cast("Ellen Page", "Ariadne"),
                Cast("Tom Hardy", "Eames"),
                Cast("Ken Watanabe", "Saito")
            )
        ),
        Movie(
            id = 8,
            title = "The Matrix",
            releaseDate = LocalDate.of(1999, 3, 31),
            overview = "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.",
            voteAverage = 8.7f,
            voteCount = 11000,
            cast = listOf(
                Cast("Keanu Reeves", "Neo"),
                Cast("Laurence Fishburne", "Morpheus"),
                Cast("Carrie-Anne Moss", "Trinity"),
                Cast("Hugo Weaving", "Agent Smith"),
                Cast("Gloria Foster", "Oracle")
            )
        ),
    )
}
