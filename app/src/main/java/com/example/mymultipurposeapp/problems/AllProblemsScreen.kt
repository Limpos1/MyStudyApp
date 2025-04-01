package com.example.mymultipurposeapp.problems

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mymultipurposeapp.common.ScreenWithTopBar

@Composable
fun AllProblemsScreen(navController: NavHostController) {
    ScreenWithTopBar(title = "모든 문제 풀기", navController = navController) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Text("여기에서 모든 과목의 문제를 랜덤하게 풀 수 있어요!")
            // TODO: 문제 풀기 UI 추가 예정
        }
    }
}