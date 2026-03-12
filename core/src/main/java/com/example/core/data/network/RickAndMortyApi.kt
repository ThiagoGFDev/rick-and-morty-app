package com.example.core.data.network

import com.example.core.data.network.response.CharacterResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface RickAndMortyApi {

    @GET("character")
    suspend fun getCharacters(
        @QueryMap
        queries: Map<String, String>
    ): CharacterResponse
}