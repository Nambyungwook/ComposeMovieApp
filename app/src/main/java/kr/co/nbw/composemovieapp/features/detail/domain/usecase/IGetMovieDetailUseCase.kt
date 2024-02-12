package kr.co.nbw.composemovieapp.features.detail.domain.usecase

import kr.co.nbw.composemovieapp.features.common.entity.MovieDetailEntity

interface IGetMovieDetailUseCase {
    suspend operator fun invoke(name: String): MovieDetailEntity
}