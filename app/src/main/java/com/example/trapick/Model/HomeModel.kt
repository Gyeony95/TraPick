package com.example.trapick.Model
/*
* countryName : 국가명
* */

data class HomeModel(
    var doucuments:ArrayList<HomeModelNode>
){
    data class HomeModelNode(
        var countryName:String
    )
}
