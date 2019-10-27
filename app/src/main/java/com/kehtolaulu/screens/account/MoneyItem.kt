package com.kehtolaulu.screens.account

abstract class MoneyItem {

    abstract val type: Int

    companion object {
        val DATE = 0
        val TRANSFER = 1
    }
}
