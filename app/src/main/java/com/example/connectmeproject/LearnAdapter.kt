package com.example.connectmeproject

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class LearnAdapter(private val learnList: ArrayList<Learning>):
    RecyclerView.Adapter<LearnAdapter.LearnViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearnViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,
        parent,false)
        return LearnViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: LearnViewHolder, position: Int) {

        val currentItem = learnList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text = currentItem.Heading
        holder.tvDescription.text = currentItem.Description

    }

    override fun getItemCount(): Int {
        return learnList.size
    }

    class LearnViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val titleImage : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val tvHeading  : TextView = itemView.findViewById(R.id.tvHeading)
        val tvDescription : TextView = itemView.findViewById(R.id.tvDescription)

    }
}