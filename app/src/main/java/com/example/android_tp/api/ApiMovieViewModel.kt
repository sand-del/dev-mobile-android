package com.example.android_tp.api

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android_tp.movie.Movie
import kotlinx.coroutines.launch

class ApiMovieViewModel : ViewModel() {

    var movies = MutableLiveData<List<Movie>>()

    fun syncMovie() {

        viewModelScope.launch {

            movies.value = MovieService.MovieApiSingleton.movieService.getMovies();
        }
    }

}