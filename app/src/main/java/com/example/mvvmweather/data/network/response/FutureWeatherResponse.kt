package com.example.mvvmweather.data.network.response


import android.location.Location
import com.example.mvvmweather.data.db.entity.WeatherLocation
import com.google.gson.annotations.SerializedName

data class FutureWeatherResponse(
    val location: WeatherLocation,
    @SerializedName("forecast")
    val futureWeatherEntries: ForecastDaysContainer
)