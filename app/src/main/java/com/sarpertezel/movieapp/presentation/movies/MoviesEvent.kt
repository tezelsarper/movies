package com.sarpertezel.movieapp.presentation.movies


sealed class MoviesEvent {
    data class Search(val searchString : String) : MoviesEvent()
}