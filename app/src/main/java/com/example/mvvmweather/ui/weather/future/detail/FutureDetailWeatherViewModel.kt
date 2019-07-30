package com.example.mvvmweather.ui.weather.future.detail

import androidx.lifecycle.ViewModel;
import com.example.mvvmweather.data.provider.UnitProvider
import com.example.mvvmweather.data.repository.ForecastRepository
import com.example.mvvmweather.internal.lazyDeferred
import com.example.mvvmweather.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureDetailWeatherViewModel (
    private val detailDate: LocalDate,
    private val forecastRepository: ForecastRepository,
    private val unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getFutureWeatherByDate(detailDate, super.isMetricUnit)
    }
}

