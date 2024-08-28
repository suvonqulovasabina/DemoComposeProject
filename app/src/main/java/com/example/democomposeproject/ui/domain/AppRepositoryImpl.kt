package com.example.democomposeproject.ui.domain

import com.example.democomposeproject.ui.data.requase.GetCard
import com.example.democomposeproject.ui.data.requase.MyHistory

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