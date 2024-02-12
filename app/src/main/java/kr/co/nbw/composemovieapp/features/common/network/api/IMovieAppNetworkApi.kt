package kr.co.nbw.composemovieapp.features.common.network.api

import kr.co.nbw.composemovieapp.features.common.network.model.MovieResponse
import kr.co.nbw.composemovieapp.library.network.model.ApiResult

interface IMovieAppNetworkApi {
    suspend fun getMovies(): ApiResult<List<MovieResponse>>
}