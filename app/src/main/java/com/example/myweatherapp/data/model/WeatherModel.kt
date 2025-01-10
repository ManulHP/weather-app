package com.example.myweatherapp.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// Represents the data structure of the API

@Serializable
data class WeatherModel(
    val id: Int,
    val name: String,
    val weather: List<Weather>,
    val main: Main,
    val wind: Wind
)

@Serializable
data class Weather(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)

@Serializable
data class  Main(
    val temp: Double,
    @SerialName(value = "feels_like") val feelsLike: Double,
    @SerialName(value = "temp_min") val tempMin: Double,
    @SerialName(value = "temp_max") val tempMax: Double,
    val pressure: Int,
    val humidity: Int,
    @SerialName(value = "sea_level") val seaLevel: Int,
    @SerialName(value = "grnd_level") val grndLevel: Int
)

@Serializable
data class Wind(
    val speed: Double,
    val deg: Int,
    val gust: Double
)