package com.example.rick_and_morty.data

import com.example.rick_and_morty.data.network.ApiService

class Repository (private val apiService: ApiService) {
    fun getCharacters(page:String) = apiService.fetchCharacters(page)

    fun getCharacterDetails(id:Int) = apiService.fetchCharacterDetails(id)
}

