package org.example.kmm

import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController() = ComposeUIViewController {
    val navigator = Navigator()
    App(navigator)/*LoginScreen()*//*HomeScreen()*/
}