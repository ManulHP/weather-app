package com.example.myweatherapp.presentation

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myweatherapp.R
import com.example.myweatherapp.presentation.resuable.CustomTextfield
import com.example.myweatherapp.presentation.resuable.OtherInfo

@Composable
fun WeatherScreen(modifier: Modifier) {
    Scaffold {
        paddingValues ->
        Column (
            modifier = modifier
                .padding(paddingValues)
        ){

            // search text field
            CustomTextfield()
            Spacer(modifier = Modifier.height(20.dp))
            // current location
            Text(
               text = "New York",
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
                    text = "Friday 20th January",
                    color = Color.Cyan,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(start = 15.dp, top = 10.dp, end = 15.dp, bottom = 10.dp)
                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            // weather tyoe (eg: Cloudly, rainy)
            Text(
                text = "Cloudy",
                color = Color.Black,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(0.dp)
                    .align(Alignment.CenterHorizontally)
            )
            // Current weather in degrees
            Text(
                text = "28",
                fontSize = 180.sp,
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
                    text = "Now it feels like 35, actually it's 40 \nIt feels hot because of the direct sun light. Today the temperature is felt in range of +33 to 27",
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
                    OtherInfo(value = "2Km/h", type = "Wind", image = R.drawable.airwave)
                    OtherInfo(value = "62%", type = "Humidity", image = R.drawable.humidity)
                    OtherInfo(value = "1Km", type = "Visibility", image = R.drawable.visibility)
                }
            }
        }
    }
}