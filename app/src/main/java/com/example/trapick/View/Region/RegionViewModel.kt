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

        val aaa : ArrayList<RegionModel.RegionModelNode> = ArrayList()
        aaa.add(RegionModel.RegionModelNode("이집트","",5))
        aaa.add(RegionModel.RegionModelNode("이집트","",5))
        aaa.add(RegionModel.RegionModelNode("이집트","",5))
        aaa.add(RegionModel.RegionModelNode("이집트","",5))
        aaa.add(RegionModel.RegionModelNode("이집트","",5))
        aaa.add(RegionModel.RegionModelNode("이집트","",5))
        aaa.add(RegionModel.RegionModelNode("이집트","",5))
        aaa.add(RegionModel.RegionModelNode("이집트","",5))

        val dd = RegionModel(aaa)
        _responseLiveData.postValue(dd)
    }
}