package com.example.mvvmweather.data.provider

import com.example.mvvmweather.data.db.entity.WeatherLocation

interface LocationProvider {

    suspend fun hasLocationChanged(lastWeatherLocation: WeatherLocation) : Boolean
    suspend fun getPreferredLocationString(): String
}