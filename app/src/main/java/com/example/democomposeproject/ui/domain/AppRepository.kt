package com.example.democomposeproject.ui.domain

import com.example.democomposeproject.ui.data.requase.GetCard
import com.example.democomposeproject.ui.data.requase.MyHistory

interface AppRepository {




    fun getCard(): ArrayList<GetCard>


    fun myHistory(): ArrayList<MyHistory>
}