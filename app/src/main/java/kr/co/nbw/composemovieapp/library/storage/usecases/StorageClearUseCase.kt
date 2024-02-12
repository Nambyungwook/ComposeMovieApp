package kr.co.nbw.composemovieapp.library.storage.usecases

import kr.co.nbw.composemovieapp.library.storage.IStorage
import javax.inject.Inject

class StorageClearUseCase @Inject constructor(
    private val storage: IStorage
) : IStorageClearUseCase {
    override fun invoke() {
        storage.clear()
    }
}