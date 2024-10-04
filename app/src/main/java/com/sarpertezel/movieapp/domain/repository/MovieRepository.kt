package com.sarpertezel.movieapp.domain.repository

import com.sarpertezel.movieapp.data.remote.dto.MovieDetailDTO
import com.sarpertezel.movieapp.data.remote.dto.MoviesDTO

interface MovieRepository {


    suspend fun getMovies(search : String ) : MoviesDTO
    suspend fun getMovieDetail(imdbId : String) : MovieDetailDTO

}