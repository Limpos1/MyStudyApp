package com.example.mymultipurposeapp.data

val english1WordList = listOf(
    WordEntry(
        word = "present",
        partsOfSpeech = listOf("명사", "형용사", "동사"),
        definitions = listOf(
            Definition("명사", listOf("선물", "현재")),
            Definition("형용사", listOf("출석한", "현재의")),
            Definition("동사", listOf("제시하다", "수여하다"))
        ),
        dummyMeanings = listOf(
            "(형용사) 길고 긴", "(명사) 사막", "(부사) 조용히",
            "(전치사) 위에", "(동사) 일어나다", "(형용사) 흐린"
        )
    ),
    WordEntry(
        word = "committee",
        partsOfSpeech = listOf("명사"),
        definitions = listOf(
            Definition("명사", listOf("위원회", "위원들")),
        ),
        dummyMeanings = listOf(
            "(명사) 약속", "(명사) 위임장", "(명사) 회의", "(동사) 제출하다",
            "(동사) 약속하다", "(명사) 헌신", "(명사) 사명", "(명사) 조직"

        )
)
    // ... 추가 가능
)