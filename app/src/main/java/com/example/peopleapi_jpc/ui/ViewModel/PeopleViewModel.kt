package com.example.peopleapi_jpc.ui.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.peopleapi_jpc.domain.GetPeopleUseCase
import com.example.peopleapi_jpc.domain.items.PeopleItems
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PeopleViewModel @Inject constructor(
    private val getPeopleUseCase: GetPeopleUseCase): ViewModel(){
    private val _people = MutableLiveData<List<PeopleItems>>(listOf())
    val people: LiveData<List<PeopleItems>>get()  = _people
    init {
     getPeople()
    }
    private fun getPeople(){
        viewModelScope.launch {
            val people = getPeopleUseCase()
            _people.value = people
        }
    }
}