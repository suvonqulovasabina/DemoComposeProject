package com.example.democomposeproject.ui.domain

import com.example.democomposeproject.ui.data.local.GetCard
import com.example.democomposeproject.ui.data.local.MyHistory

interface AppRepository {


    fun getCard(): ArrayList<GetCard>


    fun myHistory(): ArrayList<MyHistory>
}