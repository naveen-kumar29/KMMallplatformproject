package org.example.kmm

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMM all platform project",
    ) {
//        HomeScreen()
//        LoginScreen()
        val navigator =Navigator()
//        App(navigator)
        SampleUI()
    }
}