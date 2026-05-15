package br.com.marcus.quiz

data class Question (
     val text: String,
     val options: List<String>,
     val indexCorrectAnswer: Int
)

val questions = listOf(
    Question (
        text = "Qual é a linguagem oficial Android?",
        options = listOf("Python","Java","Kotlin"),
        indexCorrectAnswer = 2
    ),
    Question (
        text = "Qual componente usamos para criar interfaces no Jetpack Compose? ",
        options = listOf("Activity","View","Composable","Fragment"),
        indexCorrectAnswer = 2
    ),
    Question (
        text = "O que é Jetpack Compose ?",
        options = listOf("Biblioteca de dados","Ferramentas de Layout Moderna","IDE"),
        indexCorrectAnswer = 1
    ),
    Question (
        text = "Quem desenvolve o Android?",
        options = listOf("Google","Apple","Microsoft"),
        indexCorrectAnswer = 0
    )
).shuffled()