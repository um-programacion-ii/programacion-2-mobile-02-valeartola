package com.valeartola.programacion2

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Clase-1-Kotlin",
    ) {
        App()
    }
}