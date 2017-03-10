package com.melorriaga.kokemon.data

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import rx.Observable

interface PokemonService {

    @GET("pokemon")
    fun getPokemonNames(@Query("limit") limit: Int): Observable<APIResourceList>

    @GET("pokemon/{id}")
    fun getPokemonDetails(@Path("id") id: Int): Observable<Pokemon>

}
