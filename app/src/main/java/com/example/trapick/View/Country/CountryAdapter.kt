package com.example.trapick.View.Country

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.trapick.MainActivity
import com.example.trapick.Model.CountryModel
import com.example.trapick.Model.HomeModel
import com.example.trapick.R
import com.example.trapick.View.Info.InfoFragment
import com.example.trapick.View.Region.RegionFragment
import java.util.ArrayList

class CountryAdapter(mActivity: MainActivity) :
    RecyclerView.Adapter<CountryAdapter.Holder>() {

    var arrayList: ArrayList<CountryModel.CountryModelNode> = ArrayList()
    lateinit var context: Context
    var mActivity = mActivity
    fun addItem(item: CountryModel.CountryModelNode){
        arrayList.add(item)
    }

    fun RecyclerAdapter(mList: ArrayList<CountryModel.CountryModelNode>, context: Context) {
        this.arrayList = mList
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_country, parent, false)
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
        val ivItemImage = itemView.findViewById<ImageView>(R.id.iv_item_image)
        val tvItemScript = itemView.findViewById<TextView>(R.id.tv_item_script)
        val ibItemArrow = itemView.findViewById<ImageButton>(R.id.ib_item_arrow)
        fun bind(mlist: CountryModel.CountryModelNode, context: Context) {

            //상대이름, 피드백제목, 피드백 작성일 등 정의해줌
            tvItemScript.text = mlist.itemScript

            ibItemArrow.setOnClickListener {
                mActivity.showFragment(InfoFragment(mActivity))
            }

        }
    }


}