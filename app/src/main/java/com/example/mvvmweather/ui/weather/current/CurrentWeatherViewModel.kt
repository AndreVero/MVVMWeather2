package com.example.mvvmweather.ui.weather.current

import androidx.lifecycle.ViewModel;
import com.example.mvvmweather.data.repository.ForecastRepository
import com.example.mvvmweather.internal.UnitSystem
import com.example.mvvmweather.internal.lazyDeferred

class CurrentWeatherViewModel (
    private val forecastRepository: ForecastRepository
) : ViewModel() {

    private val unitSystem = UnitSystem.METRIC

    val isMetric: Boolean
    get() = true

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }
}
