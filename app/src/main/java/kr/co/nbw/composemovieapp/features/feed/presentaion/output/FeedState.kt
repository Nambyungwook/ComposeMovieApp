package kr.co.nbw.composemovieapp.features.feed.presentaion.output

import kr.co.nbw.composemovieapp.features.common.entity.CategoryEntity

sealed class FeedState {
    object Loading: FeedState()
    class Main(
        val categories: List<CategoryEntity>
    ) : FeedState()

    class Failed(
        val reason: String
    ) : FeedState()
}