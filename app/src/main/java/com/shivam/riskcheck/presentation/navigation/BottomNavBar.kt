package com.shivam.riskcheck.presentation.navigation

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.compose.material3.MaterialTheme

@Composable
fun BottomNavBar(navController: NavController, currentRoute: String?) {
    val selectedColor = MaterialTheme.colorScheme.primary
    val unselectedColor = Color.Gray
    NavigationBar {
        BottomNavItem.items.forEach { item ->
            NavigationBarItem(
                selected = currentRoute == item.route,
                onClick = {
                    if (currentRoute != item.route) {
                        navController.navigate(item.route) {
                            popUpTo(navController.graph.startDestinationId) { saveState = true }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                },
                icon = {
                    Icon(
                        imageVector = if (currentRoute == item.route) item.filledIcon else item.outlinedIcon,
                        contentDescription = item.label
                    )
                },
                label = { Text(item.label) },
                alwaysShowLabel = true,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = selectedColor,
                    selectedTextColor = selectedColor,
                    unselectedIconColor = unselectedColor,
                    unselectedTextColor = unselectedColor,
                    indicatorColor = Color.Transparent
                ),
                interactionSource = remember { MutableInteractionSource() },
            )
        }
    }
} 