package com.example.tarea01_profile

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PantallaJuego() {

    var c1 by remember { mutableStateOf(0) }
    var c2 by remember { mutableStateOf(0) }
    var c3 by remember { mutableStateOf(0) }
    var c4 by remember { mutableStateOf(0) }

    var c5 by remember { mutableStateOf(0) }
    var c6 by remember { mutableStateOf(0) }
    var c7 by remember { mutableStateOf(0) }
    var c8 by remember { mutableStateOf(0) }

    var c9 by remember { mutableStateOf(0) }
    var c10 by remember { mutableStateOf(0) }
    var c11 by remember { mutableStateOf(0) }
    var c12 by remember { mutableStateOf(0) }

    var c13 by remember { mutableStateOf(0) }
    var c14 by remember { mutableStateOf(0) }
    var c15 by remember { mutableStateOf(0) }
    var c16 by remember { mutableStateOf(0) }

    var gameOver by remember { mutableStateOf(false) }

    // ✅ Nombre del usuario (se mantiene mientras estés en Preview Interactive)
    var nombre by remember { mutableStateOf("") }

    val score = c1+c2+c3+c4+c5+c6+c7+c8+c9+c10+c11+c12+c13+c14+c15+c16
    val best = listOf(
        c1,c2,c3,c4,c5,c6,c7,c8,
        c9,c10,c11,c12,c13,c14,c15,c16
    ).maxOrNull() ?: 0

    if (gameOver) {
        PantallaGameOver(nombre)
        return
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF2EFEA))
            .padding(16.dp)
    ) {

        Text("Nombre:")

        Spacer(modifier = Modifier.height(6.dp))

        // ✅ TextField que SÍ funciona en Preview Interactive (BasicTextField)
        BasicTextField(
            value = nombre,
            onValueChange = { nombre = it },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .border(1.dp, Color(0xFFBCAFA0))
                .padding(12.dp),
            decorationBox = { innerTextField ->
                if (nombre.isBlank()) {
                    Text("Escribe tu nombre...", color = Color.Gray)
                }
                innerTextField()
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text("2048")

        Spacer(modifier = Modifier.height(10.dp))

        Text("Score: $score")
        Text("Best: $best")

        Spacer(modifier = Modifier.height(20.dp))

        Column(
            modifier = Modifier
                .background(Color(0xFFBCAFA0))
                .padding(8.dp)
        ) {

            Row {
                Cuadro(c1) { c1 = siguiente(c1); if (c1 > 2048) gameOver = true }
                Cuadro(c2) { c2 = siguiente(c2); if (c2 > 2048) gameOver = true }
                Cuadro(c3) { c3 = siguiente(c3); if (c3 > 2048) gameOver = true }
                Cuadro(c4) { c4 = siguiente(c4); if (c4 > 2048) gameOver = true }
            }

            Row {
                Cuadro(c5) { c5 = siguiente(c5); if (c5 > 2048) gameOver = true }
                Cuadro(c6) { c6 = siguiente(c6); if (c6 > 2048) gameOver = true }
                Cuadro(c7) { c7 = siguiente(c7); if (c7 > 2048) gameOver = true }
                Cuadro(c8) { c8 = siguiente(c8); if (c8 > 2048) gameOver = true }
            }

            Row {
                Cuadro(c9) { c9 = siguiente(c9); if (c9 > 2048) gameOver = true }
                Cuadro(c10) { c10 = siguiente(c10); if (c10 > 2048) gameOver = true }
                Cuadro(c11) { c11 = siguiente(c11); if (c11 > 2048) gameOver = true }
                Cuadro(c12) { c12 = siguiente(c12); if (c12 > 2048) gameOver = true }
            }

            Row {
                Cuadro(c13) { c13 = siguiente(c13); if (c13 > 2048) gameOver = true }
                Cuadro(c14) { c14 = siguiente(c14); if (c14 > 2048) gameOver = true }
                Cuadro(c15) { c15 = siguiente(c15); if (c15 > 2048) gameOver = true }
                Cuadro(c16) { c16 = siguiente(c16); if (c16 > 2048) gameOver = true }
            }
        }
    }
}

@Composable
fun Cuadro(valor: Int, accion: () -> Unit) {
    Box(
        modifier = Modifier
            .size(60.dp)
            .padding(4.dp)
            .background(color(valor))
            .clickable { accion() },
        contentAlignment = Alignment.Center
    ) {
        if (valor != 0) Text(valor.toString())
    }
}

fun siguiente(actual: Int): Int {
    if (actual == 0) return 2
    return actual * 2
}

fun color(numero: Int): Color {
    return when (numero) {
        0 -> Color(0xFFCDC1B4)
        2 -> Color(0xFFEEE4DA)
        4 -> Color(0xFFEDE0C8)
        8 -> Color(0xFFF2B179)
        16 -> Color(0xFFF59563)
        32 -> Color(0xFFF67C5F)
        64 -> Color(0xFFF65E3B)
        128 -> Color(0xFFEDCF72)
        256 -> Color(0xFFEDCC61)
        512 -> Color(0xFFEDC850)
        1024 -> Color(0xFFEDC53F)
        2048 -> Color(0xFFEDC22E)
        else -> Color.Black
    }
}

@Composable
fun PantallaGameOver(nombre: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF2EFEA))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val n = nombre.trim()
        Text(if (n.isNotEmpty()) "Game Over, $n" else "Game Over")
    }
}
