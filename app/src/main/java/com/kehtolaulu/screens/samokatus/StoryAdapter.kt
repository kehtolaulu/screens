package com.kehtolaulu.screens.samokatus

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kehtolaulu.screens.R

class StoryAdapter : RecyclerView.Adapter<StoryViewHolder>() {
    var stories: List<String> =
        arrayListOf("Подписки", "Авиабилеты", "Туры", "Отели")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.story_item, parent, false)
        return StoryViewHolder(view)
    }

    override fun getItemCount(): Int = stories.size

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) =
        holder.bind(stories[position])
}
