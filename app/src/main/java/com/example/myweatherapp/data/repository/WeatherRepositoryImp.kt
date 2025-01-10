package com.example.myweatherapp.data.repository

import com.example.myweatherapp.data.model.WeatherModel
import com.example.myweatherapp.data.datasource.WeatherApi
import com.example.myweatherapp.domain.repository.WeatherRepository
import javax.inject.Inject

// Implementation of the WeatherRepository interface
// Handles the API call using the WeatherApi interface

class WeatherRepositoryImp @Inject constructor(private val weatherApi: WeatherApi): WeatherRepository {
    override suspend fun getWeather(q: String, units: String, apiKey: String): WeatherModel {
        return weatherApi.getWeatherData(q, units, apiKey)
    }
}