package com.example.myweatherapp.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myweatherapp.data.model.WeatherModel
import com.example.myweatherapp.domain.usecase.repository.GetWeatherUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val getWeatherUseCase: GetWeatherUseCase
) : ViewModel() {
    private val _state = MutableLiveData<WeatherState>()
    val state:LiveData<WeatherState> = _state

    fun getWeatherData(q: String, units:String, apiKey: String) {
        viewModelScope.launch {
            _state.value = WeatherState(isLoading = true)
            try {
                val weather = getWeatherUseCase(q, units, apiKey)
                Log.d("TAG", "$weather")
                _state.value = WeatherState(weather = weather, isLoading = false)
            } catch (e: Exception) {
                Log.d("TAG", "${e.message}")
                _state.value = WeatherState(error = e.message, isLoading = false)
            }
        }
    }
}

// presentation/WeatherState.kt
data class WeatherState(
    val isLoading: Boolean = false,
    val weather: WeatherModel? = null,
    val error: String? = null
)