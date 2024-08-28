package com.example.democomposeproject.ui.presintation.home

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.hilt.getViewModel
import com.example.democomposeproject.R
import com.example.democomposeproject.ui.presintation.utils.CardItem
import com.example.democomposeproject.ui.presintation.utils.HistoryItem
import org.orbitmvi.orbit.compose.collectAsState


class HomeScreen : Screen {
    @Composable
    override fun Content() {
        val viewModel = getViewModel<HomeViewModel>()
        val uiState = viewModel.collectAsState().value
        Log.d("size", uiState.cardList.size.toString())
        HomeScreenUI(uiState = uiState)
    }


}

@Composable
fun HomeScreenUI(
    uiState: HomeContract.UIState
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF988686))
    ) {


        item {

            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "My Image Description",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
        }

        item {
            Spacer(modifier = Modifier.height(15.dp))
        }

        item {
            LazyRow(modifier = Modifier.fillMaxWidth()) {
                items(uiState.cardList) { card ->
                    CardItem(getCard = card)
                }
            }
        }
        item {
            Spacer(modifier = Modifier.height(50.dp))
        }


        items(uiState.myHistory) { historyItem ->
            HistoryItem(name = historyItem.name, sum = historyItem.amount.toString())
        }
    }
}

/*
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFCDDC39))
            .verticalScroll(scrollState)
    ) {
        // LazyRow for cardList
        LazyRow(
            modifier = Modifier.fillMaxWidth()
        ) {
            items(uiState.cardList) { card ->
                CardItem(getCard = card)
            }
        }

        // Spacer to separate LazyRow from LazyColumn
        Spacer(modifier = Modifier.height(16.dp))

        // LazyColumn for myHistory
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(uiState.myHistory) { historyItem ->
                getMyHistory(myHistory = historyItem)
            }
        }
    }*/

//    LazyColumn(modifier = Modifier
//        .fillMaxSize()
//        .background(Color(0xFF974343))) {
//        item {
//            LazyRow(modifier = Modifier.fillMaxWidth()) {
//                items(uiState.cardList) { card ->
//                    CardItem(getCard = card)
//                }
//            }
//        }
//        item {
//            LazyColumn {
//                items(uiState.myHistory){
//                    getMyHistory(myHistory = it)
//                }
//            }
//        }
//    }
