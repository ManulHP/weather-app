package com.example.myweatherapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myweatherapp.core.theme.CyanColor

@Composable
fun CustomImage(id: Int, size: Int?=35, onSubmitClick: () -> Unit, color: Color = CyanColor) {
    Image(
        painter = painterResource(id = id),
        contentDescription = "Wind",
        colorFilter = ColorFilter.tint(color),
        modifier = Modifier
            .size(size!!.dp)
            .clickable {
                onSubmitClick()
            }
    )
}