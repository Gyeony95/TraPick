package com.example.trapick.View.Country

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.avon.remindfeedback.Network.RetrofitFactory
import com.example.trapick.Base.BaseViewModel
import com.example.trapick.Model.CountryModel
import com.example.trapick.Model.HomeModel
import com.google.gson.Gson
import okhttp3.OkHttpClient
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber

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
/*
    fun getExchange(): JSONObject{
        val client: OkHttpClient = RetrofitFactory.getClient()
        val apiService = RetrofitFactory.serviceAPI(client)
        lateinit var returnData : JSONObject

        val register_request: Call<Object> = apiService.getExchange()
        register_request.enqueue(object : Callback<Object> {

            override fun onResponse(call: Call<Object>, response: Response<Object>) {
                if (response.isSuccessful) {
                    var jArray: JSONArray = JSONArray(Gson().toJson(response.body()))
                    Timber.e(jArray.getJSONObject(0).getString("timestamp"))

                } else {

                }
            }

            override fun onFailure(call: Call<Object>, t: Throwable) {

            }

        })
    }

 */
}
