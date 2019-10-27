package com.kehtolaulu.screens.samokatus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kehtolaulu.screens.MainActivity
import com.kehtolaulu.screens.R
import kotlinx.android.synthetic.main.fragment_samokatus.*
import kotlinx.android.synthetic.main.toolbar_samokatus.*

class SamokatusFragment  : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_samokatus, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity).setSupportActionBar(samokatusToolbar)
        stories.adapter = StoryAdapter()
        trips.adapter = TripAdapter()
    }
}
