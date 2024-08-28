package com.example.democomposeproject.ui.presintation.home

import androidx.lifecycle.ViewModel
import com.example.democomposeproject.ui.domain.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repo: AppRepository
) : HomeContract.ViewModel, ViewModel() {
    override val container = container<HomeContract.UIState, HomeContract.SideEffect>(
        HomeContract.UIState(
            cardList = repo.getCard(),
            myHistory = repo.myHistory()
        )
    )

    override fun onEventDispatcher(intent: HomeContract.Intent) {

    }
}