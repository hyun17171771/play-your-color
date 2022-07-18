package com.pyc.data.repository

import com.pyc.data.datasource.LastPlayerStatusInformationDatasource
import io.reactivex.Completable
import io.reactivex.Single
import pyc.domain.repository.LastPlayerStatusInformationRepository
import javax.inject.Inject

class LastPlayerStatusInformationRepositoryImpl @Inject constructor(
    private val lastPlayerStatusInformationDatasource: LastPlayerStatusInformationDatasource
) : LastPlayerStatusInformationRepository {

    override fun getCurrentPlayingListInfoId(): Single<Int> =
        lastPlayerStatusInformationDatasource.getCurrentPlayingListInfoId()

    override fun saveCurrentPlayingListInfoId(id: Int): Completable =
        lastPlayerStatusInformationDatasource.saveCurrentPlayingListInfoId(id)

    override fun getCurrentPlayingItemId(): Single<Int> =
        lastPlayerStatusInformationDatasource.getCurrentPlayingItemId()


    override fun saveCurrentPlayingItemId(id: Int): Completable =
        lastPlayerStatusInformationDatasource.saveCurrentPlayingItemId(id)


    override fun getCurrentPlayingItemAudioPlaybackTime(): Single<Long> =
        lastPlayerStatusInformationDatasource.getCurrentPlayingItemAudioPlaybackTime()

    override fun saveCurrentPlayingItemAudioPlaybackTime(playbackTime: Long): Completable =
        lastPlayerStatusInformationDatasource.saveCurrentPlayingItemAudioPlaybackTime(playbackTime)

    override fun getIsShuffleOn(): Single<Boolean> =
        lastPlayerStatusInformationDatasource.getIsShuffleOn()

    override fun saveIsShuffleOn(shuffleOn: Boolean): Completable =
        lastPlayerStatusInformationDatasource.saveIsShuffleOn(shuffleOn)

    override fun getIsRepeatOn(): Single<Boolean> =
        lastPlayerStatusInformationDatasource.getIsRepeatOn()

    override fun saveIsRepeatOn(repeatOn: Boolean): Completable =
        lastPlayerStatusInformationDatasource.saveIsRepeatOn(repeatOn)

}