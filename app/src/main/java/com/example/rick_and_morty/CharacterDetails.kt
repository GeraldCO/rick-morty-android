package com.example.rick_and_morty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tutorials.R
import com.example.tutorials.databinding.ActivityCharacterDetailsBinding
import com.example.tutorials.databinding.ActivityMainBinding

class CharacterDetails : AppCompatActivity() {
    private lateinit var binding: ActivityCharacterDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCharacterDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_details)
    }
}