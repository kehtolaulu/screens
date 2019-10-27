package com.kehtolaulu.screens.account

class DateItem(val date: String) : MoneyItem() {
    override val type: Int
        get() = DATE
}
