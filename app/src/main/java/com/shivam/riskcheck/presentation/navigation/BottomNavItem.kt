package com.shivam.riskcheck.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.CameraAlt
import androidx.compose.material.icons.outlined.History
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val route: String,
    val filledIcon: ImageVector,
    val outlinedIcon: ImageVector,
    val label: String
) {
    object Home : BottomNavItem("home", Icons.Filled.Home, Icons.Outlined.Home, "Home")
    object Scan : BottomNavItem("scan", Icons.Filled.CameraAlt, Icons.Outlined.CameraAlt, "Scan")
    object History : BottomNavItem("history", Icons.Filled.History, Icons.Outlined.History, "History")
    object Profile : BottomNavItem("profile", Icons.Filled.Person, Icons.Outlined.Person, "Profile")

    companion object {
        val items = listOf(Home, Scan, History, Profile)
    }
}