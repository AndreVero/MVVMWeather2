package com.example.mvvmweather.ui.data.network.response


import com.example.mvvmweather.ui.data.db.entity.CurrentWeatherEntry
import com.example.mvvmweather.ui.data.db.entity.Location
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    val location: Location,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry
)