package kr.co.nbw.composemovieapp.features.detail.presentation.output

import kr.co.nbw.composemovieapp.features.common.entity.MovieDetailEntity

sealed class MovieDetailState {
    object Initial : MovieDetailState()
    class Main(val movieDetailEntity: MovieDetailEntity) : MovieDetailState()
}