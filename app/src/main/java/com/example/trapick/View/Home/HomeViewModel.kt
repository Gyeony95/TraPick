package com.example.trapick.View.Home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.trapick.Base.BaseViewModel
import com.example.trapick.Model.HomeModel


class HomeViewModel : BaseViewModel() {

    private val _responseLiveData = MutableLiveData<HomeModel>()
    val responseLiveData:LiveData<HomeModel>
        get() = _responseLiveData


    fun getDatas(){
        val aaa : ArrayList<HomeModel.HomeModelNode> = ArrayList()
        aaa.add(HomeModel.HomeModelNode("중국"))
        aaa.add(HomeModel.HomeModelNode("일본"))
        aaa.add(HomeModel.HomeModelNode("러시아"))
        aaa.add(HomeModel.HomeModelNode("인도"))
        aaa.add(HomeModel.HomeModelNode("브라질"))
        aaa.add(HomeModel.HomeModelNode("중국"))
        aaa.add(HomeModel.HomeModelNode("일본"))
        aaa.add(HomeModel.HomeModelNode("러시아"))
        aaa.add(HomeModel.HomeModelNode("인도"))
        aaa.add(HomeModel.HomeModelNode("브라질"))
        val dd = HomeModel(aaa)
        _responseLiveData.postValue(dd)
    }

}