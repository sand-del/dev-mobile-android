package com.example.android_tp.movie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import com.example.android_tp.R
import com.example.android_tp.databinding.ActivityMovieBinding

class MovieActivity : ComponentActivity() {
    lateinit var viewBinding: ActivityMovieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_movie)

        val movies = listOf(
            Movie(
                1,
                "Inception",
                "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.",
                148,
                2010
            ),
            Movie(
                2,
                "The Shawshank Redemption",
                "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",
                142,
                1994
            ),
            Movie(
                3,
                "The Godfather",
                "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
                175,
                1972
            ),
            Movie(
                4,
                "The Dark Knight",
                "When the menace known as the Joker emerges from his mysterious past, he wreaks havoc and chaos on the people of Gotham.",
                152,
                2008
            ),
            Movie(
                5,
                "Pulp Fiction",
                "The lives of two mob hitmen, a boxer, a gangster, and his wife intertwine in four tales of violence and redemption.",
                154,
                1994
            )
        )

        val adapter = MovieAdapter(this, movies)

        viewBinding.lvMovie.adapter = adapter

    }
}