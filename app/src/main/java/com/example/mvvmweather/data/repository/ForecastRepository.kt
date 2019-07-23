package com.example.mvvmweather.data.repository

import androidx.lifecycle.LiveData
import com.example.mvvmweather.data.db.entity.WeatherLocation
import com.example.mvvmweather.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry

interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>

    suspend fun getWeatherLocation(): LiveData<WeatherLocation>

}