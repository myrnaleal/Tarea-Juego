package com.example.tarea01_profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Avatar() {
    Image(
        painter = painterResource(id = R.drawable.avatar),
        contentDescription = "Avatar",
        modifier = Modifier
            .size(120.dp)
            .clip(CircleShape)
    )
}

@Composable
fun SimpleButton(texto: String) {
    Box(
        modifier = Modifier
            .background(Color(0xFF1877F2))
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(text = texto, color = Color.White)
    }
}

@Composable
fun CastanScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1C1C1C))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        Avatar()

        Text(
            text = "Multiservicios Castan:\nSoluciones para tu hogar en Tampico",
            color = Color.White
        )

        Text(
            text = "128 seguidores • 1 seguidos",
            color = Color.Gray
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            SimpleButton("Mensaje")
            SimpleButton("Seguir")
            SimpleButton("Buscar")
        }

        Text(
            text = "En Multiservicios Castan ofrecemos todo tipo de servicios para el mantenimiento y reparación del hogar en Tampico, Tamaulipas. Desde aire acondicionado, pintura, plomería y electricidad.",
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCastanScreen() {
    CastanScreen()
}
