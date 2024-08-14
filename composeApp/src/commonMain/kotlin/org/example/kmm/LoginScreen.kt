package org.example.kmm

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kmmallplatformproject.composeapp.generated.resources.Res
import kmmallplatformproject.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.jetbrains.skia.ColorChannel

@Composable
@Preview
fun LoginScreen() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        var firstName by remember { mutableStateOf("") }
        var lastName by remember { mutableStateOf("") }
        var gender by remember { mutableStateOf("") }
        var textShow by remember { mutableStateOf("") }
        /*val screenTextStyle = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Gray,
            unfocusedBorderColor = colorResource(id = R.color.gray_8),
            focusedLabelColor = colorResource(id = R.color.gray_7),
            unfocusedLabelColor = colorResource(id = R.color.gray_8),
            cursorColor = colorResource(id = R.color.gray_2)
        )*/
        Column(Modifier.fillMaxWidth().fillMaxHeight().padding(50.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

            Text(
                text = "Login",
                color = Color.Black,
                fontSize = 26.sp,
            )

            Spacer(modifier=Modifier.fillMaxWidth().height(20.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = firstName,
                onValueChange = {
                        firstName = it
                },
                textStyle = TextStyle(),
                label = { Text("First Name", fontSize = 14.sp) },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Text, // Set the input type to number
                    imeAction = ImeAction.Done // Set the IME action label to "Done"
                ), maxLines = 1
            )

            Spacer(modifier=Modifier.fillMaxWidth().height(10.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = lastName,
                onValueChange = {
                        lastName = it
                },
                textStyle = TextStyle(),
                label = { Text("Last Name", fontSize = 14.sp) },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Text, // Set the input type to number
                    imeAction = ImeAction.Done // Set the IME action label to "Done"
                ), maxLines = 1
            )

            Spacer(modifier=Modifier.fillMaxWidth().height(10.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = gender,
                onValueChange = {

                        gender = it

                },
                textStyle = TextStyle(),
                label = { Text("Gender", fontSize = 14.sp) },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Text, // Set the input type to number
                    imeAction = ImeAction.Done // Set the IME action label to "Done"
                ), maxLines = 1
            )

            Spacer(modifier=Modifier.fillMaxWidth().height(10.dp))

            Button(
                onClick = {
                    textShow= "First name = $firstName \n Last name = $lastName \n gender = $gender"
                },
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
            )
            {
                    Text(
                        text = "LOGIN",
                        color = Color.White,
                        fontSize = 16.sp,
                    )

            }
            Spacer(modifier=Modifier.fillMaxWidth().height(10.dp))

            Text(
                text = textShow,
                color = Color.Black,
                fontSize = 16.sp,
            )

            /*Animated  Visibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }*/
        }
    }
}