package com.alonsodelcid.pokemvvm.model.api

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PokeApiResponse (
    @Expose @SerializedName("count") val count: Int,
    @Expose @SerializedName("next") val next: String,
    @Expose @SerializedName("previous") val previous: String,
    @Expose @SerializedName("results") val results: List<PokeResult>
)

data class PokeResult (
    @Expose @SerializedName("name") val name: String,
    @Expose @SerializedName("url") val url: String
)