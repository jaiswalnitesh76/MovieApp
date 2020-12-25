package com.example.movieapp.Interface

import com.google.gson.JsonElement

interface CommonResponseListener {
    fun onSuccessResponse(result: JsonElement?, from: String, code: Int)
    fun onError(msg: String, fromUrl: String)
}