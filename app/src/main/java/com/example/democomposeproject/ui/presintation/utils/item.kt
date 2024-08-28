package com.example.democomposeproject.ui.presintation.utils

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.democomposeproject.R
import com.example.democomposeproject.ui.data.local.GetCard
import com.example.democomposeproject.ui.data.local.MyHistory


@Composable
fun CardItem(getCard: GetCard){



        Card(modifier = Modifier
            .width(180.dp)

            .padding(horizontal = 4.dp)
            .clickable {

            }) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
            ) {
                Spacer(modifier = Modifier.size(10.dp))
                Text(modifier = Modifier.padding(horizontal = 16.dp), text = getCard.amount.toString())
                Spacer(modifier = Modifier.size(5.dp))

                Text(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    text = getCard.name,
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.size(15.dp))
                Image(
                    painter = painterResource(id = R.drawable.img_2),
                    contentDescription = "My Image Description",
                    modifier = Modifier.fillMaxWidth(),

                )

            }

        }


}

@Composable

fun getMyHistory(myHistory: MyHistory){

    Column(modifier = Modifier
        .fillMaxSize()
        .height(50.dp)) {
        Text(text = myHistory.name)
        
        Text(text = myHistory.amount.toString())
    }

}



@SuppressLint("InvalidColorHexValue")
@Composable
fun HistoryItem(name:String,sum:String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFFFFFF))
            .height(60.dp)
            .shadow(1.dp, shape = RoundedCornerShape(16.dp))
            .padding(horizontal = 16.dp, vertical = 16.dp)

    ) {

        Spacer(modifier = Modifier.height(5.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                modifier = Modifier

                    .padding(horizontal = 16.dp)
                    .size(50.dp)
                    .align(Alignment.CenterVertically)
                    .shadow(1.dp, shape = RoundedCornerShape(100.dp)),
                painter =
                painterResource(id = R.drawable.img_1),
                contentDescription = null
            )




            androidx.compose.material.Text(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(2f),
                text = name
            )


            androidx.compose.material.Text(modifier = Modifier
                .align(Alignment.CenterVertically)
                .weight(1f), text = sum)
            
            Spacer(modifier = Modifier.height(15.dp))

        }

    }
}
