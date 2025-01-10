package com.example.myweatherapp.presentation

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.myweatherapp.BuildConfig
import com.example.myweatherapp.R
import com.example.myweatherapp.core.ShimmerEffect
import com.example.myweatherapp.presentation.component.WeatherItem
import com.example.myweatherapp.presentation.component.WeatherShimmer
import com.example.myweatherapp.presentation.viewmodel.Loading
import com.example.myweatherapp.presentation.viewmodel.WeatherState
import com.example.myweatherapp.presentation.viewmodel.WeatherViewModel

@Composable
fun WeatherScreen(modifier: Modifier, viewModel: WeatherViewModel = hiltViewModel()) {
    val state = viewModel.state.observeAsState(WeatherState()).value

    LaunchedEffect(Unit) {
        viewModel.getWeatherData("London", "metric" ,BuildConfig.API_KEY)
    }

    Scaffold {
        paddingValues ->
        Column (
            modifier = modifier
                .padding(paddingValues)
        ){

            if(state.isLoading == Loading.LOADING) {
                ShimmerEffect(
                    shimmerContent = {brush ->
                        WeatherShimmer(brush)
                    }
                )
            } else if(state.isLoading == Loading.SUCCESS) {
                WeatherItem(state = state)
            } else if(state.error != null) {
                Text("error")
            }
        }
    }
}