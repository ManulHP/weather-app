package com.example.myweatherapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CustomImage(id: Int, size: Int?=35) {
    Image(
        painter = painterResource(id = id),
        contentDescription = "Wind",
        colorFilter = ColorFilter.tint(Color.Cyan),
        modifier = Modifier
            .size(size!!.dp)
    )
}