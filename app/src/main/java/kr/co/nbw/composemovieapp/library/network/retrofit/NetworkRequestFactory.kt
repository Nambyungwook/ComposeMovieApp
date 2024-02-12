package kr.co.nbw.composemovieapp.library.network.retrofit

import kr.co.nbw.composemovieapp.library.network.model.ApiResult
import kr.co.nbw.composemovieapp.library.network.model.NetworkRequestInfo
import java.lang.reflect.Type

interface NetworkRequestFactory {

    suspend fun <T> create(
        url: String,
        requestInfo: NetworkRequestInfo = NetworkRequestInfo.Builder().build(),
        type: Type
    ): ApiResult<T>
}