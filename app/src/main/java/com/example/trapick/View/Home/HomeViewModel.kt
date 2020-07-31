package com.example.trapick.View.Home

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.avon.remindfeedback.Network.RetrofitFactory
import com.example.trapick.Base.BaseViewModel
import com.example.trapick.Model.HomeModel
import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber
import java.util.*
import kotlin.collections.ArrayList


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