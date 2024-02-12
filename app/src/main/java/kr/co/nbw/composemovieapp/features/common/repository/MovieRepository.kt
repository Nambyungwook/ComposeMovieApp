package kr.co.nbw.composemovieapp.features.common.repository

import kr.co.nbw.composemovieapp.features.common.entity.CategoryEntity
import kr.co.nbw.composemovieapp.features.common.entity.EntityWrapper
import kr.co.nbw.composemovieapp.features.common.entity.MovieDetailEntity
import kr.co.nbw.composemovieapp.features.common.network.api.IMovieAppNetworkApi
import kr.co.nbw.composemovieapp.features.feed.data.FeedConstants
import kr.co.nbw.composemovieapp.features.feed.data.mapper.CategoryMapper
import kr.co.nbw.composemovieapp.features.feed.domain.enum.SortOrder
import kr.co.nbw.composemovieapp.library.storage.IStorage
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val movieNetworkApi: IMovieAppNetworkApi,
    private val storage: IStorage,
    private val categoryMapper: CategoryMapper
): IMovieDataSource {
    override suspend fun getCategories(sortOrder: SortOrder?): EntityWrapper<List<CategoryEntity>> {
        return categoryMapper.mapFromResult(
            result = movieNetworkApi.getMovies(),
            extra = sortOrder
        )
    }

    override suspend fun getMovieDetail(movieName: String): MovieDetailEntity {
        return storage
            .get<List<MovieDetailEntity>>(FeedConstants.MOVIE_LIST_KEY)
            ?.single { it.title == movieName }
            ?: MovieDetailEntity()
    }
}