package com.example.mymultipurposeapp.data

val english2WordList = listOf(
    WordEntry(
        word = "affirms",
        pronunciation = "어펌즈",
        partsOfSpeech = listOf("동사"),
        definitions = listOf(
            Definition("동사", listOf("단언하다", "확언하다","주장하다"))
        ),
        dummyMeanings = listOf(
            "(동사) 부인하다", "(동사) 승인하다", "(동사) 알리다", "(동사) 지지하다", "(동사) 거절하다",
            "(동사) 혼란스럽게 하다", "(동사) 제거하다", "(동사) 정리하다"
        )
    ),
    WordEntry(
        word = "vital",
        pronunciation = "바이틀",
        partsOfSpeech = listOf("형용사"),
        definitions = listOf(
            Definition("형용사", listOf("매우 중요한", "필수적인","생명유지에 필수적인"))
        ),
        dummyMeanings = listOf(
            "(형용사) 사소한", "(형용사) 불필요한", "(형용사) 약한", "(형용사) 일시적인",
            "(형용사) 늦은", "(형용사) 정적인", "(형용사) 개인적인", "(형용사) 불확실한"
        )
    ),
    WordEntry(
        word = "periodically",
        pronunciation = "피어리어디클리",
        partsOfSpeech = listOf("부사"),
        definitions = listOf(
            Definition("부사", listOf("주기적으로", "정기적으로","때때로", "간헐적으로"))
        ),
        dummyMeanings = listOf(
            "(부사) 영원히", "(부사) 자주", "(부사) 무작위로", "(부사) 신속하게",
            "(부사) 오랫동안", "(부사) 천천히", "(부사) 드물게", "(부사) 갑작스럽게"
        )
    ),
    WordEntry(
        word = "applicant",
        pronunciation = "애필리컨트",
        partsOfSpeech = listOf("명사"),
        definitions = listOf(
            Definition("명사", listOf("지원자","신청자"))
        ),
        dummyMeanings = listOf(
            "(명사) 고용주", "(명사) 직원", "(명사) 고객", "(명사) 보증인",
            "(명사) 후보자", "(명사) 상담사", "(명사) 관리자", "(명사) 대표자"
        )
    ),
    WordEntry(
        word = "qualify",
        pronunciation = "콸리파이",
        partsOfSpeech = listOf("동사"),
        definitions = listOf(
            Definition("동사", listOf("자격을 얻다", "통과하다", "진출하다", "제한하다", "한정하다"))
        ),
        dummyMeanings = listOf(
            "(동사) 지원하다", "(동사) 평가하다", "(동사) 수락하다", "(동사) 거절하다",
            "(동사) 졸업하다", "(동사) 증명하다", "(동사) 검사하다", "(동사) 규정하다"
        )
    ),
    WordEntry(
        word = "qualifications",
        pronunciation = "콸리피케이션",
        partsOfSpeech = listOf("명사"),
        definitions = listOf(
            Definition("명사", listOf("자격", "면허", "자격증", "조건", "단서"))
        ),
        dummyMeanings = listOf(
            "(명사) 신청서", "(명사) 졸업장", "(명사) 지원자", "(명사) 수료증",
            "(명사) 보증서", "(명사) 등록증", "(명사) 동의서", "(명사) 업무 설명서"
        )
    ),
    WordEntry(
        word = "organizing",
        pronunciation = "오거나이징",
        partsOfSpeech = listOf("동명사","현재분사"),
        definitions = listOf(
            Definition("동명사", listOf("조직하는 것", "정리하는 것")),
            Definition("현재분사", listOf("조직하고 있는 중인"))
        ),
        dummyMeanings = listOf(
            "(동사) 계획하다", "(동사) 분류하다", "(동사) 축소하다", "(동사) 요청하다", "(동사) 정지하다",
            "(동사) 조율하다", "(동사) 기록하다", "(동사) 수정하다"
        )
    ),
    WordEntry(
        word = "objective",
        pronunciation = "옵젝티브", // 발음
        partsOfSpeech = listOf("명사","형용사"), //품사
        definitions = listOf(// 품사 및 단어
            Definition("명사", listOf("목표", "목적")),
            Definition("형용사", listOf("객관적인"))
        ),
        dummyMeanings = listOf(//오답
            "(명사) 주장", "(명사) 지시", "(형용사) 감정적인", "(형용사) 개인적인",
            "(형용사) 왜곡된", "(형용사) 불분명한", "(형용사) 가정적인"
        )
    ),
    WordEntry(
        word = "objection",
        pronunciation = "옵젝션", // 발음
        partsOfSpeech = listOf("명사"), //품사
        definitions = listOf(// 품사 및 단어
            Definition("명사", listOf("반대", "이의 제기")),
        ),
        dummyMeanings = listOf(//오답
            "(명사) 제안", "(명사) 허락", "(명사) 요구",
            "(명사) 지시", "(명사) 동의", "(명사) 판단", "(명사) 주장", "(명사) 관찰"
        )
    ),
    WordEntry(
        word = "commercials",
        pronunciation = "커머셜즈", // 발음
        partsOfSpeech = listOf("명사"), //품사
        definitions = listOf(// 품사 및 단어
            Definition("명사", listOf("광고", "상업광고")),
        ),
        dummyMeanings = listOf(//오답
            "(명사) 소식", "(명사) 보도", "(명사) 프로그램", "(명사) 행사",
            "(명사) 상품", "(명사) 가격", "(명사) 홍보", "(명사) 계약"
        )
    ),
    WordEntry(
        word = "dispute",
        pronunciation = "디스퓨트", // 발음
        partsOfSpeech = listOf("명사","동사"), //품사
        definitions = listOf(// 품사 및 단어
            Definition("명사", listOf("분쟁", "논쟁", "다툼")),
            Definition("동사", listOf("반박하다","다투다")),
        ),
        dummyMeanings = listOf(//오답
            "(명사) 요청", "(명사) 거래", "(동사) 동의하다", "(동사) 설명하다",
            "(동사) 확신하다", "(동사) 조율하다", "(동사) 무시하다"
        )
    ),
    WordEntry(
        word = "limit",
        pronunciation = "리밋", // 발음
        partsOfSpeech = listOf("명사","동사"), //품사
        definitions = listOf(// 품사 및 단어
            Definition("명사", listOf("제한", "한도", "한계")),
            Definition("동사", listOf("제한하다", "줄이다")),
        ),
        dummyMeanings = listOf(//오답
            "(명사) 기준", "(명사) 용량", "(동사) 확장하다", 
            "(동사) 허용하다", "(동사) 중단하다", "(동사) 회피하다", "(동사) 분산하다"

        )
    ),
    WordEntry(
        word = "explore",
        pronunciation = "익스플로어", // 발음
        partsOfSpeech = listOf("동사"), //품사
        definitions = listOf(// 품사 및 단어
            Definition("동사", listOf("탐험하다", "조사하다", "탐색하다"))
        ),
        dummyMeanings = listOf(//오답
            "(동사) 관찰하다", "(동사) 확장하다", "(동사) 조사받다",
            "(동사) 요청하다", "(동사) 지시하다", "(동사) 제거하다", "(동사) 정리하다", "(동사) 실행하다"


        )
    ),
    WordEntry(
        word = "terminate",
        pronunciation = "터미네이트", // 발음
        partsOfSpeech = listOf("동사"), //품사
        definitions = listOf(// 품사 및 단어
            Definition("동사", listOf("끝내다", "종료하다"))
        ),
        dummyMeanings = listOf(//오답
            "(동사) 연장하다", "(동사) 변경하다", "(동사) 시작하다",
            "(동사) 확인하다", "(동사) 요청하다", "(동사) 위임하다", "(동사) 감소시키다", "(동사) 정리하다"
        )
    ),
    WordEntry(
        word = "reach",
        pronunciation = "리치", // 발음
        partsOfSpeech = listOf("동사","명사"), //품사
        definitions = listOf(// 품사 및 단어
            Definition("동사", listOf("도달하다", "도착하다", "손을 뻗다")),
            Definition("명사", listOf("거리", "범위", "영향력")),
        ),
        dummyMeanings = listOf(//오답
            "(동사) 연장하다", "(동사) 변경하다", "(동사) 시작하다",
            "(동사) 확인하다", "(동사) 요청하다", "(동사) 위임하다", "(동사) 감소시키다", "(동사) 정리하다"
        )
    ),
    WordEntry(
        word = "audience",
        pronunciation = "오디언스", // 발음
        partsOfSpeech = listOf("명사"), //품사
        definitions = listOf(// 품사 및 단어
            Definition("명사", listOf("관객", "청중", "시청자")),
        ),
        dummyMeanings = listOf(//오답
            "(명사) 발표자", "(명사) 출연자", "(명사) 작가", "(명사) 방송국",
            "(명사) 회의실", "(명사) 무대", "(명사) 대본", "(명사) 연설"

        )
    ),

    )