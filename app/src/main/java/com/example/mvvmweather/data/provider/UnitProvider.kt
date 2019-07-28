package com.example.mvvmweather.data.provider

import com.example.mvvmweather.internal.UnitSystem

interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}