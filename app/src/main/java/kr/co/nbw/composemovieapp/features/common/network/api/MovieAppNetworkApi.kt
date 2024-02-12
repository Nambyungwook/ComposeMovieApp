package kr.co.nbw.composemovieapp.features.common.network.api

import com.google.gson.reflect.TypeToken
import kr.co.nbw.composemovieapp.features.common.network.model.MovieResponse
import kr.co.nbw.composemovieapp.library.network.model.ApiResult
import kr.co.nbw.composemovieapp.library.network.retrofit.NetworkRequestFactory
import javax.inject.Inject

class MovieAppNetworkApi @Inject constructor(
    private val networkRequestFactory: NetworkRequestFactory
) : IMovieAppNetworkApi {
    override suspend fun getMovies(): ApiResult<List<MovieResponse>> {
        return networkRequestFactory.create(
            url = "top250.json",
            type = object : TypeToken<List<MovieResponse>>() {}.type
        )
    }
}