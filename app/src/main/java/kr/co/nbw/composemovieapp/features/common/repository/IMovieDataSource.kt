package kr.co.nbw.composemovieapp.features.common.repository

import kr.co.nbw.composemovieapp.features.common.entity.CategoryEntity
import kr.co.nbw.composemovieapp.features.common.entity.EntityWrapper
import kr.co.nbw.composemovieapp.features.common.entity.MovieDetailEntity
import kr.co.nbw.composemovieapp.features.feed.domain.enum.SortOrder

interface IMovieDataSource {
    suspend fun getCategories(sortOrder: SortOrder? = null): EntityWrapper<List<CategoryEntity>>
    suspend fun getMovieDetail(movieName: String): MovieDetailEntity
}