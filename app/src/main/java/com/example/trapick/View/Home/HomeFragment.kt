package com.example.trapick.View.Home

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.trapick.Base.BaseFragment
import com.example.trapick.MainActivity
import com.example.trapick.Model.HomeModel
import com.example.trapick.R
import com.example.trapick.ViewModel.HomeViewModel
import kotlinx.android.synthetic.main.fragment_home.view.*
import androidx.lifecycle.Observer
import com.example.trapick.Util.makeToast
import com.example.trapick.Util.setupTimber
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.imageView
import timber.log.Timber


class HomeFragment(mContext: Context) : BaseFragment() {

    //val viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
    var viewModel = HomeViewModel()
    val mAdapter = HomeAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as MainActivity?)!!.setActionBarTitle("00님 어서오세요")
        val mView = inflater.inflate(R.layout.fragment_home, container, false)
        initStartView(mView)
        initViewModel()
        initAfterBinding()



        mView.imageView.setOnClickListener(){
            this.makeToast(mAdapter.itemCount.toString())
        }

        return mView
    }

    override fun initStartView(view: View) {
        mAdapter.RecyclerAdapter(arrayListOf(),requireContext())
        view.mainRecyclerview.apply {
            this.adapter = mAdapter
            this.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
            this.setHasFixedSize(true)
        }
    }


    override fun initViewModel(){
        viewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        viewModel.getDatas().observe(viewLifecycleOwner, Observer { pokemonList ->
            pokemonList?.let{
                //mAdapter.arrayList = pokemonList
                //mAdapter.notifyDataSetChanged()
                Log.e("asd", it[0].countryName)
                mAdapter.updateList(it)
            }
        })
    }
    override fun initAfterBinding() {

    }


}
