package com.imt.tmdbpremium

class TmdbService {
    fun getMovieById(id: Int): Movie {
        return Movie(
            id = id,
            title = "Interstellar",
            overview = "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
            averageVote = 8.6f,
            cast = listOf("Matthew McConaughey", "Anne Hathaway", "Jessica Chastain"),
            posterUrl = "https://image.tmdb.org/t/p/w500/nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg",
            releaseDate = "2014-11-05"
        )
    }

    fun getLatestMoviesList(): List<Movie> {
        return listOf(
            Movie(
                id = 1,
                title = "Interstellar",
                overview = "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
                averageVote = 8.6f,
                cast = listOf("Matthew McConaughey", "Anne Hathaway", "Jessica Chastain"),
                posterUrl = "https://image.tmdb.org/t/p/w500/nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg",
                releaseDate = "2014-11-05"
            ),
            Movie(
                id = 2,
                title = "The Dark Knight",
                overview = "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, the caped crusader must come to terms with one of the greatest psychological tests of his ability to fight injustice.",
                averageVote = 8.6f,
                cast = listOf("Christian Bale", "Heath Ledger", "Aaron Eckhart"),
                posterUrl = "https://image.tmdb.org/t/p/w500/1hRoyzDtpgMU7Dz4JF22RANzQO7.jpg",
                releaseDate = "2008-07-16"
            ),
            Movie(
                id = 3,
                title = "Inception",
                overview = "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a CEO.",
                averageVote = 8.3f,
                cast = listOf("Leonardo DiCaprio", "Joseph Gordon-Levitt", "Ellen Page"),
                posterUrl = "https://image.tmdb.org/t/p/w500/s2bT29y0ngXxxu2IA8AOzzXTRhd.jpg",
                releaseDate = "2010-07-15"
            ),
            Movie(
                id = 4,
                title = "The Prestige",
                overview = "After a tragic accident two stage magicians engage in a battle to create the ultimate illusion while sacrificing everything they have to outwit each other.",
                averageVote = 8.5f,
                cast = listOf("Christian Bale", "Hugh Jackman", "Scarlett Johansson"),
                posterUrl = "https://image.tmdb.org/t/p/w500/2Fk3AB8E9dYIBc2ywJkxk8BTyhc.jpg",
                releaseDate = "2006-10-19"
            ),
        )
    }
}