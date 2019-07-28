package com.example.mvvmweather.data.db

import android.content.Context
import androidx.room.*
import com.example.mvvmweather.data.db.entity.CurrentWeatherEntry
import com.example.mvvmweather.data.db.entity.WeatherLocation

@Database(
    entities = [CurrentWeatherEntry::class, WeatherLocation::class],
    version = 1
)
@TypeConverters(LocalDateConverter::class)
abstract class ForecastDatabase : RoomDatabase() {
        abstract fun currentWeatherDao() : CurrentWeatherDao
        abstract fun weatherLocationDao() : WeatherLocationDao
        abstract fun futureWeatherDao() : FutureWeatherDao

        companion object {
            @Volatile private var instance: com.example.mvvmweather.data.db.ForecastDatabase? = null
            private val LOCK = Any()

            operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
                instance ?: buildDatabase(context).also { instance = it}
            }

            private fun buildDatabase(context: Context) =
                    Room.databaseBuilder(context.applicationContext,
                        com.example.mvvmweather.data.db.ForecastDatabase::class.java, "forecast.db")
                        .build()
        }
}