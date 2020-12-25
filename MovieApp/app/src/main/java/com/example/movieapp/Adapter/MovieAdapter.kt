package com.example.movieapp.Adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
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

        holder.item_title.text = "Name: "+current_movie.title
        holder.item_rating.text = "Ratings: " +current_movie.release_date
        holder.item_action.text = current_movie.overview
        holder.item_time.text= current_movie.original_language

        Picasso.get().load(current_movie.poster_path).into(holder.item_img)
    }
}
class CustomViewHolder(view: View): RecyclerView.ViewHolder(view)
{
    val item_img : ImageView= view.findViewById(R.id.imgView_movie)
    val item_title: TextView = view.findViewById(R.id.textView_title)
    val item_rating : TextView = view.findViewById(R.id.textView_rate)
    val item_time : TextView = view.findViewById(R.id.textView_times)
    val item_action : TextView = view.findViewById(R.id.textView_actions)


}