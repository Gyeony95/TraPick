package com.example.trapick.View.Region

import android.app.PendingIntent.getActivity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.trapick.MainActivity
import com.example.trapick.Model.RegionModel
import com.example.trapick.R
import com.example.trapick.View.Country.CountryFragment
import com.squareup.picasso.Picasso
import org.xmlpull.v1.XmlPullParserFactory.newInstance
import timber.log.Timber
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
        val tvCountryCount = itemView.findViewById<TextView>(R.id.tv_country_count)
        val ivCountryImage = itemView.findViewById<ImageView>(R.id.iv_country_image)
        fun bind(mlist: RegionModel.RegionModelNode, context: Context) {
            Timber.e(mlist.countryImage)
            tvCountryName.text = mlist.countryName
            tvCountryCount.text = tvCountryCount.text.toString()+mlist.count
            if(!mlist.countryImage.equals("")){//비어있지 않다면
                Glide.with(context).load(mlist.countryImage).into(ivCountryImage);
            }
            itemView.setOnClickListener {
                mActivity.showFragment(CountryFragment(mActivity))
            }
        }
    }
}