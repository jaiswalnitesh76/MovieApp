package com.example.movieapp.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MovieModelX(
    @SerializedName("dates")
    @Expose
    val dates: Dates,
    @SerializedName("page")
   @Expose
    val page: Int,
    @SerializedName("results")
    @Expose
    val resultXES: List<ResultX>,
    @SerializedName("total_pages")
    @Expose
    val total_pages: Int,
    @SerializedName("total_results")
    @Expose
    val total_results: Int

)