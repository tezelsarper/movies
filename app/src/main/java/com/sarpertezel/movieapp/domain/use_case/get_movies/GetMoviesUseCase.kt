package com.sarpertezel.movieapp.domain.use_case.get_movies

import android.net.http.HttpException
import com.sarpertezel.movieapp.data.remote.dto.toMovieList
import com.sarpertezel.movieapp.domain.model.Movie
import com.sarpertezel.movieapp.domain.repository.MovieRepository
import com.sarpertezel.movieapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOError


import javax.inject.Inject

class GetMoviesUseCase @Inject constructor(private val repository : MovieRepository) {

        fun executeGetMovies(search : String) : Flow<Resource<List<Movie>>> = flow {
        try {
            emit(Resource.Loading())
            val movieList = repository.getMovies(search)
            if(movieList.Response.equals("True"))
            {
                emit(Resource.Success(movieList.toMovieList()))
            }
            else
            {
                emit(Resource.Error("No Movie Found!"))
            }
        }
        catch (e : IOError)
        {
            emit(Resource.Error("No Internet Connection!"))
        }

    }


}