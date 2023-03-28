package com.example.peopleapi_jpc.domain.items

import com.example.peopleapi_jpc.data.remote.models.Data
import com.example.peopleapi_jpc.data.remote.models.PeopleModel
import com.example.peopleapi_jpc.data.remote.models.Support

data class PeopleItems (
    val avatar: String,
    val email: String,
    val first_name: String,
    val id: Int,
    val last_name: String
        )
fun Data.toPeopleItems() = PeopleItems(avatar, email, first_name, id, last_name)