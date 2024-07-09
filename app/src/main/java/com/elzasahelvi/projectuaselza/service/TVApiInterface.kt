package com.elzasahelvi.projectuaselza.service

import com.elzasahelvi.projectuaselza.model.TelevisionResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=a8813f2da5ba9fe9a7c06695ae7f4993")
    fun getTVList(): Call<TelevisionResponse>

}