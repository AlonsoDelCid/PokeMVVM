package com.alonsodelcid.pokemvvm.service

import com.alonsodelcid.pokemvvm.model.api.PokeApiResponse
import com.alonsodelcid.pokemvvm.model.api.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApiService {
    @GET("pokemon/{id}")
    fun getPokemonInfo(@Path("id") id: Int): Call<Pokemon>
    @GET("pokemon")
    fun getPokemonList(@Query("limit") limit: Int, @Query("offset") offset: Int): Call<PokeApiResponse>
}