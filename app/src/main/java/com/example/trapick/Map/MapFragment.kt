package com.example.trapick.Map

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.trapick.MainActivity
import com.example.trapick.R
import com.google.android.gms.maps.MapView
import kotlinx.android.synthetic.main.fragment_map.view.*


class MapFragment : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mView = inflater.inflate(R.layout.fragment_map, container, false)
        (activity as MainActivity?)!!.setActionBarTitle("지도")


        return mView
    }


}
