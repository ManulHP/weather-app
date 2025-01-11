package com.example.myweatherapp.core.error

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.myweatherapp.R
import com.example.myweatherapp.core.theme.BlackColor
import com.example.myweatherapp.presentation.component.CustomImage

@Composable
fun WeatherError(error: String) {
    Card(
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent // Set the background color of the Card
        ),
        modifier = Modifier
            .fillMaxWidth()
            .border(
                width = 2.dp, // Thickness of the border
                color = BlackColor, // Border color
                shape = RoundedCornerShape(10.dp) // Optional: Border shape
            )
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        ) {
            CustomImage(
                id = R.drawable.warning,
                onSubmitClick = {},
                color = BlackColor,
                size = 120
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(error, style = MaterialTheme.typography.bodySmall)
        }
    }
}