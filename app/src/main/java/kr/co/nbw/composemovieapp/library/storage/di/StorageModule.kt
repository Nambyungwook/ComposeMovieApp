package kr.co.nbw.composemovieapp.library.storage.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kr.co.nbw.composemovieapp.library.storage.IStorage
import kr.co.nbw.composemovieapp.library.storage.StorageManager
import kr.co.nbw.composemovieapp.library.storage.helpers.DataConverter
import kr.co.nbw.composemovieapp.library.storage.helpers.DataEncoding
import kr.co.nbw.composemovieapp.library.storage.prefs.SharedPrefsStorageProvider
import kr.co.nbw.composemovieapp.library.storage.prefs.StorageProvider
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class StorageModule {

    @Singleton
    @Provides
    fun bindOnDiscStorage(
        storage: StorageProvider,
        converter: DataConverter,
        encoding: DataEncoding
    ): IStorage = StorageManager(storage, converter, encoding)

    @Provides
    fun provideSharePrefStorageProvider(provider: SharedPrefsStorageProvider): StorageProvider =
        provider

}