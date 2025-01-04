package com.example.myweatherapp.presentation.resuable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.myweatherapp.R

@Composable
fun CustomTextfield() {
    TextField(
        value = "",
        onValueChange = {},
        placeholder = {
            Text(text = "Search for a location ...", color = Color.Cyan)
        },
        suffix = {
            CustomImage(id = R.drawable.search, size = 20)
        },
        maxLines = 1,
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(10.dp),
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            cursorColor = Color.Cyan,
            focusedTextColor = Color.Black,
            unfocusedTextColor = Color.Black,
            focusedContainerColor = Color.Black,
            unfocusedContainerColor = Color.Black
    ),
    )
}