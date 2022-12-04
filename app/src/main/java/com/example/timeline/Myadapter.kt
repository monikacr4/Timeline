package com.example.timeline

import TimelinePost
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Myadapter(val requiredContext: Context, private val timeline: ArrayList<TimelinePost>):
    RecyclerView.Adapter<Myadapter.mytimelineViewHolder>(){

    class mytimelineViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview){

        val name: TextView = itemView.findViewById(R.id.names)
        val location: TextView= itemView.findViewById(R.id.location)
        val time: TextView=itemView.findViewById(R.id.time)
        val image: ImageView=itemView.findViewById(R.id.image)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mytimelineViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_items,parent,false)
        return mytimelineViewHolder(view)

    }

    override fun onBindViewHolder(holder: mytimelineViewHolder, position: Int) {
        holder.name.text = timeline[position].name
        holder.location.text = timeline[position].location
        holder.time.text = timeline[position].time
        holder.image.setImageResource(timeline[position].image)
    }

    override fun getItemCount(): Int {
        return timeline.size
    }
}