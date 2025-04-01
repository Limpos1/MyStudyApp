package com.example.mymultipurposeapp.english

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.mymultipurposeapp.navigation.Screen
import com.example.mymultipurposeapp.common.ScreenWithTopBar

@Composable
fun EnglishCategoryScreen(navController: NavHostController) {
    ScreenWithTopBar(title = "영어 카테고리", navController = navController) { innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)
            .padding(16.dp)) {

            Button(onClick = {
                navController.navigate(Screen.WordStudy.route)
            }) {
                Text("📘 영어 단어 공부")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = {
                navController.navigate(Screen.ToeicFormulas.route)
            }) {
                Text("📐 토익 공식 모음")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = {
                navController.navigate(Screen.WrongNote.route)
            }) {
                Text("❌ 오답노트")
            }
        }
    }
}