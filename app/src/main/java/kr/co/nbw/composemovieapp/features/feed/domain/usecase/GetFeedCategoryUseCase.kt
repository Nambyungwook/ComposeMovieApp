package kr.co.nbw.composemovieapp.features.feed.domain.usecase

import kr.co.nbw.composemovieapp.features.common.entity.CategoryEntity
import kr.co.nbw.composemovieapp.features.common.entity.EntityWrapper
import kr.co.nbw.composemovieapp.features.common.repository.IMovieDataSource
import kr.co.nbw.composemovieapp.features.feed.domain.enum.SortOrder
import javax.inject.Inject

class GetFeedCategoryUseCase @Inject constructor(
    private val dataSource: IMovieDataSource
): IGetFeedCategoryUseCase {
    override suspend fun invoke(sortOrder: SortOrder?): EntityWrapper<List<CategoryEntity>> {
        return dataSource.getCategories(sortOrder)
    }
}