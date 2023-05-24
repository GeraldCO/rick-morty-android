package com.example.tutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.tutorials.network.CharacterResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

class character_details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_details)

        val characterNameTW = findViewById<TextView>(R.id.characterNameTV)
        val name = intent.getStringExtra("id")
        characterNameTW.text = name;
    }
}

interface ApiService{

    @GET("character")
    fun fetchFullCharacterDetails(@Query("page") page:String): Call<CharacterResponse>
}