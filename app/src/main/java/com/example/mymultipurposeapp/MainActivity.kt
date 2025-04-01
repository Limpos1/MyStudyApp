package com.example.mymultipurposeapp

import CategoryScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mymultipurposeapp.category.StudyCategoryScreen
import com.example.mymultipurposeapp.english.EnglishCategoryScreen
import com.example.mymultipurposeapp.english.WordStudyQuizScreen
import com.example.mymultipurposeapp.english.WordStudyScreen
import com.example.mymultipurposeapp.navigation.Screen
import com.example.mymultipurposeapp.problems.AllProblemsScreen
import com.example.mymultipurposeapp.ui.theme.MyMultipurposeAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMultipurposeAppTheme {
                val navController = rememberNavController()
                NavHost(navController, startDestination = Screen.Category.route) {
                    composable(Screen.Category.route){
                        CategoryScreen(navController)
                    }
                    composable(Screen.StudyCategory.route) {
                        StudyCategoryScreen(navController)
                    }
                    composable(Screen.EnglishCategory.route){
                        EnglishCategoryScreen(navController)
                    }
                    composable(Screen.AllProblems.route) {
                        AllProblemsScreen(navController)
                    }

                    // ✅ 영어 세트 선택 화면 ("영어1", "영어2" 선택하는 곳)
                    composable(Screen.WordStudy.route) {
                        WordStudyScreen(navController)
                    }

                    // ✅ 선택된 세트에 따라 문제 풀이 화면 이동
                    composable(
                        route = Screen.WordStudy.route + "/{setName}",
                        arguments = listOf(navArgument("setName") { type = NavType.StringType })
                    ) {
                        val setName = it.arguments?.getString("setName") ?: ""
                        WordStudyQuizScreen(setName = setName, navController = navController)
                    }


                }
            }
        }
    }
}
