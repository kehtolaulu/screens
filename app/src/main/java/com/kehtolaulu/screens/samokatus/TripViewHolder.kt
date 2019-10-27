package com.kehtolaulu.screens.samokatus

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.trip_item.view.*

class TripViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(trip: Trip) {
        itemView.titleTextView.text = trip.name
        itemView.descTextView.text = trip.description
    }
}
