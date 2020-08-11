package com.example.trapick.Model

data class RegionModel(
    var doucuments:ArrayList<RegionModelNode>
){
    data class RegionModelNode(
        var countryName:String,
        var countryImage:String,
        var count:Int
    )
}
