package com.example.tutorials.network

import com.squareup.moshi.Json

data class Character (
    @Json(name = "id")
    val id : String,
    @Json(name = "name")
    val name : String,
    @Json(name="image")
    val image: String,
    @Json(name = "status")
    val status: String,
    @Json(name= "gender")
    val gender: String,
    @Json (name = "created")
    val created: String
)

data class CharacterResponse(@Json(name="results")
val result: List<Character>)