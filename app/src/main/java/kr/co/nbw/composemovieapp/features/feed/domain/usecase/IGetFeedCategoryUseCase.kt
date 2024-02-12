package kr.co.nbw.composemovieapp.features.feed.domain.usecase

import kr.co.nbw.composemovieapp.features.common.entity.CategoryEntity
import kr.co.nbw.composemovieapp.features.common.entity.EntityWrapper
import kr.co.nbw.composemovieapp.features.feed.domain.enum.SortOrder

interface IGetFeedCategoryUseCase {
    suspend operator fun invoke(sortOrder: SortOrder? = null): EntityWrapper<List<CategoryEntity>>
}
