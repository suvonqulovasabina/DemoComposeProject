package com.example.democomposeproject.presintation.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.democomposeproject.ui.data.requase.GetCard
import com.example.democomposeproject.ui.data.requase.MyHistory


@Composable
fun CardItem(getCard: GetCard){



        Card(modifier = Modifier
            .width(180.dp)
            .height(120.dp)
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
                Box(
                    modifier = Modifier
                        .size(80.dp)
                        .padding(horizontal = 16.dp)
                ) {

                }

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