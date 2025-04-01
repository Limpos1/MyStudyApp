package com.example.mymultipurposeapp.navigation

sealed class Screen(val route: String) {
    object Category : Screen("category")
    object StudyCategory : Screen("study_category")
    object EnglishCategory : Screen("english_category")
    object ToeicFormulas : Screen("toeic_formulas")
    object WrongNote : Screen("wrong_note")
    object AllProblems : Screen("all_problems")
    object WordStudy : Screen("word_study") {
        fun withArgs(setName: String): String = "$route/$setName"
    }

}