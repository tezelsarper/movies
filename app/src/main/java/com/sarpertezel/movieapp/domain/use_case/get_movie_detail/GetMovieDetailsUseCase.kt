package com.sarpertezel.movieapp.domain.use_case.get_movie_detail

import com.sarpertezel.movieapp.data.remote.dto.toMovieDetail
import com.sarpertezel.movieapp.data.remote.dto.toMovieList
import com.sarpertezel.movieapp.domain.model.Movie
import com.sarpertezel.movieapp.domain.model.MovieDetail
import com.sarpertezel.movieapp.domain.repository.MovieRepository
import com.sarpertezel.movieapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOError
import javax.inject.Inject

class GetMovieDetailsUseCase @Inject constructor(private val repository: MovieRepository) {

    fun executeGetMovieDetails(imdbId : String) : Flow<Resource<MovieDetail>> = flow {
        try {
            emit(Resource.Loading())
            val movieDetail = repository.getMovieDetail(imdbId)
            emit(Resource.Success(movieDetail.toMovieDetail()))
        }
        catch (e : IOError)
        {
            emit(Resource.Error("No Internet Connection!"))
        }

    }


}