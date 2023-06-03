package com.example.rick_and_morty

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.rick_and_morty.common.ScreenState
import com.example.rick_and_morty.data.Repository
import com.example.rick_and_morty.data.network.ApiClient
import com.example.rick_and_morty.data.model.Character

class DetailsViewModel (private val repository: Repository
                            = Repository(ApiClient.apiService) ) : ViewModel() {

    private var _characterDetailsLiveData = MutableLiveData<ScreenState<Character>>()
    val characterDetailsLiveData: LiveData<ScreenState<Character>>
    get() = _characterDetailsLiveData

//    private fun fetchCharacterDetails(id : Int){
//        val client = repository.getCharacterDetails(id);
//        _characterDetailsLiveData.postValue(ScreenState.Loading(null))
//        client.enqueue(object: Callback)
//    }

}