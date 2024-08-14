package org.example.kmm

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class Navigator {
    private val _currentDestination = MutableStateFlow<NavigationDestination>(NavigationDestination.Home)
    val currentDestination: StateFlow<NavigationDestination> = _currentDestination

    fun navigateTo(destination: NavigationDestination) {
        _currentDestination.value = destination
    }
}