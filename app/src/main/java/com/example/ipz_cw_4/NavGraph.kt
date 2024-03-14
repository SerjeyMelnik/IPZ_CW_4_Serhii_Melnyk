package com.example.ipz_cw_4

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ipz_cw_4.screens.TaskListScreen


@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.TaskListScreen.route) {
        composable(route = Screen.TaskListScreen.route) {
            TaskListScreen(navController = navController)
        }
    }
}