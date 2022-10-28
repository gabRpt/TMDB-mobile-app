package com.imt.tmdbpremium.entities.transformers

import com.imt.tmdbpremium.datasources.remote.dtos.MovieDto
import com.imt.tmdbpremium.datasources.remote.dtos.MoviesListDto
import com.imt.tmdbpremium.entities.Movie

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
            releaseDate = it.release_date,
        )
    }

    return movies
}

fun movieDtoFromMovie(movieDto: MovieDto): Movie {
    return Movie(
        id = movieDto.id,
        posterUrl = movieDto.poster_path,
        backdropUrl = movieDto.backdrop_path,
        title = movieDto.title,
        averageVote = movieDto.vote_average,
        votesNumber = movieDto.vote_count,
        overview = movieDto.overview,
        releaseDate = movieDto.release_date,
    )
}