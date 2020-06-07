package com.example.trapick.View.Home

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.trapick.Base.BaseFragment
import com.example.trapick.MainActivity
import com.example.trapick.R
import kotlinx.android.synthetic.main.fragment_home.view.*
import androidx.lifecycle.Observer


class HomeFragment(mActivity: MainActivity) : BaseFragment() {

    //val viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
    var viewModel = HomeViewModel()
    val mAdapter = HomeAdapter(mActivity)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as MainActivity?)!!.setActionBarTitle("TRAPICK")
        val mView = inflater.inflate(R.layout.fragment_home, container, false)
        initStartView(mView)
        initViewModel()
        initAfterBinding(mView)
        return mView
    }

    override fun initStartView(view: View) {
        mAdapter.RecyclerAdapter(arrayListOf(),requireContext())
        view.rv_home.apply {
            this.adapter = mAdapter
            this.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
            this.setHasFixedSize(true)
        }
    }


    override fun initViewModel(){
        viewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        viewModel.responseLiveData.observe(viewLifecycleOwner, Observer {
            it.doucuments.forEach{node->
                mAdapter.addItem(node)
            }
            mAdapter.notifyDataSetChanged()
        })
        viewModel.getDatas()

    }
    override fun initAfterBinding(view: View) {
    }


}
