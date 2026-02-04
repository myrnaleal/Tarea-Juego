package com.example.moviles.ui.theme

import com.example.moviles.R
import android.ranging.raw.RawRangingDevice
import androidx.compose.foundation.Image
import androidx.compose.foundation.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable

fun Juego() {
    Box(modifier = Modifier.fillMaxSize().background(FullGameBackground)) {

        Column() {
            Box(modifier = Modifier.height(70.dp).fillMaxWidth()) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.menu_icon),
                        contentDescription = "My image"
                    )

                    Text(
                        text = "2048",
                        fontSize = 28.sp)

                    Image(
                        painter = painterResource(id = R.drawable.retry),
                        contentDescription = "My image"
                    )

                }
            }

            Box(modifier = Modifier.height(70.dp).fillMaxWidth()) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(17.dp))
                            .background(ScoreBackground)
                            .fillMaxHeight()
                            .width(180.dp),

                        ) {
                        Text(text = "SCORE",
                            modifier = Modifier.align(Alignment.CenterStart).padding(8.dp),
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold)

                        Text(text = "1692",
                            modifier = Modifier.align(Alignment.CenterEnd).padding(8.dp),
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold)
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(17.dp))
                            .border(
                                width = 4.dp,
                                color = BestBorder,
                                shape = RoundedCornerShape(17.dp)
                            )
                            .fillMaxHeight()
                            .width(180.dp),

                        ) {
                        Text(text = "BEST",
                            modifier = Modifier.align(Alignment.CenterStart).padding(8.dp),
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold)

                        Text(text = "7000",
                            modifier = Modifier.align(Alignment.CenterEnd).padding(8.dp),
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
        Box(
            modifier = Modifier.fillMaxSize().padding(35.dp),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(color = 0xFF9C8A7A))
                    .width(400.dp)
                    .height(300.dp),
                contentAlignment = Alignment.TopStart,
            ) {
                Row() {
                    Column(
                        verticalArrangement = Arrangement.Bottom,
                        modifier = Modifier.padding(5.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color(color = 0xFFBBAD9B))
                                .size(NumberSize)

                        ) {
                            Text(
                                text = "4",
                                fontSize = 35.sp,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color(color = 0xFFBBAD9B))
                                .size(NumberSize)

                        ) {

                        }

                        Box(
                            modifier = Modifier
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color(color = 0xFFBBAD9B))
                                .size(NumberSize)

                        ) {

                        }

                        Box(
                            modifier = Modifier
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color(color = 0xFFBBAD9B))
                                .size(NumberSize)

                        ) {

                        }
                    }

                    Column(
                        verticalArrangement = Arrangement.Bottom,
                        modifier = Modifier.padding(5.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color(color = 0xFFF77E61))
                                .size(NumberSize)

                        ) {
                            Text(
                                text = "32",
                                fontSize = 35.sp,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color16)
                                .size(NumberSize)

                        ) {
                            Text(
                                text = "16",
                                fontSize = 35.sp,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color2)
                                .size(NumberSize)

                        ) {
                            Text(
                                text = "2",
                                fontSize = 35.sp,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color(color = 0xFFBBAD9B))
                                .size(NumberSize)

                        ) {

                        }
                    }

                    Column(
                        verticalArrangement = Arrangement.Bottom,
                        modifier = Modifier.padding(5.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color8)
                                .size(NumberSize)

                        ) {
                            Text(
                                text = "8",
                                fontSize = 35.sp,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color64)
                                .size(NumberSize)

                        ) {
                            Text(
                                text = "64",
                                fontSize = 35.sp,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color128)
                                .size(NumberSize)

                        ) {
                            Text(
                                text = "128",
                                fontSize = 20.sp,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color8)
                                .size(NumberSize)

                        ) {
                            Text(
                                text = "8",
                                fontSize = 35.sp,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }
                    }

                    Column(
                        verticalArrangement = Arrangement.Bottom,
                        modifier = Modifier.padding(5.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color32)
                                .size(NumberSize)

                        ) {
                            Text(
                                text = "32",
                                fontSize = 35.sp,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color4)
                                .size(NumberSize)

                        ) {
                            Text(
                                text = "4",
                                fontSize = 35.sp,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color4)
                                .size(NumberSize)

                        ) {
                            Text(
                                text = "64",
                                fontSize = 35.sp,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color(color = 0xFFBBAD9B))
                                .size(NumberSize)

                        ) {
                        }
                    }


                }
            }
        }
        Box(modifier = Modifier
            .align(Alignment.BottomCenter)
            .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.random_icons),
                contentDescription = "My image",
                modifier = Modifier.size(200.dp)

            )
        }

    }
}

