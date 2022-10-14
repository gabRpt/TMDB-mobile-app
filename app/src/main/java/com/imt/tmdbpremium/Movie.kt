package com.imt.tmdbpremium

import java.time.LocalDate

data class Movie(
    var id: Int = -1,
    var posterUrl: String? = null,
    var title: String? = null,
    var releaseDate: LocalDate? = null,
    var overview: String? = null,
    var voteAverage: Float? = null,
    var voteCount: Int? = null,
    var cast: List<Cast>? = null,
)

