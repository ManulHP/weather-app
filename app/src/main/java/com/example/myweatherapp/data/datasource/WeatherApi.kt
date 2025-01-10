package com.example.myweatherapp.data.datasource

import com.example.myweatherapp.data.model.WeatherModel
import retrofit2.http.GET
import retrofit2.http.Query

// Defines the retrofit interface.
// Containers the query parameters to fetch the data from the API (q-> location anf apiid -> token)

interface WeatherApi {
    @GET("weather")
    suspend fun getWeatherData(
        @Query("q") q: String,
        @Query("appid") apiKey: String
    ): WeatherModel
}