package com.kehtolaulu.screens.account

class TransferItem(val title: String, val money: String) : MoneyItem() {
    override val type: Int
        get() = TRANSFER
}
