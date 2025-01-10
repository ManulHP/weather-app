package com.example.myweatherapp.domain.usecase.repository

import com.example.myweatherapp.data.model.WeatherModel
import com.example.myweatherapp.domain.repository.WeatherRepository

// Retrieves weather data from the WeatherRepository, processes it, and returns a WeatherModel

class GetWeatherUseCase(private val repository: WeatherRepository) {
    suspend operator fun invoke(q: String, units: String, apiKey: String): WeatherModel {
        return repository.getWeather(q, units, apiKey)
    }
}