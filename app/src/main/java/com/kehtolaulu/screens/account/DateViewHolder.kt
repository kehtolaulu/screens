package com.kehtolaulu.screens.account

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.date_item.view.*

class DateViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(dateItem: DateItem) {
        itemView.title.text = dateItem.date
    }
}
