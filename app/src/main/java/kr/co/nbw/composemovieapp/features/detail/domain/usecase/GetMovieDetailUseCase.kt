package kr.co.nbw.composemovieapp.features.detail.domain.usecase

import kr.co.nbw.composemovieapp.features.common.entity.MovieDetailEntity
import kr.co.nbw.composemovieapp.features.common.repository.IMovieDataSource
import javax.inject.Inject

class GetMovieDetailUseCase @Inject constructor(
    private val dataSource: IMovieDataSource
) : IGetMovieDetailUseCase {
    override suspend fun invoke(name: String): MovieDetailEntity {
        return dataSource.getMovieDetail(name)
    }
}