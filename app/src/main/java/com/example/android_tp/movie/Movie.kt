package com.example.android_tp.movie

import com.squareup.moshi.Json

class Movie(
    var id: Int = 0,
    var title: String = "",
    @Json(name = "description") var synopsis: String = "",
    var duration: Int = 0,
    var year: Int = 0
) {
}