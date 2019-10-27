package com.kehtolaulu.screens.account

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kehtolaulu.screens.R

class TransferAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var trips: List<MoneyItem> = arrayListOf(
        DateItem("ВЧЕРА"),
        TransferItem("Зарплата", "+ 22578,81 \u20BD"),
        TransferItem("Вывод денег", "- 1050 \u20BD"),
        DateItem("29 СЕНТЯБРЯ, ПН"),
        TransferItem("Вывод денег", "- 1750 \u20BD"),
        TransferItem("Бонусы", "+ 750 \u20BD"),
        DateItem("25 СЕНТЯБРЯ, ПН"),
        TransferItem("Аванс", "+ 20000 \u20BD")
    )

    override fun getItemViewType(position: Int): Int {
        return trips[position].type
    }

    override fun getItemCount(): Int = trips.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == MoneyItem.DATE) {
            val itemView =
                LayoutInflater.from(parent.context).inflate(R.layout.date_item, parent, false)
            return DateViewHolder(itemView)
        } else {
            val itemView =
                LayoutInflater.from(parent.context).inflate(R.layout.transfer_item, parent, false)
            return TransferViewHolder(itemView)
        }
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        val type = getItemViewType(position)
        if (type == MoneyItem.DATE) {
            val date = trips[position] as DateItem
            val holder = viewHolder as DateViewHolder
            holder.bind(date)
        } else {
            val transfer = trips[position] as TransferItem
            val holder = viewHolder as TransferViewHolder
            holder.bind(transfer)
        }
    }
}
