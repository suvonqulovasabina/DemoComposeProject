package com.example.democomposeproject.presintation.home

import androidx.lifecycle.ViewModel
import com.example.democomposeproject.domain.AppRepositoryImpl
import org.orbitmvi.orbit.viewmodel.container


class HomeViewModel : HomeContract.ViewModel, ViewModel() {
    private var repository = AppRepositoryImpl()
    override fun onEventDispatcher(intent: HomeContract.Intent) {


    }




    override val container = container<HomeContract.UiState.UIState, HomeContract.SideEffect>(
        HomeContract.UiState.UIState(
            cardList = repository.getCard(),
            myHistory = repository.myHistory()
        )
    )


}