package com.example.democomposeproject.domain

import com.example.democomposeproject.data.requase.GetCard
import com.example.democomposeproject.data.requase.MyHistory
import com.example.democomposeproject.domain.AppRepository

import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow

import javax.inject.Inject

class AppRepositoryImpl  : AppRepository {
    private var cardList = ArrayList<GetCard>()

    private var myHistory = ArrayList<MyHistory>()


    override fun getCard(): ArrayList<GetCard> {
        cardList.add(GetCard(name = "Humo", amount = 12000))
        cardList.add(GetCard(name = "Jamila", amount = 12000))
        cardList.add(GetCard(name = "Jasur", amount = 12000))
        cardList.add(GetCard(name = "Javlon", amount = 12000))
        cardList.add(GetCard(name = "Javohir", amount = 12000))
        return cardList
    }

    override fun myHistory(): ArrayList<MyHistory> {
        myHistory.add(MyHistory(name = "Sabina", amount = 12354))
        myHistory.add(MyHistory(name = "Sabina", amount = 12354))
        myHistory.add(MyHistory(name = "Sabina", amount = 12354))
        myHistory.add(MyHistory(name = "Sabina", amount = 12354))
        myHistory.add(MyHistory(name = "Sabina", amount = 12354))
        myHistory.add(MyHistory(name = "Sabina", amount = 12354))
        myHistory.add(MyHistory(name = "Sabina", amount = 12354))
        myHistory.add(MyHistory(name = "Sabina", amount = 12354))
        myHistory.add(MyHistory(name = "Sabina", amount = 12354))
        myHistory.add(MyHistory(name = "Sabina", amount = 12354))
        myHistory.add(MyHistory(name = "Sabina", amount = 12354))
        myHistory.add(MyHistory(name = "Sabina", amount = 12354))
        myHistory.add(MyHistory(name = "Sabina", amount = 12354))
        myHistory.add(MyHistory(name = "Sabina", amount = 12354))
        myHistory.add(MyHistory(name = "Sabina", amount = 12354))
        return myHistory
    }

}