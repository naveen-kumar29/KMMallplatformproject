package org.example.kmm

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport(document.body!!) {
        val navigator = Navigator()
        SampleUI()
//        App(navigator)
//        LoginScreen()
//        HomeScreen()
    }
}