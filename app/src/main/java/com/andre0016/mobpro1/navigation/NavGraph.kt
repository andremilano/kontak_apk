package com.andre0016.mobpro1.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.andre0016.mobpro1.ui.screen.DetailScreen
import com.andre0016.mobpro1.ui.screen.KEY_ID_KONTAK
import com.andre0016.mobpro1.ui.screen.MainScreen

@Composable
fun SetupNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) {
            MainScreen(navController)
        }
        composable(route = Screen.FormBaru.route) {
            DetailScreen(navController)
        }
        composable(route = Screen.FormUbah.route, arguments = listOf(
            navArgument(KEY_ID_KONTAK) {type = NavType.LongType}
        )
        ) { navBackStackEntry ->
            val id = navBackStackEntry.arguments?.getLong(KEY_ID_KONTAK)
            DetailScreen(navController, id)
        }
    }
}