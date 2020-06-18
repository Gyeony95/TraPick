package com.example.trapick.Model


data class BookmarkModel(
    var doucuments:ArrayList<BookmarkModel.BookmarkModelNode>
){
    data class BookmarkModelNode(
        var bookmarkTitle:String,
        var bookmarkCountry:String,
        var bookmarkImage:String,
        var bookmarkPrice:String
    )
}

