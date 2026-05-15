package br.com.marcus.quiz

import android.R
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.marcus.quiz.ui.theme.QuizTheme

@Composable
fun Quiz() {
    var answered by remember { mutableStateOf(false) }
    var showResult by remember { mutableStateOf(false) }
    var score by remember { mutableStateOf(0) }
    var selectedOption by remember { mutableStateOf(-1) }
    var currentQuestion by remember { mutableStateOf(0) }
    val question = questions[currentQuestion]
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 24.dp)
    ) {
        Text(
            text = "Pergunta ${currentQuestion + 1} de ${questions.size} ",
            style = MaterialTheme.typography.titleSmall
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = question.text,
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.height(24.dp))
        question.options.forEachIndexed { index: Int, option: String ->
            val borderColor = when {
                !answered -> Color.LightGray
                index == question.indexCorrectAnswer -> Color.Green
                index == selectedOption -> Color.Red
                else -> Color.LightGray
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable(enabled = answered.not()) {
                        answered = true
                        selectedOption = index
                        if (index == question.indexCorrectAnswer) {score++}

                    }
                    .border(
                        width = 2.dp,
                        color = borderColor,
                        shape = RoundedCornerShape(16.dp)
                    ),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp  )
            ) {
                Text(
                    text = option,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.titleLarge
                )
            }
        }
        Spacer(modifier = Modifier.height(24.dp))
        if (answered) {
            if (currentQuestion < questions.size -1) {
                Button(
                    onClick = {
                        currentQuestion++
                        answered = false
                        selectedOption = -1
                    }
                ) {
                    Text(
                        text = "Próxima pergunta"
                    )
                }
            } else {
                Button(onClick = {
                    showResult = true
                }) {
                    Text("Ver resultado")
                }
            }
        }
        Spacer(modifier = Modifier.height(24.dp))
        if (showResult) {
            Text(
                text = "Acertou: $score de ${questions.size} perguntas",
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun QuizPreview() {
    QuizTheme() {
        Quiz()
    }
}