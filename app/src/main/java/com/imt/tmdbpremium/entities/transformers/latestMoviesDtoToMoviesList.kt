package com.imt.tmdbpremium.entities.transformers

import android.os.Build
import androidx.annotation.RequiresApi
import com.imt.tmdbpremium.datasources.remote.dtos.MovieDto
import com.imt.tmdbpremium.datasources.remote.dtos.MoviesListDto
import com.imt.tmdbpremium.entities.Movie
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
fun moviesListDtoToMoviesList(latestMoviesDto: MoviesListDto): List<Movie> {
    val movies = latestMoviesDto.results.map {
        Movie(
            id = it.id,
            posterUrl = it.poster_path,
            backdropUrl = it.backdrop_path,
            title = it.title,
            averageVote = it.vote_average,
            votesNumber = it.vote_count,
            overview = it.overview,
            releaseDate = LocalDate.parse(it.release_date),
        )
    }

    return movies
}

@RequiresApi(Build.VERSION_CODES.O)
fun movieDtoFromMovie(movieDto: MovieDto): Movie {
    return Movie(
        id = movieDto.id,
        posterUrl = movieDto.poster_path,
        backdropUrl = movieDto.backdrop_path,
        title = movieDto.title,
        averageVote = movieDto.vote_average,
        votesNumber = movieDto.vote_count,
        overview = movieDto.overview,
        releaseDate = LocalDate.parse(movieDto.release_date),
    )
}