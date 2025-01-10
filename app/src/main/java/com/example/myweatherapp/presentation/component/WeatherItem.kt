package com.example.myweatherapp.presentation.component

import android.os.Build
import androidx.annotation.RequiresApi
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myweatherapp.R
import com.example.myweatherapp.presentation.viewmodel.WeatherState
import java.sql.Timestamp
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

@Composable
fun WeatherItem(state: WeatherState) {
    Column {
        CustomTextfield()
        Spacer(modifier = Modifier.height(20.dp))
        // current location
        Text(
            text = "${state.weather?.name}",
            fontSize = 32.sp,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(20.dp))
        // Current data and time
        Card(
            shape = RoundedCornerShape(25.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Black // Set the background color of the Card
            ),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = formatDataTime(state.weather!!.dt),
                color = Color.Cyan,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(start = 15.dp, top = 10.dp, end = 15.dp, bottom = 10.dp)
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        // weather tyoe (eg: Cloudly, rainy)
        Text(
            text = state.weather!!.weather[0].main,
            color = Color.Black,
            fontSize = 18.sp,
            modifier = Modifier
                .padding(0.dp)
                .align(Alignment.CenterHorizontally)
        )
        // Current weather in degrees
        Text(
            text = "${state.weather.main.temp}",
            fontSize = 120.sp,
            color = Color.Black,
            lineHeight = 28.sp,
            modifier = Modifier
                .padding(horizontal = 0.dp, vertical = 0.dp)
                .align(Alignment.CenterHorizontally)
        )
        // summary section
        Column {
            Text(
                text = "Daily Summary",
                fontSize = 18.sp,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = "Now it feels like ${state.weather.main.feelsLike}, actually it's ${state.weather.main.temp} \nIt feels hot because of the direct sun light. Today the temperature is felt in range of ${state.weather.main.tempMin} to ${state.weather.main.tempMax}",
                fontSize = 16.sp,
                lineHeight = 20.sp,
                color = Color.Black,

                )
        }
        Spacer(modifier = Modifier.height(20.dp))
        // other details
        Card(
            shape = RoundedCornerShape(10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Black // Set the background color of the Card
            ),
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .padding(horizontal = 10.dp, vertical = 15.dp)
                    .fillMaxWidth()
            ){
                MainWeatherInfo(value = "${state.weather.wind.speed}Km/h", type = "Wind", image = R.drawable.airwave)
                MainWeatherInfo(value = "${state.weather.main.humidity}%", type = "Humidity", image = R.drawable.humidity)
                MainWeatherInfo(value = "${state.weather.visibility}km", type = "Visibility", image = R.drawable.visibility)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
        // other infor
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ){
            OtherWeatherInfo(value = "${state.weather.main.pressure}", type = "Pressure")
            OtherWeatherInfo(value = "${state.weather.main.seaLevel}", type = "Sea Level")
            OtherWeatherInfo(value = "${state.weather.main.grndLevel}", type = "Ground Level")
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
fun formatDataTime(timestamp: Long) : String {
    val instant = Instant.ofEpochSecond(timestamp)
    val formatter = DateTimeFormatter.ofPattern("yyyy MM d")
        .withZone(ZoneId.systemDefault()) // Use system's timezone
    return formatter.format(instant)
}