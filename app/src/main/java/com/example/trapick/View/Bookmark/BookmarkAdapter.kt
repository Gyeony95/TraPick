package com.example.trapick.View.Bookmark

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trapick.MainActivity
import com.example.trapick.Model.BookmarkModel
import com.example.trapick.R
import com.example.trapick.Util.MyRelativeLayout
import timber.log.Timber
import java.util.*


class BookmarkAdapter(mActivity: MainActivity) :
    RecyclerView.Adapter<BookmarkAdapter.Holder>() {

    var arrayList: ArrayList<BookmarkModel.BookmarkModelNode> = ArrayList()
    lateinit var context: Context
    var mActivity = mActivity
    fun addItem(item: BookmarkModel.BookmarkModelNode){
        arrayList.add(item)
    }

    fun RecyclerAdapter(mList: ArrayList<BookmarkModel.BookmarkModelNode>, context: Context) {
        this.arrayList = mList
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_bookmark, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(arrayList[position], context)

    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var root: MyRelativeLayout? = itemView.findViewById(R.id.item_root)


        //모델의 변수들 정의하는부분
        //val tvCountryName = itemView.findViewById<TextView>(R.id.tv_country_name)
        fun bind(mlist: BookmarkModel.BookmarkModelNode, context: Context) {

            //tvCountryName.text = mlist.countryName
            Timber.e(mlist.bookmarkTitle)
            itemView.setOnClickListener {
                //mActivity.showFragment(RegionFragment(mActivity))
            }

        }
    }


}