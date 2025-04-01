package com.example.mymultipurposeapp.category

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mymultipurposeapp.navigation.Screen
import com.example.mymultipurposeapp.common.ScreenWithTopBar

@Composable
fun StudyCategoryScreen(navController: NavHostController) {
    ScreenWithTopBar(title = "과목 선택", navController = navController) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            // 영어 버튼
            Button(onClick = { navController.navigate(Screen.EnglishCategory.route) }) {
                Text("영어")
            }

            // 나중에 다른 과목들 추가할 자리
            Spacer(modifier = Modifier.height(16.dp))

            /*
            Button(onClick = { navController.navigate(Screen.MathCategory.route) }) {
                Text("수학")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { navController.navigate(Screen.HistoryCategory.route) }) {
                Text("역사")
            }
            */

            Button(onClick = {
                navController.navigate(Screen.AllProblems.route)
            }) {
                Text("모든 문제 풀기")
            }
        }
    }
}