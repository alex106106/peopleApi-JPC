package com.example.peopleapi_jpc.repo

import androidx.core.app.NotificationCompat.getPeople
import com.example.peopleapi_jpc.data.remote.PeopleService
import com.example.peopleapi_jpc.data.remote.models.Data
import com.example.peopleapi_jpc.domain.items.PeopleItems
import com.example.peopleapi_jpc.domain.items.toPeopleItems
import javax.inject.Inject

class PeopleRepository @Inject constructor(private val peopleService: PeopleService){
    suspend fun getPeople(): List<PeopleItems>{
        return peopleService.getPeople().map {
            it.toPeopleItems()
        }
    }
}