package com.example.trapick.View.Country

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.ActionBar
import com.example.trapick.Base.BaseFragment
import com.example.trapick.MainActivity
import com.example.trapick.R
import timber.log.Timber

class CountryFragment(mActivity: MainActivity) : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as MainActivity?)!!.setActionBarTitle("TRAPICK")
        val mView = inflater.inflate(R.layout.fragment_country, container, false)


        setHasOptionsMenu(true)//메뉴 가질수 있게 허용

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