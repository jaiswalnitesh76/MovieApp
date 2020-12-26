package com.example.movieapp.Adapter


import android.opengl.Visibility
import android.view.LayoutInflater
import android.view.View
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.solver.widgets.ConstraintWidget.VISIBLE
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.Model.MovieImage
import com.example.movieapp.Model.MovieModelX
import com.example.movieapp.Model.ResultX


import com.example.movieapp.R

import com.squareup.picasso.Picasso


class MovieAdapter(private val arrList: Array<ResultX>) : RecyclerView.Adapter<CustomViewHolder>()
{

    override fun getItemCount()=arrList.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater=LayoutInflater.from(parent?.context)
        val cellRow=layoutInflater.inflate(R.layout.singlerow_layout_movie_details,parent,false)
        return CustomViewHolder(cellRow)
    }
    override fun onBindViewHolder(holder: CustomViewHolder, position: Int)
    {
        val current_movie : ResultX = arrList[position]


        holder.item_title.text = "Movie Name: "+current_movie.title
        holder.item_release_date.text = "Release: " +current_movie.release_date
        holder.item_title_sm.text = "Tittle: "+current_movie.title
        holder.item_lang.text= "Language: "+current_movie.original_language
        holder.item_avg.text= "Vote: "+current_movie.vote_average.toString()
        holder.item_count.text= "Count: "+current_movie.vote_count.toString()
        holder.item_popularity.text= "Popularity: "+current_movie.popularity.toString()
        holder.item_overview.text="Overview: " +current_movie.overview

        Picasso.get().load(current_movie.backdrop_path).into(holder.item_img)
        Picasso.get().load(current_movie.poster_path).into(holder.item_imgView_poster)

        holder.item_movie_details.setOnClickListener(){
        holder.item_layout.visibility= View.VISIBLE
        holder.item_movie_details.visibility=View.GONE
        }

    }
}


class CustomViewHolder(view: View): RecyclerView.ViewHolder(view)
{
    val item_img : ImageView= view.findViewById(R.id.imgView_movie)
    val item_title: TextView = view.findViewById(R.id.textView_title)
    val item_release_date : TextView = view.findViewById(R.id.textView_release_date)
    val item_lang : TextView = view.findViewById(R.id.textView_lang)
    val item_title_sm : TextView = view.findViewById(R.id.textView_title_sm)
    val item_avg : TextView = view.findViewById(R.id.textView_avg)
    val item_count : TextView = view.findViewById(R.id.textView_votecount)
    val item_popularity : TextView = view.findViewById(R.id.textView_popularity)
    val item_overview: TextView = view.findViewById(R.id.textView_overview)
    val item_imgView_poster : ImageView = view.findViewById(R.id.imgView_poster)
    val item_movie_details : TextView = view.findViewById(R.id.deatils)
    val item_layout : LinearLayout = view.findViewById(R.id.movie_deatils)



}