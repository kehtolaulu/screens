package com.kehtolaulu.screens.account

import android.graphics.Color
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.kehtolaulu.screens.R
import kotlinx.android.synthetic.main.transfer_item.view.*

class TransferViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(transferItem: TransferItem) {
        itemView.titleTextView.text = transferItem.title
        itemView.amountTextView.text = transferItem.money
        if (transferItem.money[0].equals("+")) {
            itemView.iconImageView.setImageResource(R.drawable.income)
            itemView.amountTextView.setTextColor(Color.parseColor("#008577"))
        } else {
            itemView.iconImageView.setImageResource(R.drawable.outcome)
            itemView.amountTextView.setTextColor(Color.BLACK)
        }
    }
}
