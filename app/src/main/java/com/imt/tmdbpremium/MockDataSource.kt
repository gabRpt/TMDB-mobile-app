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
            releaseDate = LocalDate.of(2014, 11, 5)
        ),
        Movie(
            id = 2,
            title = "The Batman",
            releaseDate = LocalDate.of(2022, 3, 2)
        ),
        Movie(
            id = 3,
            title = "Fight Club",
            releaseDate = LocalDate.of(1999, 11, 10)
        )
    )
}
