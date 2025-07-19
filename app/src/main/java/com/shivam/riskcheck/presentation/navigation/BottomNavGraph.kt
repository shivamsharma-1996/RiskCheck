package com.shivam.riskcheck.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.shivam.riskcheck.presentation.ui.screens.HistoryScreen
import com.shivam.riskcheck.presentation.ui.screens.HomeScreen
import com.shivam.riskcheck.presentation.ui.screens.ProfileScreen
import com.shivam.riskcheck.presentation.ui.screens.ScanScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.Home.route
    ) {
        composable(BottomNavItem.Home.route) { HomeScreen() }
        composable(BottomNavItem.Scan.route) { ScanScreen() }
        composable(BottomNavItem.History.route) { HistoryScreen() }
        composable(BottomNavItem.Profile.route) { ProfileScreen() }
    }
} 