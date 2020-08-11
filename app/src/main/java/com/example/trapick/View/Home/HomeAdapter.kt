package com.example.trapick.View.Home

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.trapick.MainActivity
import com.example.trapick.Model.HomeModel
import com.example.trapick.R
import com.example.trapick.View.Region.RegionFragment
import java.util.ArrayList

class HomeAdapter(mActivity: MainActivity) :
    RecyclerView.Adapter<HomeAdapter.Holder>() {

    var arrayList: ArrayList<HomeModel.HomeModelNode> = ArrayList()
    lateinit var context: Context
    var mActivity = mActivity
    fun addItem(item: HomeModel.HomeModelNode){
        arrayList.add(item)
    }

    fun RecyclerAdapter(mList: ArrayList<HomeModel.HomeModelNode>, context: Context) {
        this.arrayList = mList
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_home, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(arrayList[position], context)

    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        //모델의 변수들 정의하는부분
        val tvCountryName = itemView.findViewById<TextView>(R.id.tv_country_name)
        fun bind(mlist: HomeModel.HomeModelNode, context: Context) {

            //상대이름, 피드백제목, 피드백 작성일 등 정의해줌
            tvCountryName.text = mlist.countryName

            itemView.setOnClickListener {
                mActivity.showFragment(RegionFragment(mActivity))
            }

        }
    }


}