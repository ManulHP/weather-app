package com.example.myweatherapp.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OtherInfo(type: String, value: String, image:Int) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        CustomImage(
            id = image
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = value,
            fontSize = 22.sp,
            color = Color.Cyan,
            fontWeight = FontWeight.SemiBold
        )
        Text(
            text = type,
            fontSize = 16.sp,
            color = Color.Cyan,
            fontWeight = FontWeight.SemiBold
        )
    }
}