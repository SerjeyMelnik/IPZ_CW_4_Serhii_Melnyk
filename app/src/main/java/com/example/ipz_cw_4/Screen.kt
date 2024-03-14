package com.example.ipz_cw_4

sealed class Screen(val route:String){
    class TaskListScreen(name: String? = null, isActive: Boolean = false) :
        Screen(route = "task_list_screen?name=$name&isActive=$isActive")

    class TaskDetailScreen(name: String, description: String, isActive: Boolean) :
        Screen(route = "list_item_screen?name=$name&description=$description&isActive=$isActive")
}