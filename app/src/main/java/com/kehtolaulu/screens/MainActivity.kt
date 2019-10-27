package com.kehtolaulu.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kehtolaulu.screens.account.AccountFragment
import com.kehtolaulu.screens.payment.PaymentFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, AccountFragment())
            .commit()
    }
}
