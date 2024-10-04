package com.sarpertezel.movieapp.presentation.movie_detail

import com.sarpertezel.movieapp.domain.model.MovieDetail

data class MovieDetailState (val isLoading : Boolean = true,
    val movie : MovieDetail? = null,
    val error : String = ""
)
