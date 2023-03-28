package com.example.peopleapi_jpc.domain

import com.example.peopleapi_jpc.data.remote.models.Data
import com.example.peopleapi_jpc.domain.items.PeopleItems
import com.example.peopleapi_jpc.repo.PeopleRepository
import javax.inject.Inject

class GetPeopleUseCase @Inject constructor(val peopleRepository: PeopleRepository){
    suspend operator fun invoke(): List<PeopleItems>{
        return peopleRepository.getPeople().shuffled()
    }
}