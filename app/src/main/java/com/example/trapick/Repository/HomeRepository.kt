package com.example.trapick.Repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.trapick.Model.HomeModel
import com.example.trapick.Util.SingleLiveEvent

/*
interface HomeRepository {
    fun generateHomeList(): MutableList<HomeModel>
}

class HomeRepositoryImpl: HomeRepository {

    //var mList = getDataFromApi()

    private val _sendEvent = MutableLiveData<List<HomeModel>>()
    val sendEvent: LiveData<List<HomeModel>>
        get() = _sendEvent


    override fun generateHomeList(): MutableList<HomeModel> {
        val datas :MutableList<HomeModel> = ArrayList()
        datas.add(HomeModel("일본"))
        datas.add(HomeModel("일본"))
        datas.add(HomeModel("일본"))
        datas.add(HomeModel("일본"))

        return datas
    }

    //이부분에 서버에서 가져온 정보들을 담는것임
    fun getDataFromApi(): LiveData<List<HomeModel>> {


        val items: ArrayList<HomeModel> = ArrayList()
        items.add(HomeModel("aaaaa"))
        items.add(HomeModel("aaaaa"))
        items.add(HomeModel("aaaaa"))


        return sendEvent
    }


}
*/