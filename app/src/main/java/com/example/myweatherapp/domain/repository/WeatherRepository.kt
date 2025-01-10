package com.example.myweatherapp.domain.repository

import com.example.myweatherapp.data.model.WeatherModel

interface WeatherRepository {
    suspend fun getWeather(q: String, apiKey: String): WeatherModel
}