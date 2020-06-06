package com.example.trapick.ViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.trapick.Base.BaseViewModel
import com.example.trapick.Model.HomeModel
import com.example.trapick.Repository.HomeRepositoryImpl
import com.example.trapick.Util.SingleLiveEvent
import timber.log.Timber

class HomeViewModel : BaseViewModel() {

    private var _sendEvent = SingleLiveEvent<MutableList<HomeModel>>()
    private var datas: MutableLiveData<MutableList<HomeModel>>
        get() = _sendEvent
    var repository: HomeRepositoryImpl = HomeRepositoryImpl()

    init {
        datas = repository.getDataFromApi()
    }

    fun getDatas(): LiveData<MutableList<HomeModel>> {
        return datas
    }

    private fun loadDatas() {
        // Do an asynchronous operation to fetch users.
    }
}