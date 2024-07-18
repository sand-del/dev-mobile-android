package com.example.android_tp.compose.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android_tp.api.MovieService
import com.example.android_tp.movie.Movie
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class MovieComposeViewModel : ViewModel() {

    var movies = MutableStateFlow(listOf<Movie>());

    fun syncMovies(){
        // nettoyer la liste des films
        movies.value = listOf();

        // lancer une tâche de fond (Coroutine)
        viewModelScope.launch {
            // Appeler l'api
            // -- mettre la réponse de l'api dans movies donc notifier les changement
            movies.value = MovieService.MovieApiSingleton.movieService.getMovies();
        }
    }
}