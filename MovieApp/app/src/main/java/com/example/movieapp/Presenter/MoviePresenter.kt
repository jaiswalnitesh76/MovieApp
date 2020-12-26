package com.example.movieapp.Presenter

import android.content.Context
import android.util.Log
import com.example.movieapp.Interface.CommonResponseListener
import com.example.movieapp.Model.MovieImage
import com.example.movieapp.Model.MovieModelX
import com.example.movieapp.Model.ResultX
import com.example.movieapp.Network.NetworkAccessor
import com.example.movieapp.Network.WebUrls
import com.google.gson.Gson
import com.google.gson.JsonElement
import org.json.JSONObject

class MoviePresenter(var view : View ) : CommonResponseListener {
    private lateinit var arrList:Array<ResultX>
     fun getMoviesData(context: Context) {
        var networkAccessor= NetworkAccessor()
        var jsoPayload = JSONObject()
        networkAccessor.run {
            commonNetworkCall(this@MoviePresenter,jsoPayload,context, WebUrls.BASE_URL,WebUrls.GET_MOVIES)
        }
    }

    override fun onSuccessResponse(result: JsonElement?, from: String, code: Int) {
        Log.e("result", "Wel $result")
        var gson = Gson()

        val movieModel = gson.fromJson(result, MovieModelX::class.java)
        arrList = movieModel.resultXES.toTypedArray()
        if (arrList.isNotEmpty()) {
            setDataToAdapter()
        }

    }

    private fun setDataToAdapter() {
        view.setData(arrList)
    }

    override fun onError(msg: String, fromUrl: String) {
        println("Error Message:-$msg")
    }

    interface  View{
        fun setData(arrayList: Array<ResultX>)
    }
}