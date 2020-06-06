package com.example.trapick.Repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.trapick.Model.HomeModel

interface HomeRepository {
    fun generateHomeList(): MutableList<HomeModel>
}

class HomeRepositoryImpl: HomeRepository {
    override fun generateHomeList(): MutableList<HomeModel> {
        val datas :MutableList<HomeModel> = ArrayList()
        datas.add(HomeModel("일본"))
        datas.add(HomeModel("일본"))
        datas.add(HomeModel("일본"))
        datas.add(HomeModel("일본"))

        return datas
    }

    //이부분에 서버에서 가져온 정보들을 담는것임
    fun getDataFromApi():MutableLiveData<MutableList<HomeModel>>{
        val mutableLiveData: MutableLiveData<MutableList<HomeModel>> = MutableLiveData()

        //이아래로 임시로 넣어놓은 데이터
        //var entity = MutableList<HomeModel>())
        val entities = java.util.ArrayList<HomeModel>()
        entities.add(HomeModel("aaaaa"))
        entities.add(HomeModel("ㅠㅠㅠㅠ"))
        entities.add(HomeModel("ㄹㄹㄹㄹ"))

        mutableLiveData.value = entities
        return mutableLiveData
    }


}