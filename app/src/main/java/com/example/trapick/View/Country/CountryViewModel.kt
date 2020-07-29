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
        var image1 = "https://static.hubzum.zumst.com/hubzum/2017/11/01/09/a6b35c19aedb47a397931206a293f499_780x0c.jpg"
        var image2 = "https://www.lottehotel.com/content/dam/lotte-hotel/signiel/seoul/overview/local-guide/180708-7-2000-ove-seoul-signiel.jpg.thumb.768.768.jpg"
        var image3 = "https://a.cdn-hotels.com/gdcs/production127/d1781/ac9d03ef-22b4-4330-8e8d-695093138cf4.jpg"
        val aaa : ArrayList<CountryModel.CountryModelNode> = ArrayList()
        aaa.add(CountryModel.CountryModelNode(image1, "카파도키아 열기구", "수십대의 열기구가 하늘을 수놓는 아름다운 경관! 터키 여행에서 누구나 한번쯤 꼭 타보고 싶어하는 열기구 투어!"))
        aaa.add(CountryModel.CountryModelNode(image2, "카파도키아 열기구", "수십대의 열기구가 하늘을 수놓는 아름다운 경관! 터키 여행에서 누구나 한번쯤 꼭 타보고 싶어하는 열기구 투어!"))
        aaa.add(CountryModel.CountryModelNode(image3, "카파도키아 열기구", "수십대의 열기구가 하늘을 수놓는 아름다운 경관! 터키 여행에서 누구나 한번쯤 꼭 타보고 싶어하는 열기구 투어!"))
        aaa.add(CountryModel.CountryModelNode(image1, "카파도키아 열기구", "수십대의 열기구가 하늘을 수놓는 아름다운 경관! 터키 여행에서 누구나 한번쯤 꼭 타보고 싶어하는 열기구 투어!"))
        aaa.add(CountryModel.CountryModelNode(image2, "카파도키아 열기구", "수십대의 열기구가 하늘을 수놓는 아름다운 경관! 터키 여행에서 누구나 한번쯤 꼭 타보고 싶어하는 열기구 투어!"))
        aaa.add(CountryModel.CountryModelNode(image3, "카파도키아 열기구", "수십대의 열기구가 하늘을 수놓는 아름다운 경관! 터키 여행에서 누구나 한번쯤 꼭 타보고 싶어하는 열기구 투어!"))
        aaa.add(CountryModel.CountryModelNode(image1, "카파도키아 열기구", "수십대의 열기구가 하늘을 수놓는 아름다운 경관! 터키 여행에서 누구나 한번쯤 꼭 타보고 싶어하는 열기구 투어!"))
        val dd = CountryModel(aaa)
        _responseLiveData.postValue(dd)
    }

}
