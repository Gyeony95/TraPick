package com.example.trapick.View.Country

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.ActionBar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import com.bumptech.glide.Glide
import com.example.trapick.Base.BaseFragment
import com.example.trapick.MainActivity
import com.example.trapick.R
import com.example.trapick.View.Home.HomeViewModel
import kotlinx.android.synthetic.main.fragment_country.*
import kotlinx.android.synthetic.main.fragment_country.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import timber.log.Timber

class CountryFragment(mActivity: MainActivity) : BaseFragment() {

    var mActivity:MainActivity = mActivity
    var mAdapter = CountryAdapter(mActivity)
    var viewModel = CountryViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as MainActivity?)!!.setActionBarTitle("관광 선택")
        val mView = inflater.inflate(R.layout.fragment_country, container, false)
        setHasOptionsMenu(true)//메뉴 가질수 있게 허용

        Glide.with(context).load("https://travelpost.kr/wp-content/uploads/2015/12/venice.jpg").into(mView.iv_country_image)
        initStartView(mView)
        initViewModel()
        initAfterBinding(mView)
        return mView
    }
    override fun initViewModel() {
        viewModel =
            ViewModelProviders.of(this).get(CountryViewModel::class.java)
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
        view.rv_country.apply {
            this.adapter = mAdapter
            this.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
            this.setHasFixedSize(true)
        }
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(view.rv_country)


    }

    override fun initAfterBinding(view: View) {
    }

    //메뉴 적용
    override fun onCreateOptionsMenu(menu: Menu, menuinflater:MenuInflater) {
        super.onCreateOptionsMenu(menu, menuinflater)
        menuinflater.inflate(R.menu.menu_country_toolbar,menu)
    }

    //메뉴를 클릭했을시
    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId){
        // Handle presses on the action bar items


        R.id.tab1 -> {
            Timber.e("메뉴클릭")
            true
        }else -> {
            false
        }
    }

    fun menuClickEvent():Boolean{

        return true
    }

}