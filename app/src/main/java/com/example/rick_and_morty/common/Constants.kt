package com.example.rick_and_morty.common

object Constants {

    /**
    https://rickandmortyapi.com/api/character/?page=1
    the retrofit builder will need a base url so we extract that
    from our link and create the base url variable of type string

     */

    const val BASE_URL = "https://rickandmortyapi.com/api/"
    const val LAST_PAGE_NUMBER = 42
}