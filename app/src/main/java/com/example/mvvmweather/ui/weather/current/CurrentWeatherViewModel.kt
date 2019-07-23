package com.example.mvvmweather.ui.weather.current

import androidx.lifecycle.ViewModel;
import com.example.mvvmweather.data.provider.UnitProvider
import com.example.mvvmweather.data.repository.ForecastRepository
import com.example.mvvmweather.internal.UnitSystem
import com.example.mvvmweather.internal.lazyDeferred

class CurrentWeatherViewModel (
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {

    private val unitSystem = unitProvider.getUnitSystem()

    val isMetric: Boolean
    get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}
