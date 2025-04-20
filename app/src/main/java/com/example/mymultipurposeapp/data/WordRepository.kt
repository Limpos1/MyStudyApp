package com.example.mymultipurposeapp.data

object WordRepository {
    val englishSets: Map<String, List<WordEntry>> = mapOf(
        "영어1" to english1WordList,
        "영어2" to english2WordList,
        //"영어3" to english3WordList
        // 필요 시 계속 확장
    )
}