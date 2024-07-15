package com.example.android_tp.movie

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.android_tp.R

class MovieAdapter(context: Context, movies: List<Movie>) :
    ArrayAdapter<Movie>(context, 0, movies) {

    //surcharger la façon dont on affiche l'élément dans une listview
    //Param 1 -> position : quel est l'index du film dans la liste de film (dans la donnée, dans le List<Movie>)
    //on aura besoin de la position pour retrouver le film associer à la cellule/ligne
    //Param 2 -> Notre cemmule designé (il faut le caster pour l'exploiter)
    //Param 3 -> parent : La ListView (comme un ul en html)
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // 1-- Retrouver notre cellule xml donc le list_item_movie.xml
        //itemView devient notre cellule xml
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.list_item_movie, parent, false)
        }

        // 2-- Retrouver l'instance Film associé à la cellule (get par l'index d'une List<Movie>)
        val movie = getItem(position)

        // 3-- Alimenter la textview qui contient le titre du film par rapport à mon film
        //-- récupérer le textview

        val idTextView = itemView!!.findViewById<TextView>(R.id.tvMovieId)
        val titleTextView = itemView!!.findViewById<TextView>(R.id.tvMovieTitle)
        val synTextView = itemView!!.findViewById<TextView>(R.id.tvMovieSyn)
        //-- changer le texte du textview
        idTextView.text = movie?.id.toString()
        titleTextView.text = movie?.title
        synTextView.text = movie?.synopsis

        return itemView
    }
}