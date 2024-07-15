package com.example.android_tp.movie

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MovieViewModel : ViewModel() {
    var movie = MutableLiveData<Movie>(Movie());

}