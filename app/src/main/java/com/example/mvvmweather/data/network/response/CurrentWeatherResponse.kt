package com.example.mvvmweather.data.network.response


import com.example.mvvmweather.data.db.entity.CurrentWeatherEntry
import com.example.mvvmweather.data.db.entity.WeatherLocation
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    val location: WeatherLocation,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry
)