package com.example.trapick.View.Region

import android.app.PendingIntent.getActivity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.trapick.MainActivity
import com.example.trapick.Model.RegionModel
import com.example.trapick.R
import com.example.trapick.View.Country.CountryFragment
import org.xmlpull.v1.XmlPullParserFactory.newInstance
import java.lang.reflect.Array.newInstance
import java.util.*
import javax.xml.xpath.XPathFactory.newInstance


class RegionAdapter(mActivity: MainActivity):
    RecyclerView.Adapter<RegionAdapter.Holder>() {


    var arrayList: ArrayList<RegionModel.RegionModelNode> = ArrayList()
    lateinit var context: Context
    var mActivity = mActivity

    fun addItem(item: RegionModel.RegionModelNode){
        arrayList.add(item)
    }

    fun RecyclerAdapter(mList: ArrayList<RegionModel.RegionModelNode>, context: Context) {
        this.arrayList = mList
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        var view = LayoutInflater.from(context).inflate(R.layout.item_region, parent, false)

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
        fun bind(mlist: RegionModel.RegionModelNode, context: Context) {

            //상대이름, 피드백제목, 피드백 작성일 등 정의해줌
            tvCountryName.text = mlist.countryName

            itemView.setOnClickListener {
                mActivity.showFragment(CountryFragment(mActivity))

            }

        }
    }
}