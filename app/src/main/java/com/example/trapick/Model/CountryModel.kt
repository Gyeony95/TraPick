package com.example.trapick.Model
/*
* countryName : 국가명
* */

data class CountryModel(
    var doucuments:ArrayList<CountryModelNode>
){
    data class CountryModelNode(
        var itemImage:String,
        var itemTitle:String,
        var itemScript:String
    )
}
