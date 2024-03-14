package com.example.ipz_cw_4.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ipz_cw_4.Task
import com.example.ipz_cw_4.ui.theme.IPZ_CW_4_Serhii_MelnykTheme

@Composable
fun TaskListScreen(modifier: Modifier = Modifier) {
    val taskList =
        (1..100).map { Task("Task $it", "Description $it", listOf(true, false).random()) }

    LazyColumn {

    }
}

@Preview
@Composable
fun TaskListScreen() {
    IPZ_CW_4_Serhii_MelnykTheme {
        TaskListScreen()
    }
}

