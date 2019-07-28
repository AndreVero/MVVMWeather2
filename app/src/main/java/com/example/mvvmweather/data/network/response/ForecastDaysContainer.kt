package com.example.mvvmweather.data.network.response


import com.example.mvvmweather.data.db.entity.FutureWeatherEntry

data class ForecastDaysContainer(
    val entries: List<FutureWeatherEntry>
)