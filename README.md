# Quiz App - Jetpack Compose

![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)

Um aplicativo de Quiz moderno e interativo desenvolvido para demonstrar o poder do **Jetpack Compose** e do **Material Design 3** no ecossistema Android.

## Screenshots

<img width="720" height="1280" alt="Screenshot_20260515_154414" src="https://github.com/user-attachments/assets/1ae71605-7280-4a58-924c-0561242b20e1" />
<img width="720" height="1280" alt="Screenshot_20260515_154402" src="https://github.com/user-attachments/assets/ad1ad46d-f0bd-4e83-b6f4-89be0d126a78" />
<img width="720" height="1280" alt="Screenshot_20260515_154312" src="https://github.com/user-attachments/assets/b09a1883-0ebe-40cc-9e7f-de14880aaf2d" />


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
