package com.br.rickmorty.model

data class CharacterResponse(
    val info: Info,
    val results: List<Result>
)