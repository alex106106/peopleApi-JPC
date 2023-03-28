package com.example.peopleapi_jpc.data.remote

import com.example.peopleapi_jpc.data.remote.models.Data
import com.example.peopleapi_jpc.data.remote.models.PeopleModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class PeopleService @Inject constructor(private val peopleApi: PeopleApi) {
    suspend fun getPeople(): List<Data> {
        return withContext(Dispatchers.IO) {
            val games = peopleApi.getPeople()
            games.body()?.data ?: emptyList()
        }
    }
}