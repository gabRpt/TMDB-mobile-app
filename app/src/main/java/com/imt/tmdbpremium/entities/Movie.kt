package com.imt.tmdbpremium.entities

import java.time.LocalDate
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(
    var id: Int = -1,
    var posterUrl: String? = null,
    var title: String? = null,
    var releaseDate: String? = null,
    var overview: String? = null,
    var voteAverage: Float? = null,
    var voteCount: Int? = null,
    var cast: List<Cast>? = null,
    val backdropUrl: String? = null,
    val averageVote: Float = 0f,
    val votesNumber: Int = 0,
) : Parcelable

