package com.melorriaga.kokemon.data

data class Pokemon(
        val id: Int,
        val name: String,
        val height: Int,
        val weight: Int,
        val sprites: PokemonSprites,
        val baseExperience: Int
)
