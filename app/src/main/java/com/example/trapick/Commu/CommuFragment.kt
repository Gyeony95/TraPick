package com.example.trapick.Commu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.trapick.MainActivity
import com.example.trapick.R


class CommuFragment : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mView = inflater.inflate(R.layout.fragment_commu, container, false)
        (activity as MainActivity?)!!.setActionBarTitle("커뮤니티")

        return mView
    }


}
