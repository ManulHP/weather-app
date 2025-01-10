package com.example.myweatherapp.presentation.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.myweatherapp.R
import com.example.myweatherapp.core.theme.BlackColor
import com.example.myweatherapp.core.theme.CyanColor

@Composable
fun CustomTextfield() {
    TextField(
        value = "",
        onValueChange = {},
        placeholder = {
            Text(text = "Search for a location ...", color = CyanColor, style = MaterialTheme.typography.bodyMedium)
        },
        suffix = {
            CustomImage(id = R.drawable.search, size = 20)
        },
        maxLines = 1,
        textStyle = MaterialTheme.typography.bodySmall,
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(10.dp),
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            cursorColor = CyanColor,
            focusedTextColor = BlackColor,
            unfocusedTextColor = BlackColor,
            focusedContainerColor = BlackColor,
            unfocusedContainerColor = BlackColor
    ),
    )
}