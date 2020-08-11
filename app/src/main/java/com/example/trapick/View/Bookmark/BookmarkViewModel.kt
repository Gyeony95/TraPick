package com.example.trapick.View.Bookmark

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.trapick.Base.BaseViewModel
import com.example.trapick.Model.BookmarkModel

class BookmarkViewModel : BaseViewModel() {

    private val _responseLiveData = MutableLiveData<BookmarkModel>()
    val responseLiveData: LiveData<BookmarkModel>
        get() = _responseLiveData


    fun getDatas(){
        var image1 = "https://static.hubzum.zumst.com/hubzum/2017/11/01/09/a6b35c19aedb47a397931206a293f499_780x0c.jpg"
        var image2 = "https://www.lottehotel.com/content/dam/lotte-hotel/signiel/seoul/overview/local-guide/180708-7-2000-ove-seoul-signiel.jpg.thumb.768.768.jpg"
        var image3 = "https://a.cdn-hotels.com/gdcs/production127/d1781/ac9d03ef-22b4-4330-8e8d-695093138cf4.jpg"
        val aaa : ArrayList<BookmarkModel.BookmarkModelNode> = ArrayList()
        aaa.add(BookmarkModel.BookmarkModelNode("카파도키아 열기구","열기구가 하늘을 수놓는 아름다운 경관!","터키",image1,"약 29만원"))
        aaa.add(BookmarkModel.BookmarkModelNode("카파도키아 열기구","열기구가 하늘을 수놓는 아름다운 경관!","터키",image2,"약 29만원"))
        aaa.add(BookmarkModel.BookmarkModelNode("카파도키아 열기구","열기구가 하늘을 수놓는 아름다운 경관!","터키",image3,"약 29만원"))
        aaa.add(BookmarkModel.BookmarkModelNode("카파도키아 열기구","열기구가 하늘을 수놓는 아름다운 경관!","터키",image1,"약 29만원"))
        aaa.add(BookmarkModel.BookmarkModelNode("카파도키아 열기구","열기구가 하늘을 수놓는 아름다운 경관!","터키",image2,"약 29만원"))
        aaa.add(BookmarkModel.BookmarkModelNode("카파도키아 열기구","열기구가 하늘을 수놓는 아름다운 경관!","터키",image3,"약 29만원"))
        aaa.add(BookmarkModel.BookmarkModelNode("카파도키아 열기구","열기구가 하늘을 수놓는 아름다운 경관!","터키",image1,"약 29만원"))


        val dd = BookmarkModel(aaa)
        _responseLiveData.postValue(dd)
    }

}