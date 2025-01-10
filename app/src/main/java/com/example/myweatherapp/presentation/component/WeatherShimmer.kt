package com.example.myweatherapp.presentation.component

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myweatherapp.R

@Composable
fun WeatherShimmer(brush: Brush) {
    Column {
//        CustomTextfield()
//        Spacer(modifier = Modifier.height(20.dp)) // todo: remove later
        Box(
            modifier = Modifier
                .height(40.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
                .background(brush)
        )
        Spacer(modifier = Modifier.height(20.dp))
        // current location
        Box(
            modifier = Modifier
                .height(20.dp)
                .fillMaxWidth(0.2f)
                .align(Alignment.CenterHorizontally)
                .clip(RoundedCornerShape(8.dp))
                .background(brush)
        )
        Spacer(modifier = Modifier.height(20.dp))
        // Current data and time
        Box(
            modifier = Modifier
                .height(30.dp)
                .fillMaxWidth(0.3f)
                .align(Alignment.CenterHorizontally)
                .clip(RoundedCornerShape(25.dp))
                .background(brush)
        )
        Spacer(modifier = Modifier.height(5.dp))
        // weather tyoe (eg: Cloudly, rainy)
        Box(
            modifier = Modifier
                .height(15.dp)
                .fillMaxWidth(0.1f)
                .align(Alignment.CenterHorizontally)
                .clip(RoundedCornerShape(10.dp))
                .background(brush)
        )
        Spacer(modifier = Modifier.height(10.dp))
        // Current weather in degrees
        Box(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth(0.5f)
                .align(Alignment.CenterHorizontally)
                .clip(RoundedCornerShape(10.dp))
                .background(brush)
        )
        Spacer(modifier = Modifier.height(20.dp))
        // summary section
        Column {
            Box(
                modifier = Modifier
                    .height(20.dp)
                    .fillMaxWidth(0.5f)
                    .clip(RoundedCornerShape(10.dp))
                    .background(brush)
            )
            Spacer(modifier = Modifier.height(10.dp))
            repeat(4) {
            Box(
                modifier = Modifier
                    .padding(vertical = 5.dp)
                    .height(20.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .background(brush)
            )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        // other details
        Box(
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
                .background(brush)
        )
    }
}