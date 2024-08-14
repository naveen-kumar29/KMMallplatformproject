package org.example.kmm

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import kmmallplatformproject.composeapp.generated.resources.Res
import kmmallplatformproject.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App(navigator: Navigator) {
    MaterialTheme {
        val currentDestination by navigator.currentDestination.collectAsState()

        when (currentDestination) {
            is NavigationDestination.Home -> HomeScreen(onNavigate = { navigator.navigateTo(it) })
            is NavigationDestination.Details -> CreateYourProfile (onNavigateBack = { navigator.navigateTo(NavigationDestination.Home) })
            /*is NavigationDestination.Profile -> {
                val userId = (currentDestination as NavigationDestination.Profile).userId
                LoginScreen(userId = userId, onNavigateBack = { navigator.navigateTo(NavigationDestination.Home) })
            }*/
            // Add other destinations as needed
            is NavigationDestination.Profile -> TODO()
        }

            /*AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }*/
    }
}