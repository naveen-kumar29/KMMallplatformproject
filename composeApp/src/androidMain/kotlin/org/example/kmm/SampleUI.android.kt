package org.example.kmm

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp

@Composable
actual fun SampleUI() {
    Column (modifier = Modifier.fillMaxSize()) {
        LazyRow(
            Modifier
                .fillMaxWidth()
                .padding(10.dp)) {
            item{
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .width(100.dp)
                        .wrapContentHeight(),
                    colors = CardDefaults.cardColors(containerColor =  Color.White),
                    /*border = BorderStroke(1.dp,Color.Blue),*/
                    shape = RoundedCornerShape(8.dp), // You can adjust the corner radius
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                ) {
                    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                            Text("Total Orders")
                            Text("660")
                    }

                }

                }

            item{
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .width(100.dp)
                        .wrapContentHeight(),
                    colors = CardDefaults.cardColors(containerColor =  Color.White),
                    /*border = BorderStroke(1.dp,Color.Blue),*/
                    shape = RoundedCornerShape(8.dp), // You can adjust the corner radius
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                ) {
                    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                        Text("Revenue")
                        Text("₹331,513.00")
                    }

                }

            }
        }

        LazyRow(
            Modifier
                .fillMaxWidth()
                .padding(10.dp)) {
            item{
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .width(100.dp)
                        .wrapContentHeight(),
                    colors = CardDefaults.cardColors(containerColor =  Color.White),
                    /*border = BorderStroke(1.dp,Color.Blue),*/
                    shape = RoundedCornerShape(8.dp), // You can adjust the corner radius
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                ) {
                    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                        Text("Total Commission")
                        Text("₹331,49.00")
                    }

                }

            }

            item{
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    colors = CardDefaults.cardColors(containerColor =  Color.White),
                    /*border = BorderStroke(1.dp,Color.Blue),*/
                    shape = RoundedCornerShape(8.dp), // You can adjust the corner radius
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                ) {
                    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                        Text("Cancel Order")
                        Text("889")
                    }

                }

            }
        }


    }
}
