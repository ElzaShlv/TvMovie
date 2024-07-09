package com.elzasahelvi.projectuaselza.service

import com.elzasahelvi.projectuaselza.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=a8813f2da5ba9fe9a7c06695ae7f4993")
    fun getMovieList(): Call<MovieResponse>

}