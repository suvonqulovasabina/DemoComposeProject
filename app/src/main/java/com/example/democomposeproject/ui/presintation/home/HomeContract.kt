package com.example.democomposeproject.ui.presintation.home

import com.example.democomposeproject.ui.data.requase.GetCard
import com.example.democomposeproject.ui.data.requase.MyHistory
import org.orbitmvi.orbit.ContainerHost

interface HomeContract {

    interface ViewModel : ContainerHost<UIState, SideEffect> {
        fun onEventDispatcher(intent: Intent)
    }

    interface SideEffect {
        object Massage : SideEffect
    }


    data class UIState(val cardList: ArrayList<GetCard>, val myHistory: ArrayList<MyHistory>)

    interface Intent {

    }

}
