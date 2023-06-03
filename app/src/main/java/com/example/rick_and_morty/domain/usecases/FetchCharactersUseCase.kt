package com.example.rick_and_morty.domain.usecases

import com.example.rick_and_morty.common.ScreenState

interface FetchCharactersUseCase {
    suspend fun execute(): ScreenState<List<Character>?>
}