package com.sarpertezel.movieapp.data.remote

import com.sarpertezel.movieapp.data.remote.dto.MovieDetailDTO
import com.sarpertezel.movieapp.data.remote.dto.MoviesDTO
import com.sarpertezel.movieapp.util.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI  {

    //https://www.omdbapi.com/?apikey=bc51f19d&i=tt0372784
    //https://www.omdbapi.com/?apikey=bc51f19d&s=batman


    @GET(".")
    suspend fun getMovies(
        @Query("s") searchString : String,
        @Query("apikey") apiKey : String = API_KEY

    ): MoviesDTO


    @GET(".")
    suspend fun getMovieDetail(
        @Query("i") imdbId : String,
        @Query("apikey") apiKey : String = API_KEY
    ) : MovieDetailDTO

}