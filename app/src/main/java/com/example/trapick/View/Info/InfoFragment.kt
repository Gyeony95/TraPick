package com.example.trapick.View.Info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.trapick.Base.BaseFragment
import com.example.trapick.MainActivity
import com.example.trapick.R
import kotlinx.android.synthetic.main.fragment_country.view.*
import kotlinx.android.synthetic.main.fragment_info.view.*

class InfoFragment(mActivity: MainActivity) : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as MainActivity?)!!.setActionBarTitle("상세 설명")
        val mView = inflater.inflate(R.layout.fragment_info, container, false)
        Glide.with(context).load("https://travelpost.kr/wp-content/uploads/2015/12/venice.jpg").into(mView.iv_info_image)


        initStartView(mView)
        initViewModel()
        initAfterBinding(mView)
        return mView
    }

    override fun initViewModel() {
    }

    override fun initStartView(view: View) {
    }

    override fun initAfterBinding(view: View) {
    }


}