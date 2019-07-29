package com.example.mvvmweather.ui.base

import androidx.lifecycle.ViewModel
import com.example.mvvmweather.data.provider.UnitProvider
import com.example.mvvmweather.data.repository.ForecastRepository
import com.example.mvvmweather.internal.UnitSystem
import com.example.mvvmweather.internal.lazyDeferred

abstract class WeatherViewModel (
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {

    private val unitSystem = unitProvider.getUnitSystem()

    val isMetricUnit: Boolean
    get() = unitSystem == UnitSystem.METRIC

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}