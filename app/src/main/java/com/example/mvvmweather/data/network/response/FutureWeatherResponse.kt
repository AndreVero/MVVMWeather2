package com.example.mvvmweather.data.network.response


import android.location.Location
import com.google.gson.annotations.SerializedName

data class FutureWeatherResponse(
    val location: Location,
    @SerializedName("forecast")
    val futureWeatherEntries: ForecastDaysContainer
)