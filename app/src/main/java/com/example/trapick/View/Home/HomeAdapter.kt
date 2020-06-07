package com.example.trapick.View.Home

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.trapick.Model.HomeModel
import com.example.trapick.View.Home.Region.RegionActivity
import com.example.trapick.R
import java.util.ArrayList

class HomeAdapter() :
    RecyclerView.Adapter<HomeAdapter.Holder>() {

    var arrayList: ArrayList<HomeModel.HomeModelNode> = ArrayList()
    lateinit var context: Context

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
        val textView = itemView.findViewById<TextView>(R.id.textView2)
        fun bind(mlist: HomeModel.HomeModelNode, context: Context) {

            //상대이름, 피드백제목, 피드백 작성일 등 정의해줌
            textView.text = mlist.countryName

            itemView.setOnClickListener {
                val intent = Intent(context, RegionActivity::class.java)
                context.startActivity(intent)
            }

        }
    }

    fun updateList(datalist: ArrayList<HomeModel.HomeModelNode>){
        this.arrayList = datalist
        notifyDataSetChanged()
    }

}