package com.sarpertezel.movieapp.data.remote.dto

import com.sarpertezel.movieapp.domain.model.Movie

data class MoviesDTO(
    val Response: String,
    val Search: List<Search>,
    val totalResults: String
)

fun MoviesDTO.toMovieList() : List<Movie> {

    return Search.map { search -> Movie(search.Poster, search.Title, search.Year, search.imdbID)  }

}