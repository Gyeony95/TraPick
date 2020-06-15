package com.example.trapick.View.Country

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.trapick.Base.BaseViewModel
import com.example.trapick.Model.CountryModel
import com.example.trapick.Model.HomeModel

class CountryViewModel : BaseViewModel() {

    private val _responseLiveData = MutableLiveData<CountryModel>()
    val responseLiveData: LiveData<CountryModel>
        get() = _responseLiveData


    fun getDatas(){
        val aaa : ArrayList<CountryModel.CountryModelNode> = ArrayList()
        aaa.add(CountryModel.CountryModelNode("", "카파도키아 열기구", "수십대의 열기구가 하늘을 수놓는 아름다운 경관! 터키 여행에서 누구나 한번쯤 꼭 타보고 싶어하는 열기구 투어!"))
        aaa.add(CountryModel.CountryModelNode("", "카파도키아 열기구", "수십대의 열기구가 하늘을 수놓는 아름다운 경관! 터키 여행에서 누구나 한번쯤 꼭 타보고 싶어하는 열기구 투어!"))
        aaa.add(CountryModel.CountryModelNode("", "카파도키아 열기구", "수십대의 열기구가 하늘을 수놓는 아름다운 경관! 터키 여행에서 누구나 한번쯤 꼭 타보고 싶어하는 열기구 투어!"))
        aaa.add(CountryModel.CountryModelNode("", "카파도키아 열기구", "수십대의 열기구가 하늘을 수놓는 아름다운 경관! 터키 여행에서 누구나 한번쯤 꼭 타보고 싶어하는 열기구 투어!"))
        aaa.add(CountryModel.CountryModelNode("", "카파도키아 열기구", "수십대의 열기구가 하늘을 수놓는 아름다운 경관! 터키 여행에서 누구나 한번쯤 꼭 타보고 싶어하는 열기구 투어!"))
        aaa.add(CountryModel.CountryModelNode("", "카파도키아 열기구", "수십대의 열기구가 하늘을 수놓는 아름다운 경관! 터키 여행에서 누구나 한번쯤 꼭 타보고 싶어하는 열기구 투어!"))
        aaa.add(CountryModel.CountryModelNode("", "카파도키아 열기구", "수십대의 열기구가 하늘을 수놓는 아름다운 경관! 터키 여행에서 누구나 한번쯤 꼭 타보고 싶어하는 열기구 투어!"))
        val dd = CountryModel(aaa)
        _responseLiveData.postValue(dd)
    }

}
