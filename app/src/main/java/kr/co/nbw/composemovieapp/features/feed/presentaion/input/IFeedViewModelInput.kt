package kr.co.nbw.composemovieapp.features.feed.presentaion.input

interface IFeedViewModelInput {
    fun openDetail(movieName: String)
    fun openInfoDialog()
    fun refreshFeed()
}