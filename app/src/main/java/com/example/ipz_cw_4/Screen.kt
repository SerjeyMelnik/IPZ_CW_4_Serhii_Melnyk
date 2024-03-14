package com.example.ipz_cw_4

sealed class Screen(val route:String){
    data object TaskListScreen : Screen(route = "task_list_screen")
}