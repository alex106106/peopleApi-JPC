package com.example.peopleapi_jpc.data.remote

import com.example.peopleapi_jpc.data.remote.models.Data
import com.example.peopleapi_jpc.data.remote.models.PeopleModel
import com.example.peopleapi_jpc.util.Constant.Companion.BASE_URL
import com.example.peopleapi_jpc.util.Constant.Companion.PEOPLE_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PeopleApi {
    @GET(PEOPLE_ENDPOINT)
    suspend fun getPeople(): Response<ApiResponse>
}
data class ApiResponse(
    val data: List<Data>
)

