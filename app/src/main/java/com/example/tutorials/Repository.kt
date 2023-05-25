package com.example.tutorials

import com.example.tutorials.network.ApiService

class Repository (private val apiService: ApiService) {
    fun getCharacters(page:String) = apiService.fetchCharacters(page)

}