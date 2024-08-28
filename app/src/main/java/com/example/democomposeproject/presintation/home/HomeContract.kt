package com.example.democomposeproject.presintation.home

import com.example.democomposeproject.data.requase.GetCard
import com.example.democomposeproject.data.requase.MyHistory
import org.orbitmvi.orbit.ContainerHost

interface HomeContract {

    interface ViewModel : ContainerHost<UiState.UIState,SideEffect>{
        fun onEventDispatcher(intent: Intent)
    }

    interface SideEffect {
        object Massage:UiState
    }

    interface UiState {
        data class UIState(val cardList: ArrayList<GetCard>, val myHistory: ArrayList<MyHistory>)

    }

    interface Intent {

    }

}
