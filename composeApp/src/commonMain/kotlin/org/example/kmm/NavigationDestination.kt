package org.example.kmm

sealed class NavigationDestination {
    object Home : NavigationDestination()
    object Details : NavigationDestination()
    data class Profile(val userId: String) : NavigationDestination()
    // Add other destinations as needed
}