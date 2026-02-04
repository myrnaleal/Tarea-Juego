package com.example.tarea01_profile.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarea01_profile.R

@Preview(showBackground = true)
@Composable
fun Juego() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(FullGameBackground)
    ) {

        Column {

            // ───────── TOP BAR ─────────
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Image(
                    painter = painterResource(R.drawable.menu_icon),
                    contentDescription = "Menu"
                )

                Text(
                    text = "2048",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )

                Image(
                    painter = painterResource(R.drawable.retry),
                    contentDescription = "Retry"
                )
            }

            // ───────── SCORE ─────────
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {

                ScoreBox("SCORE", "1692", ScoreBackground)

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(17.dp))
                        .border(4.dp, BestBorder, RoundedCornerShape(17.dp))
                        .width(180.dp)
                        .fillMaxHeight()
                ) {
                    ScoreText("BEST", "7000")
                }
            }
        }

        // ───────── GAME GRID ─────────
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(35.dp),
            contentAlignment = Alignment.Center
        ) {

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xFF9C8A7A))
                    .width(400.dp)
                    .height(300.dp)
            ) {
                Row {
                    GameColumn(listOf(4, 0, 0, 0))
                    GameColumn(listOf(32, 16, 2, 0))
                    GameColumn(listOf(8, 64, 128, 8))
                    GameColumn(listOf(32, 4, 64, 0))
                }
            }
        }

        // ───────── BOTTOM IMAGE ─────────
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.random_icons),
                contentDescription = "Icons",
                modifier = Modifier.size(200.dp)
            )
        }
    }
}

// ───────── COMPONENTES ─────────

@Composable
fun ScoreBox(title: String, value: String, bgColor: Color) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(17.dp))
            .background(bgColor)
            .width(180.dp)
            .fillMaxHeight()
    ) {
        ScoreText(title, value)
    }
}

@Composable
fun ScoreText(title: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = value,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun GameColumn(values: List<Int>) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.padding(5.dp)
    ) {
        values.forEach { GameTile(it) }
    }
}

@Composable
fun GameTile(value: Int) {

    val color = when (value) {
        2 -> Color2
        4 -> Color4
        8 -> Color8
        16 -> Color16
        32 -> Color32
        64 -> Color64
        128 -> Color128
        else -> Color(0xFFBBAD9B)
    }

    Box(
        modifier = Modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color)
            .size(NumberSize),
        contentAlignment = Alignment.Center
    ) {
        if (value != 0) {
            Text(
                text = value.toString(),
                fontSize = if (value >= 128) 20.sp else 35.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
