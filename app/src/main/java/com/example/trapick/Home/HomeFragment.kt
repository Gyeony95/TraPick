package com.example.trapick.Home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.trapick.R
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment(mContext: Context) : Fragment() {
    var arrayList = arrayListOf<HomeModel>(
        HomeModel("일본"),
        HomeModel("중국"),
        HomeModel("영국"),
        HomeModel("스페인"),
        HomeModel("프랑스"),
        HomeModel("이탈리아"),
        HomeModel("몽골"),
        HomeModel("러시아"),
        HomeModel("스위스")

    )
    val mAdapter = HomeAdapter(mContext, arrayList)

    var homeContext = mContext


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        view.mainRecyclerview.apply {
            this.adapter = mAdapter
            this.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
            this.setHasFixedSize(true)
        }
        return view
    }


}
