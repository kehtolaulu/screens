package com.kehtolaulu.screens.samokatus

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kehtolaulu.screens.R

class TripAdapter : RecyclerView.Adapter<TripViewHolder>() {
    var trips: List<Trip> = arrayListOf(
        Trip("Круиз с безвизовой Англией – 259€", "7 дней в апреле 2019 года - vandrouki"),
        Trip("Круиз с безвизовой Англией – 259€", "7 дней в апреле 2019 года - vandrouki"),
        Trip("Круиз с безвизовой Англией – 259€", "7 дней в апреле 2019 года - vandrouki"),
        Trip("Круиз с безвизовой Англией – 259€", "7 дней в апреле 2019 года - vandrouki"),
        Trip("Круиз с безвизовой Англией – 259€", "7 дней в апреле 2019 года - vandrouki"),
        Trip("Круиз с безвизовой Англией – 259€", "7 дней в апреле 2019 года - vandrouki"),
        Trip("Круиз с безвизовой Англией – 259€", "7 дней в апреле 2019 года - vandrouki"),
        Trip("Круиз с безвизовой Англией – 259€", "7 дней в апреле 2019 года - vandrouki"),
        Trip("Круиз с безвизовой Англией – 259€", "7 дней в апреле 2019 года - vandrouki"),
        Trip("Круиз с безвизовой Англией – 259€", "7 дней в апреле 2019 года - vandrouki"),
        Trip("Круиз с безвизовой Англией – 259€", "7 дней в апреле 2019 года - vandrouki")
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TripViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.trip_item, parent, false)
        return TripViewHolder(view)
    }

    override fun getItemCount(): Int = trips.size

    override fun onBindViewHolder(holder: TripViewHolder, position: Int) = holder.bind(trips[position])
}
