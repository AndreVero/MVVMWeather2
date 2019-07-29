package com.example.mvvmweather.ui.weather.current

import androidx.lifecycle.ViewModel;
import com.example.mvvmweather.data.provider.UnitProvider
import com.example.mvvmweather.data.repository.ForecastRepository
import com.example.mvvmweather.internal.UnitSystem
import com.example.mvvmweather.internal.lazyDeferred
import com.example.mvvmweather.ui.base.WeatherViewModel

class CurrentWeatherViewModel (
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(super.isMetricUnit)
    }


}
