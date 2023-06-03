package com.example.rick_and_morty.data.model

import com.squareup.moshi.Json

data class Character (
    @Json(name= "id")
    val id : String,
    @Json(name = "name")
    val name : String,
    @Json(name= "status")
    val status: String,
    @Json(name="gender")
    val gender: String,
    @Json(name="image")
    val image: String
)

data class CharacterResponse(@Json(name="results")
val result: List<Character>)

data class CharacterDetailsResponse(@Json(name="results")
val result: Character
)