package com.example.trapick.View.Info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.trapick.Base.BaseFragment
import com.example.trapick.MainActivity
import com.example.trapick.R

class InfoFragment(mActivity: MainActivity) : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as MainActivity?)!!.setActionBarTitle("TRAPICK")
        val mView = inflater.inflate(R.layout.fragment_info, container, false)
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