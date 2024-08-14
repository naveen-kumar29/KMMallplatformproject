package org.example.kmm

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BrownButtonWitLoader(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    buttonText: String,
    showLoader: Boolean = false, buttonEnable: Boolean =true
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(50.dp),
        shape = RoundedCornerShape(5.dp)
    ) {
        Button(
            onClick = {
                onClick()
            },
            modifier = modifier
                .fillMaxSize(),
            enabled = buttonEnable,
            shape = MaterialTheme.shapes.small,
        )
        {
            if (!showLoader) {
                Text(
                    text = buttonText,
                    color = Color.White,
                    fontSize = 16.sp,
                )
            } else {
                CircularProgressIndicator(
                    modifier = Modifier.size(28.dp)
                )
            }
        }
    }
}