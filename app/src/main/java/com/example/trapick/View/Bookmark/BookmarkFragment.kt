package com.example.trapick.View.Bookmark

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.trapick.MainActivity
import com.example.trapick.R


class BookmarkFragment : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mView = inflater.inflate(R.layout.fragment_bookmark, container, false)
        (activity as MainActivity?)!!.setActionBarTitle("즐겨찾기")


        return mView
    }


}
