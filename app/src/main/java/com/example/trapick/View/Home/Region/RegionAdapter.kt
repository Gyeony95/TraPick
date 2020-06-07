package com.example.trapick.View.Home.Region

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.trapick.R
import java.util.ArrayList

class RegionAdapter(val context: Context, val arrayList: ArrayList<RegionModel>) :
    RecyclerView.Adapter<RegionAdapter.Holder>() {


    fun addItem(item: RegionModel) {//아이템 추가
        if (arrayList != null) {//널체크 해줘야함
            arrayList.add(item)
        }
    }

    fun removeAt(position: Int) {
        arrayList.removeAt(position)
        notifyItemRemoved(position)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_region, parent, false)
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
        val region_count_tv = itemView.findViewById<TextView>(R.id.region_count_tv)
        val region_name_tv = itemView.findViewById<TextView>(R.id.region_name_tv)



        fun bind(mlist: RegionModel, context: Context) {

            //상대이름, 피드백제목, 피드백 작성일 등 정의해줌
            region_count_tv.text = mlist.count
            region_name_tv.text = mlist.name

            itemView.setOnClickListener {

            }

        }
    }

}