package com.sarpertezel.movieapp.data.repository

import com.sarpertezel.movieapp.data.remote.MovieAPI
import com.sarpertezel.movieapp.data.remote.dto.MovieDetailDTO
import com.sarpertezel.movieapp.data.remote.dto.MoviesDTO
import com.sarpertezel.movieapp.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImp @Inject constructor(private val API : MovieAPI) : MovieRepository {
    override suspend fun getMovies(search: String): MoviesDTO {
        return API.getMovies(search)
    }

    override suspend fun getMovieDetail(imdbId: String): MovieDetailDTO {
        return API.getMovieDetail(imdbId)
    }


}