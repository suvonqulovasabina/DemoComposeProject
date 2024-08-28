package com.example.democomposeproject.domain

import com.example.democomposeproject.data.requase.GetCard
import com.example.democomposeproject.data.requase.MyHistory

import kotlinx.coroutines.flow.Flow

interface AppRepository {




    fun getCard(): ArrayList<GetCard>


    fun myHistory(): ArrayList<MyHistory>
}