package com.example.democomposeproject.presintation.home

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.hilt.getViewModel
import com.example.democomposeproject.presintation.utils.CardItem
import com.example.democomposeproject.presintation.utils.getMyHistory
import org.orbitmvi.orbit.compose.collectAsState
import kotlin.math.log


class HomeScreen : Screen {
    @Composable
    override fun Content() {
        val viewModel = getViewModel<HomeViewModel>()
        val uiState = viewModel.container.stateFlow.collectAsState().value
        Log.d("nn",uiState.cardList.size.toString())
        HomeScreenUI(uiState = uiState)
    }


}

@Composable

fun HomeScreenUI(
    uiState: HomeContract.UiState.UIState
) {
Log.d("nn",uiState.cardList.size.toString())
Log.d("nn",uiState.myHistory.size.toString())
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            item {
                LazyRow() {

                    items(uiState.cardList){
                        CardItem(getCard = it)
                    }
                }
                LazyColumn {
                    items(uiState.myHistory){
                        getMyHistory(myHistory = it)
                    }
                }
            }
        }
    }
