package com.example.movieapp.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MovieImage(
        @SerializedName("backdrops")
        @Expose
    val backdrops: List<Backdrop>,
        @SerializedName("id")
        @Expose
    val id: Int,
        @SerializedName("posters")
        @Expose
    val posters: List<Poster>
)