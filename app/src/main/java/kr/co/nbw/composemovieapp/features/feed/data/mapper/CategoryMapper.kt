package kr.co.nbw.composemovieapp.features.feed.data.mapper

import kr.co.nbw.composemovieapp.features.common.entity.CategoryEntity
import kr.co.nbw.composemovieapp.features.common.entity.EntityWrapper
import kr.co.nbw.composemovieapp.features.common.entity.MovieDetailEntity
import kr.co.nbw.composemovieapp.features.common.mapper.BaseMapper
import kr.co.nbw.composemovieapp.features.common.network.model.MovieResponse
import kr.co.nbw.composemovieapp.features.feed.data.FeedConstants
import kr.co.nbw.composemovieapp.features.feed.domain.enum.SortOrder
import kr.co.nbw.composemovieapp.library.storage.IStorage
import javax.inject.Inject

class CategoryMapper @Inject constructor(
    private val storage: IStorage
) : BaseMapper<List<MovieResponse>, List<CategoryEntity>>() {
    override fun getSuccess(
        model: List<MovieResponse>?,
        extra: Any?
    ): EntityWrapper.Success<List<CategoryEntity>> {
        return model?.let {
            EntityWrapper.Success(
                entity = mutableListOf<MovieDetailEntity>()
                    .apply {
                        addAll(model.map { it.toMovieDetailEntity() })
                    }
                    .also {
                        storage.save(FeedConstants.MOVIE_LIST_KEY, it)
                    }
                    .map {
                        it.toMovieThumbnailEntity()
                    }
                    .toCategoryList(if (extra is SortOrder) extra else SortOrder.RATING)
            )
        } ?: EntityWrapper.Success(
            entity = listOf()
        )
    }

    override fun getFailure(error: Throwable): EntityWrapper.Fail<List<CategoryEntity>> {
        return EntityWrapper.Fail(error)
    }
}