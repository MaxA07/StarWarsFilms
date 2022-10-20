package com.example.starwarsfilms.api

import com.example.starwarsfilms.model.Films
import retrofit2.Response
import retrofit2.http.GET

interface StarWarsAPI {

    @GET("api/films/")
    suspend fun getFilmsList(): Response<Films>
}