package com.example.mymultipurposeapp.data

data class WordEntry(
    val word: String,
    val partsOfSpeech: List<String>,
    val definitions: List<Definition>,
    val dummyMeanings: List<String>
)

data class Definition(
    val part: String,               // 품사 (예: 명사, 동사)
    val meanings: List<String>     // 뜻들
)