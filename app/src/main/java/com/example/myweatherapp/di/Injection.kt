package com.example.myweatherapp.di

import com.example.myweatherapp.data.datasource.RetrofitInstance
import com.example.myweatherapp.data.datasource.WeatherApi
import com.example.myweatherapp.data.repository.WeatherRepositoryImp
import com.example.myweatherapp.domain.repository.WeatherRepository
import com.example.myweatherapp.domain.usecase.repository.GetWeatherUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

// Use for dependency injection
// Dependencies for Retrofit (WeatherApi), repository, and use case

@Module
@InstallIn(SingletonComponent::class)
object Injection {
    @Provides
    @Singleton
    fun provideWeatherApi(): WeatherApi {
        return RetrofitInstance.api
    }

    @Provides
    @Singleton
    fun provideWeatherRepository(api: WeatherApi): WeatherRepository {
        return WeatherRepositoryImp(api)
    }

    @Provides
    @Singleton
    fun provideGetWeatherUseCase(repository: WeatherRepository): GetWeatherUseCase {
        return GetWeatherUseCase(repository)
    }
}