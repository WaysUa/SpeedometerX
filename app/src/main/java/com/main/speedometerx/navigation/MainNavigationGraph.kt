package com.main.speedometerx.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.main.digital_speedometer.DigitalSpeedometerScreen

@Composable
fun MainNavigationGraph(
    navController: NavHostController,
    startDestination: String
) {
    NavHost(
        navController = navController,
        route = "root_graph",
        startDestination = startDestination
    ) {
        composable(route = MainNavigationGraphRoutes.MAIN) {
            DigitalSpeedometerScreen()
        }
    }
}

object MainNavigationGraphRoutes {
    const val MAIN = "main_screen"
}