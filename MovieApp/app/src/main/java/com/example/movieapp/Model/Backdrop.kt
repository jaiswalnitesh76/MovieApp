package com.example.movieapp.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Backdrop(
        @SerializedName("aspect_ratio")
        @Expose
    val aspect_ratio: Double,
        @SerializedName("file_path")
        @Expose
    val file_path: String,
        @SerializedName("height")
        @Expose
    val height: Int,
        @SerializedName("iso_639_1")
        @Expose
    val iso_639_1: String,
        @SerializedName("vote_average")
        @Expose
    val vote_average: Double,
        @SerializedName("vote_count")
        @Expose
    val vote_count: Int,
        @SerializedName("width")
        @Expose
    val width: Int
)