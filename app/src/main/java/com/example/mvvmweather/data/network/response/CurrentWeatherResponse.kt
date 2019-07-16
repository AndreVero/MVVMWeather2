package com.example.mvvmweather.data.network.response


import com.example.mvvmweather.data.db.entity.CurrentWeatherEntry
import com.example.mvvmweather.data.db.entity.Location
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    val location: Location,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry
)