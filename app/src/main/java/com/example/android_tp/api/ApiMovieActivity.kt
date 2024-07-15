package com.example.android_tp.api

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.android_tp.R
import com.example.android_tp.databinding.ActivityApiMovieBinding
import com.example.android_tp.movie.Movie
import com.example.android_tp.movie.MovieAdapter

class ApiMovieActivity : ComponentActivity() {
    lateinit var viewBinding: ActivityApiMovieBinding
    lateinit var apiMovieViewModel: ApiMovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_api_movie)

        //instancier un view model
        apiMovieViewModel = ApiMovieViewModel();
        // Quand clique sur le bouton => appel API
        viewBinding.btnCallApiMovie.setOnClickListener {
            viewBinding.lvApiMovie.adapter = MovieAdapter(this, listOf<Movie>())
            apiMovieViewModel.syncMovie()
        }

        apiMovieViewModel.movies.observe(this, Observer {

            val adapter = MovieAdapter(this, apiMovieViewModel.movies.value!!)
            viewBinding.lvApiMovie.adapter = adapter
        })
    }
}