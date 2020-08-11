package com.example.trapick.View.Bookmark

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.trapick.Base.BaseFragment
import com.example.trapick.MainActivity
import com.example.trapick.Model.BookmarkModel
import com.example.trapick.R
import com.example.trapick.Util.makeToast
import com.example.trapick.View.Home.HomeAdapter
import com.example.trapick.View.Home.HomeViewModel
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_bookmark.*
import kotlinx.android.synthetic.main.fragment_bookmark.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*


class BookmarkFragment(mActivity:MainActivity, mContext:Context) : BaseFragment() {

    var viewModel = BookmarkViewModel()
    val mAdapter = BookmarkAdapter(mActivity)
    var mActivity = mActivity
    var mContext = mContext

    override fun initViewModel() {
        viewModel =
            ViewModelProviders.of(this).get(BookmarkViewModel::class.java)
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
        view.rv_bookmark.apply {
            this.adapter = mAdapter
            this.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)
            this.addOnItemTouchListener(OnItemTouch(mContext))
            this.setHasFixedSize(true)
        }
    }

    override fun initAfterBinding(view: View) {

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mView = inflater.inflate(R.layout.fragment_bookmark, container, false)
        (activity as MainActivity?)!!.setActionBarTitle("즐겨찾기")

        initViewModel()
        initStartView(mView)
        initAfterBinding(mView)

        mView.tl_bookmark.addTab(mView.tl_bookmark.newTab().setText("국가"))
        mView.tl_bookmark.addTab(mView.tl_bookmark.newTab().setText("선택관광"))
        mView.tl_bookmark.addTab(mView.tl_bookmark.newTab().setText("리뷰"))
        mView.tl_bookmark.addTab(mView.tl_bookmark.newTab().setText("커뮤니티"))
        //탭버튼을 클릭했을 때 프레그먼트 동작
        mView.tl_bookmark.setOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                //선택된 탭 번호 반환
                val position = tab.position
                if (position == 0) {
                    mActivity.makeToast("국가탭")
                } else if (position == 1) {
                    mActivity.makeToast("선택관광탭")
                } else if (position == 2) {
                    mActivity.makeToast("리뷰탭")
                } else if (position == 3){
                    mActivity.makeToast("커뮤니티탭")
                }
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {
            }
            override fun onTabReselected(tab: TabLayout.Tab) {
            }
        })


        return mView
    }


}
