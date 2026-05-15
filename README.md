# Quiz App - Jetpack Compose

![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)

Um aplicativo de Quiz moderno e interativo desenvolvido para demonstrar o poder do **Jetpack Compose** e do **Material Design 3** no ecossistema Android.

## Screenshots

<div align="center">
  <img src="https://github.com/user-attachments/assets/9991217e-61d0-40e8-8b54-998826723f5b" width="30%" alt="Pergunta Inicial" />
  <img src="https://github.com/user-attachments/assets/1a687311-9a70-4927-a906-896899736868" width="30%" alt="Feedback de Resposta" />
  <img src="https://github.com/user-attachments/assets/3b320d32-94b1-4191-8818-f604b12c62c9" width="30%" alt="Resultado Final" />
</div>

## Sobre o Projeto

Este projeto é um jogo de perguntas e respostas focado em conhecimentos de desenvolvimento Android. Ele utiliza uma interface reativa e declarativa, proporcionando uma experiência de usuário fluida e intuitiva.

### Principais Funcionalidades

-   **Perguntas Dinâmicas:** Sistema de questões embaralhadas a cada nova execução.
-   **Feedback em Tempo Real:** Indicação visual imediata de respostas corretas (verde) e incorretas (vermelho).
-   **Sistema de Pontuação:** Cálculo e exibição do resultado final ao término do quiz.
-   **Interface Moderna:** Construído inteiramente com Material 3, utilizando componentes como `Card`, `Button` e tipografia avançada.
-   **Gerenciamento de Estado:** Uso eficiente de `remember` e `mutableStateOf` para controle de fluxo da UI.

## Tecnologias Utilizadas

-   **Linguagem:** [Kotlin](https://kotlinlang.org/)
-   **Toolkit de UI:** [Jetpack Compose](https://developer.android.com/jetpack/compose)
-   **Design System:** [Material Design 3](https://m3.material.io/)
-   **Gerenciamento de Dependências:** Gradle (Kotlin DSL/Groovy)

## Como executar o projeto

### Opção 1: Compilando o código
1.  Certifique-se de ter o **Android Studio** (versão Ladybug ou superior recomendada) instalado.
2.  Clone este repositório:
    ```bash
    git clone https://github.com/seu-usuario/quiz-kotlin.git
    ```
3.  Abra o projeto no Android Studio.
4.  Aguarde a sincronização do Gradle.
5.  Execute o aplicativo em um emulador ou dispositivo físico.

### Opção 2: Instalando o APK
Você também pode baixar o arquivo **APK** diretamente para o seu dispositivo Android e testar o Quiz.

## Estrutura de Pastas Principal

-   `br.com.marcus.quiz.Question.kt`: Modelo de dados e repositório de perguntas.
-   `br.com.marcus.quiz.Quiz.kt`: Composable principal contendo a lógica e UI do jogo.
-   `br.com.marcus.quiz.MainActivity.kt`: Ponto de entrada do aplicativo.
-   `ui.theme`: Definições de cores, tipografia e temas do Material 3.

---
