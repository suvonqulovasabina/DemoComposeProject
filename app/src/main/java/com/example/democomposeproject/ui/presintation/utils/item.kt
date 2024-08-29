package com.example.democomposeproject.ui.presintation.utils

import android.annotation.SuppressLint
import android.graphics.Paint
import android.graphics.Rect
import android.webkit.WebSettings.TextSize
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Colors
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.democomposeproject.R
import com.example.democomposeproject.ui.data.local.GetCard
import com.example.democomposeproject.ui.data.local.MyHistory


@Composable
fun CardItem(getCard: GetCard){



        Card(modifier = Modifier
            .width(200.dp)

            .padding(horizontal = 4.dp)
            .clickable {

            }) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
            ) {
                Spacer(modifier = Modifier.size(10.dp))
                Text(modifier = Modifier.padding(horizontal = 16.dp), text = getCard.amount.toString(), fontSize = 20.sp)
                Spacer(modifier = Modifier.size(5.dp))

                Text(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    text = getCard.name,
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.size(15.dp))

                Image(
                    modifier = Modifier
                        .height(50.dp)
                        .width(80.dp)
                        .padding(horizontal = 16.dp),
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "My Image Description",

                )
                Spacer(modifier = Modifier.height(20.dp))

            }

        }


}





@SuppressLint("InvalidColorHexValue")
@Composable
fun HistoryItem(name:String,sum:String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 8.dp)

            .height(60.dp)
            .shadow(1.dp, shape = RoundedCornerShape(8.dp))
            .background(Color(0xFFFFFFFF))
            .padding(horizontal = 16.dp, vertical = 16.dp)

    ) {

        Spacer(modifier = Modifier.height(5.dp))
        Row(modifier = Modifier.fillMaxWidth()) {





            androidx.compose.material.Text(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(2f),
                text = name
            )


            androidx.compose.material.Text(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(1f), text = sum
            )

            Spacer(modifier = Modifier.height(15.dp))

        }

    }

}
@Composable

fun Card(){

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(190.dp)
            .padding(horizontal = 16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.White)
        ) {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.59f)
                ) {
                    Spacer(modifier = Modifier.height(10.dp))
                    Image(painter = painterResource(id = R.drawable.pay),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(60.dp)
                            .align(Alignment.CenterHorizontally)
                           )
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "addCard",
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.size(20.dp))


            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.02f)
                    .padding(horizontal = 16.dp)
                    .background(
                        Color(0xFFFFFFFF)
                    )
            ) {

            }
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
                    Spacer(modifier = Modifier.size(20.dp))
                    Image(
                        modifier = Modifier
                            .size(20.dp)
                            .align(Alignment.CenterHorizontally),
                        painter = painterResource(id = R.drawable.qr_code),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text = "scanner"
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.02f)
                        .padding(horizontal = 16.dp)
                        .background(
                            Color(0xFFFFFFFF)
                        )
                ) {

                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.01f)
                ) {
                    Spacer(modifier = Modifier.size(20.dp))
                    Image(
                        modifier = Modifier
                            .size(20.dp)
                            .align(Alignment.CenterHorizontally),
                        painter = painterResource(id = R.drawable.qr_code),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text = "Scanner"
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.02f)
                        .padding(horizontal = 16.dp)
                        .background(
                            Color(0xFFFFFFFF)
                        )
                ) {

                }
                Column(modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .clickable {

                    }) {
                    Spacer(modifier = Modifier.size(20.dp))
                    Icon(
                        modifier = Modifier
                            .size(20.dp)
                            .align(Alignment.CenterHorizontally)
                            ,
                        tint = Color(0xFF6BC3BB),
                        painter = painterResource(id = R.drawable.menu_back),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text = "Transfer"
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(0.05f)

                        .background(Color(0xFFFFFFFF))
                ) {
                    Spacer(modifier = Modifier.background(Color(0xFF211414)))
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
                    Spacer(modifier = Modifier.size(20.dp))
                    Icon(
                        modifier = Modifier
                            .size(25.dp)
                            .align(Alignment.CenterHorizontally)
                            ,
                        painter = painterResource(id = R.drawable.ic_tab_cards),
                        contentDescription = null,
                        tint = Color(0xFF4CAF50)

                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text ="Pay"
                    )
                }
            }

        }
    }
}






@Composable
fun CircleWithText() {

    Canvas(modifier = Modifier
        .width(55.dp)
        .height(55.dp)
        .padding(start = 16.dp)


    ) {
        val radius = size.minDimension / 2f
        val centerX = size.width / 2f
        val centerY = size.height / 2f

        drawContext.canvas.nativeCanvas.apply {
            val shadowRadius = 44.dp.toPx()
            val shadowPaint = Paint().apply {
                color = Color.Gray.toArgb()
                setShadowLayer(shadowRadius, 0f, 0f, color)
                style = Paint.Style.FILL
                isAntiAlias = true
            }

            drawCircle(
                centerX, centerY, radius, shadowPaint
            )

            drawCircle(centerX, centerY, radius, Paint().apply {
                color = Color.Red.toArgb()
                style = Paint.Style.FILL
                isAntiAlias = true
            })

            val textPaint = Paint().apply {
                color = Color.White.toArgb()
                style = Paint.Style.FILL
                isAntiAlias = true
                textAlign = Paint.Align.CENTER
                textSize = 48f
            }

            val text = "M"
            val textBounds = Rect()

            textPaint.getTextBounds(text, 0, text.length, textBounds)
            val textX = centerX - textBounds.exactCenterX() / 2f + 10
            val textY = centerY + textBounds.height() / 2f

            drawText(text, textX, textY, textPaint)
        }
    }
}


