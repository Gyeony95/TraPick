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
        val aaa : ArrayList<BookmarkModel.BookmarkModelNode> = ArrayList()
        aaa.add(BookmarkModel.BookmarkModelNode("카파도키아 열기구","열기구가 하늘을 수놓는 아름다운 경관!","터키","","약 29만원"))
        aaa.add(BookmarkModel.BookmarkModelNode("카파도키아 열기구","열기구가 하늘을 수놓는 아름다운 경관!","터키","","약 29만원"))
        aaa.add(BookmarkModel.BookmarkModelNode("카파도키아 열기구","열기구가 하늘을 수놓는 아름다운 경관!","터키","","약 29만원"))
        aaa.add(BookmarkModel.BookmarkModelNode("카파도키아 열기구","열기구가 하늘을 수놓는 아름다운 경관!","터키","","약 29만원"))
        aaa.add(BookmarkModel.BookmarkModelNode("카파도키아 열기구","열기구가 하늘을 수놓는 아름다운 경관!","터키","","약 29만원"))
        aaa.add(BookmarkModel.BookmarkModelNode("카파도키아 열기구","열기구가 하늘을 수놓는 아름다운 경관!","터키","","약 29만원"))
        aaa.add(BookmarkModel.BookmarkModelNode("카파도키아 열기구","열기구가 하늘을 수놓는 아름다운 경관!","터키","","약 29만원"))


        val dd = BookmarkModel(aaa)
        _responseLiveData.postValue(dd)
    }

}