package com.example.android_tp.api

import com.example.android_tp.api.RetrofitTool.Companion.retrofit
import com.example.android_tp.movie.Movie
import retrofit2.http.GET

interface MovieService {

    //endpoint, l'url de fin après le base url
    @GET("movies.json")
    suspend fun getMovies(): List<Movie>

    // singleton
    object MovieApiSingleton {
        val movieService: MovieService by lazy {
            retrofit.create(MovieService::class.java)

        }
    }
}