package com.main.speedometerx.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.main.core.ui.theme.SpeedometerXTheme
import com.main.speedometerx.navigation.MainNavigationGraph
import com.main.speedometerx.navigation.MainNavigationGraphRoutes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            val navController = rememberNavController()
            val startDestination = MainNavigationGraphRoutes.MAIN
            MainNavigationGraph(
                navController = navController,
                startDestination = startDestination
            )
        }
    }
}