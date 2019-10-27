package com.kehtolaulu.screens.samokatus

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.story_item.view.*

class StoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(name: String) {
        itemView.nameTextView.text = name
    }
}
