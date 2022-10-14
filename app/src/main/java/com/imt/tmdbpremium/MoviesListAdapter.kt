package com.imt.tmdbpremium

import android.annotation.SuppressLint
import android.content.ClipData.newIntent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MoviesListAdapter(  ) : RecyclerView.Adapter<MoviesListAdapter.ViewHolder>() {

    var dataSet: List<Movie> = emptyList()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            notifyDataSetChanged()
            field = value
        }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView
        val releaseDate: TextView

        init {
            with(view) {
                title = findViewById(R.id.movieTitleItem)
                releaseDate = findViewById(R.id.movieReleaseDateItem)

                setOnClickListener {
                    val movie = dataSet[adapterPosition]
                    val intent = MovieDetailActivity.newIntent(context, movie.id)
                    context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.movies_list_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = dataSet[position].title
        holder.releaseDate.text = dataSet[position].releaseDate.toString()
    }

    override fun getItemCount(): Int =
        dataSet.size
}

