package com.example.mymultipurposeapp.english

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mymultipurposeapp.data.WordRepository
import com.example.mymultipurposeapp.navigation.Screen
import com.example.mymultipurposeapp.common.ScreenWithTopBar

@Composable
fun WordStudyScreen(navController: NavHostController) {
    val wordSets = WordRepository.englishSets.keys.sorted()

    ScreenWithTopBar(title = "영어 단어 공부", navController = navController) { innerPadding ->
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.padding(innerPadding)
        ) {
            items(items = wordSets) { setName ->  // ⭐ 여기 핵심
                Button(
                    onClick = {
                        navController.navigate(Screen.WordStudy.withArgs(setName))
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = setName)
                }
            }
        }
    }
}
