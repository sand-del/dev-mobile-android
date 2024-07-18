package com.example.android_tp.compose.movie

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android_tp.movie.Movie
import com.example.android_tp.ui.theme.Android_TPTheme
import com.example.android_tp.ui.theme.TemplateFormPage

class ListMovieComposeActivity : ComponentActivity() {

    lateinit var movieComposeViewModel: MovieComposeViewModel;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Instancier le viewmodel
        movieComposeViewModel = MovieComposeViewModel()

        enableEdgeToEdge()
        setContent {
            Android_TPTheme {
                ListMovieContentPage(movieComposeViewModel)
            }
        }

        // Par défaut quand on arrive sur l'ecran
        // récupérer les films
        movieComposeViewModel.syncMovies();
    }
}

/**
 * Afficher la page
 */
@Composable
fun ListMovieContentPage(movieComposeViewModel: MovieComposeViewModel) {
    TemplateFormPage {
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { movieComposeViewModel.syncMovies() }) {
            Text(text = "Appeler l'API")
        }
        ListMovie(movieComposeViewModel)
    }
}

/**
 * Afficher la liste
 */
@Composable
fun ListMovie(movieComposeViewModel: MovieComposeViewModel) {
    // Ecouter implicitement les changements de la liste films dans le viewmodel
    val movies by movieComposeViewModel.movies.collectAsState()

    LazyColumn {
        items(movies) { movie ->
            MovieListItem(movie)
        }
    }
}

/**
 * Designer un film dans une liste
 */
@Composable
fun MovieListItem(movie: Movie) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Row(modifier = Modifier.padding(10.dp)) {
            Text(text = "Id : ${movie.id.toString()} - ")
            Text(text = "${movie.title}")
        }
    }
}


@SuppressLint("StateFlowValueCalledInComposition")
@Preview(showBackground = true)
@Composable
fun ListMovieComposeActivityPreview() {
    val viewModelPreview = MovieComposeViewModel()
    viewModelPreview.movies.value = listOf(
        Movie(1, "Titre 1"),
        Movie(2, "Titre 2"),
        Movie(2, "Titre 3"));

    Android_TPTheme {
        ListMovieContentPage(viewModelPreview)
    }
}