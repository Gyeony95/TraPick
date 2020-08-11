package com.example.trapick.View.Region

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.trapick.Base.BaseFragment
import com.example.trapick.MainActivity
import com.example.trapick.R
import com.example.trapick.View.Home.HomeAdapter
import com.example.trapick.View.Home.HomeFragment
import com.example.trapick.View.Home.HomeViewModel
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.fragment_region.view.*


class RegionFragment(mActivity:MainActivity) : BaseFragment() {

    var viewModel = RegionViewModel()
    val mAdapter = RegionAdapter(mActivity)
    var mActivity = mActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mView = inflater.inflate(R.layout.fragment_region, container, false)
        (activity as MainActivity?)!!.setActionBarTitle("이집트")
        initViewModel()
        initStartView(mView)
        initAfterBinding(mView)
        return mView
    }

    override fun initViewModel() {
        viewModel = ViewModelProviders.of(this).get(RegionViewModel::class.java)
        viewModel.responseLiveData.observe(viewLifecycleOwner, Observer {
            it.doucuments.forEach{node->
                mAdapter.addItem(node)
            }
            mAdapter.notifyDataSetChanged()
        })
        viewModel.getDatas()
    }

    override fun initStartView(view: View) {
        mAdapter.RecyclerAdapter(arrayListOf(),requireContext())
        view.rv_region.apply {
            this.adapter = mAdapter
            this.layoutManager = GridLayoutManager(view.context, 2)
            this.setHasFixedSize(true)
        }
    }

    override fun initAfterBinding(view: View) {
    }

}
