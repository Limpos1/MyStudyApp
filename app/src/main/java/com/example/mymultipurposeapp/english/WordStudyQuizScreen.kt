package com.example.mymultipurposeapp.english

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mymultipurposeapp.data.WordEntry
import com.example.mymultipurposeapp.data.WordRepository
import com.example.mymultipurposeapp.common.ScreenWithTopBar
import kotlin.random.Random

enum class QuizState {
    PARTS_OF_SPEECH,
    DEFINITION,
    FINISHED
}

data class DefinitionChoice(val text: String, val isCorrect: Boolean)

fun generateDefinitionChoicesFromEntry(entry: WordEntry): List<DefinitionChoice> {
    val correctChoices = entry.definitions.map {
        val meaning = it.meanings.random(Random)
        DefinitionChoice("(${it.part}) $meaning", true)
    }
    val needed = 9 - correctChoices.size
    val dummy = entry.dummyMeanings.shuffled(Random).take(needed).map {
        DefinitionChoice(it, false)
    }
    return (correctChoices + dummy).shuffled(Random)
}

@Composable
fun WordStudyQuizScreen(setName: String, navController: NavHostController) {
    val wordList = WordRepository.englishSets[setName] ?: emptyList()
    var currentIndex by remember { mutableStateOf(0) }
    var quizState by remember { mutableStateOf(QuizState.PARTS_OF_SPEECH) }
    val currentWord = wordList.getOrNull(currentIndex)

    val selectedTags = remember { mutableStateListOf<String>() }
    val selectedDefinitionIndexes = remember { mutableStateListOf<Int>() }
    var submitted by remember { mutableStateOf(false) }
    var showWrongMessage by remember { mutableStateOf(false) }
    var definitionChoices by remember { mutableStateOf<List<DefinitionChoice>>(emptyList()) }

    if (currentWord == null) {
        quizState = QuizState.FINISHED
    }

    ScreenWithTopBar(title = setName, navController = navController) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding).padding(16.dp)) {
            when (quizState) {
                QuizState.PARTS_OF_SPEECH -> {
                    Text("단어: ${currentWord!!.word}", style = MaterialTheme.typography.headlineSmall)
                    Spacer(modifier = Modifier.height(16.dp))

                    val allParts = listOf("명사", "동사", "형용사", "부사", "전치사", "접속사")
                    allParts.forEach { tag ->
                        val isSelected = selectedTags.contains(tag)
                        val isAnswer = currentWord.partsOfSpeech.contains(tag)

                        val bgColor = when {
                            submitted && isAnswer && isSelected -> MaterialTheme.colorScheme.primary
                            submitted && !isAnswer && isSelected -> MaterialTheme.colorScheme.error
                            !submitted && isSelected -> MaterialTheme.colorScheme.primaryContainer
                            else -> MaterialTheme.colorScheme.surfaceVariant
                        }
                        val textColor = when {
                            submitted && isAnswer && isSelected -> MaterialTheme.colorScheme.onPrimary
                            submitted && !isAnswer && isSelected -> MaterialTheme.colorScheme.onError
                            !submitted && isSelected -> MaterialTheme.colorScheme.onPrimaryContainer
                            else -> MaterialTheme.colorScheme.onSurfaceVariant
                        }

                        Surface(
                            color = bgColor,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                                .then(
                                    if (!submitted) Modifier.toggleable(
                                        value = isSelected,
                                        onValueChange = {
                                            if (it) selectedTags.add(tag) else selectedTags.remove(tag)
                                            // 틀렸습니다 메시지 유지
                                        }
                                    ) else Modifier
                                )
                        ) {
                            Text(tag, modifier = Modifier.padding(12.dp), color = textColor)
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))
                    Box(modifier = Modifier.height(24.dp)) {
                        if (showWrongMessage) {
                            Text("틀렸습니다. 다시 선택해보세요!", color = MaterialTheme.colorScheme.error)
                        }
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(onClick = {
                        val correct = selectedTags.toSet() == currentWord.partsOfSpeech.toSet()
                        if (correct) {
                            quizState = QuizState.DEFINITION
                            submitted = false
                            selectedTags.clear()
                            definitionChoices = generateDefinitionChoicesFromEntry(currentWord)
                            showWrongMessage = false
                        } else {
                            showWrongMessage = true
                            selectedTags.clear()
                        }
                    }) {
                        Text("제출")
                    }
                }

                QuizState.DEFINITION -> {
                    Text("단어: ${currentWord!!.word}", style = MaterialTheme.typography.headlineSmall)
                    Spacer(modifier = Modifier.height(16.dp))

                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        definitionChoices.chunked(3).forEach { rowChoices ->
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                rowChoices.forEach { choice ->
                                    val i = definitionChoices.indexOf(choice)
                                    val isSelected = selectedDefinitionIndexes.contains(i)

                                    val bgColor = when {
                                        submitted && choice.isCorrect && isSelected -> MaterialTheme.colorScheme.primary
                                        submitted && !choice.isCorrect && isSelected -> MaterialTheme.colorScheme.error
                                        !submitted && isSelected -> MaterialTheme.colorScheme.primaryContainer
                                        else -> MaterialTheme.colorScheme.surfaceVariant
                                    }
                                    val textColor = when {
                                        submitted && choice.isCorrect && isSelected -> MaterialTheme.colorScheme.onPrimary
                                        submitted && !choice.isCorrect && isSelected -> MaterialTheme.colorScheme.onError
                                        !submitted && isSelected -> MaterialTheme.colorScheme.onPrimaryContainer
                                        else -> MaterialTheme.colorScheme.onSurfaceVariant
                                    }

                                    Button(
                                        onClick = {
                                            if (!submitted) {
                                                if (isSelected) selectedDefinitionIndexes.remove(i)
                                                else selectedDefinitionIndexes.add(i)
                                                // 틀렸습니다 메시지 유지
                                            }
                                        },
                                        modifier = Modifier
                                            .weight(1f)
                                            .height(72.dp),
                                        colors = ButtonDefaults.buttonColors(containerColor = bgColor)
                                    ) {
                                        Text(
                                            choice.text,
                                            color = textColor,
                                            fontSize = 14.sp,
                                            maxLines = 2,
                                            textAlign = TextAlign.Start
                                        )
                                    }
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))
                    Box(modifier = Modifier.height(24.dp)) {
                        if (showWrongMessage) {
                            Text("틀렸습니다. 다시 선택해보세요!", color = MaterialTheme.colorScheme.error)
                        }
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(onClick = {
                        val correctIndexes = definitionChoices.withIndex()
                            .filter { it.value.isCorrect }.map { it.index }.sorted()
                        val selectedSorted = selectedDefinitionIndexes.sorted()
                        if (correctIndexes == selectedSorted) {
                            if (currentIndex + 1 >= wordList.size) {
                                quizState = QuizState.FINISHED
                            } else {
                                currentIndex++
                                quizState = QuizState.PARTS_OF_SPEECH
                                submitted = false
                                selectedDefinitionIndexes.clear()
                                showWrongMessage = false
                            }
                        } else {
                            showWrongMessage = true
                            selectedDefinitionIndexes.clear()
                        }
                    }) {
                        Text("제출")
                    }
                }

                QuizState.FINISHED -> {
                    Text("🎉 모든 문제를 완료했습니다!", style = MaterialTheme.typography.headlineMedium)
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                        Button(onClick = {
                            navController.popBackStack()
                        }) {
                            Text("돌아가기")
                        }
                        Button(onClick = {
                            currentIndex = 0
                            quizState = QuizState.PARTS_OF_SPEECH
                            submitted = false
                            selectedTags.clear()
                            selectedDefinitionIndexes.clear()
                            showWrongMessage = false
                        }) {
                            Text("다시하기")
                        }
                    }
                }
            }
        }
    }
}