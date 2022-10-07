package com.imt.tmdbpremium

data class Movie(
    val id: Int,
    val posterUrl: String,
    val title: String,
    val averageVote: Float,
    val releaseDate: String,
    val overview: String,
    val cast: List<String>
)
