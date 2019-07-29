package com.example.mvvmweather.ui.weather.future.detail

import androidx.lifecycle.ViewModel;
import com.example.mvvmweather.data.provider.UnitProvider
import com.example.mvvmweather.data.repository.ForecastRepository

class FutureDetailWeatherViewModel (
    private val forecastRepository: ForecastRepository,
    private val unitProvider: UnitProvider
) : ViewModel() {
         // TODO: Implement the ViewModel
}
