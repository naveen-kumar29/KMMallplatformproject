package org.example.kmm

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Card
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kmmallplatformproject.composeapp.generated.resources.Res
import kmmallplatformproject.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource

@Composable
fun CreateYourProfile(onNavigateBack: () -> Unit){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(top = 10.dp, bottom = 10.dp, start = 20.dp, end = 20.dp),
        ) {

            Image(
                painter = painterResource(Res.drawable.compose_multiplatform), // Replace with your image resource ID
                contentDescription = null, // Provide a description for accessibility
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
                    .clip(CircleShape)
                    .clickable {
                    }, contentScale = ContentScale.Fit
            )
            Text(
                "Create your profile",
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight()
                    .padding(top = 5.dp),
            )
            /*Image(
                painter = painterResource(id = R.drawable.ic_question_img), // Replace with your image resource ID
                contentDescription = null, // Provide a description for accessibility
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
                    .clickable {
                    }, contentScale = ContentScale.Fit
            )*/

        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
        )

        BasicDetailContent()
    }
}

@Composable
fun BasicDetailContent() {
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var text by remember { mutableStateOf("") }
    val isButtonEnabled by remember(firstName, lastName, email, text) {
        derivedStateOf {
            firstName.isNotEmpty() && lastName.isNotEmpty() && email.isNotEmpty() && text.isNotEmpty()
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Text(
            text = "Enter the Basic Details ", style = TextStyle(fontSize = 18.sp), textAlign = TextAlign.Start
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
        )
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp), // You can adjust the corner radius
        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = firstName,
                    onValueChange = {
                        firstName = it
                    },
                    label = { Text("First Name", fontSize = 14.sp) },
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Text, // Set the input type to number
                        imeAction = ImeAction.Done // Set the IME action label to "Done"
                    ), maxLines = 1
                )

                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )

                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = lastName,
                    onValueChange = {
                        lastName = it
                    },
                    label = { Text("Last Name", fontSize = 14.sp) },
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Text, // Set the input type to number
                        imeAction = ImeAction.Done // Set the IME action label to "Done"
                    ), maxLines = 1
                )
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )

                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = email,
                    onValueChange = {
                        email = it
                    },
                    label = { Text("Email", fontSize = 14.sp) },
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Text, // Set the input type to number
                        imeAction = ImeAction.Done // Set the IME action label to "Done"
                    ), maxLines = 1
                )
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )

                        OutlinedTextField(
                            modifier = Modifier
                                .fillMaxWidth(),
                            value = text,
                            readOnly = true,
                            onValueChange = {
                                text = it
                            },
                            label = {
                                Text("Gender",
                                    fontSize = 14.sp
                                )
                            },
                        )


            }
        }
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom) {
            BrownButtonWitLoader(
                onClick = {
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                buttonText = "Continue",
                buttonEnable = isButtonEnabled
            )
        }

    }
}


