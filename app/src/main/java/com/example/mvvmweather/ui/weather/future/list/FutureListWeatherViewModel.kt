package com.example.mvvmweather.ui.weather.future.list

import androidx.lifecycle.ViewModel;
import com.example.mvvmweather.data.provider.UnitProvider
import com.example.mvvmweather.data.repository.ForecastRepository
import com.example.mvvmweather.internal.lazyDeferred
import com.example.mvvmweather.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureListWeatherViewModel (
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
): WeatherViewModel(forecastRepository, unitProvider ) {

    val weatherEntries by lazyDeferred {
        forecastRepository.getFutureWeatherList(LocalDate.now(), super.isMetricUnit)
    }
}

