package com.example.trapick.View.Region

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.trapick.Base.BaseViewModel
import com.example.trapick.Model.HomeModel
import com.example.trapick.Model.RegionModel

class RegionViewModel : BaseViewModel() {
    private val _responseLiveData = MutableLiveData<RegionModel>()
    val responseLiveData: LiveData<RegionModel>
        get() = _responseLiveData


    fun getDatas(){

        var ex_url = "http://i.imgur.com/DvpvklR.png"
        var ex_url2 = "https://travelpost.kr/wp-content/uploads/2015/12/venice.jpg"
        var ex_url3 ="https://a.cdn-hotels.com/gdcs/production127/d1781/ac9d03ef-22b4-4330-8e8d-695093138cf4.jpg"
        val aaa : ArrayList<RegionModel.RegionModelNode> = ArrayList()
        aaa.add(RegionModel.RegionModelNode("이나라",ex_url3,5))
        aaa.add(RegionModel.RegionModelNode("저나라",ex_url2,8))
        aaa.add(RegionModel.RegionModelNode("그나라",ex_url2,7))
        aaa.add(RegionModel.RegionModelNode("이나라",ex_url3,15))
        aaa.add(RegionModel.RegionModelNode("저나라",ex_url2,22))
        aaa.add(RegionModel.RegionModelNode("그나라",ex_url2,2))
        aaa.add(RegionModel.RegionModelNode("이나라",ex_url3,51))
        aaa.add(RegionModel.RegionModelNode("저나라",ex_url3,77))

        val dd = RegionModel(aaa)
        _responseLiveData.postValue(dd)
    }
}