package com.example.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.Adapter.MovieAdapter
import com.example.movieapp.Model.MovieModelX
import com.example.movieapp.Model.ResultX
import com.example.movieapp.Presenter.MoviePresenter

class MainActivity : AppCompatActivity(),MoviePresenter.View {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var presenter : MoviePresenter = MoviePresenter(this)
        presenter.getMoviesData(this)

    }

    override fun setData(arrayList: Array<ResultX>) {
        Log.e("as", "Allah $arrayList")
        var adapterrv = MovieAdapter(arrayList)
        var recyclerView : RecyclerView= findViewById(R.id.recyclerView)
        var linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = adapterrv
    }
}