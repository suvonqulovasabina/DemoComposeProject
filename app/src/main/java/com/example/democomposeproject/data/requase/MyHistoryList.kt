package com.example.democomposeproject.data.requase

import com.google.gson.annotations.SerializedName

data class MyHistoryList (
    @SerializedName("type")  val type:String,
    @SerializedName("from") val from:String,
    @SerializedName("to") val to:String,
    @SerializedName("amount") val amount:Double,
    @SerializedName("time") val time:Long
 )
