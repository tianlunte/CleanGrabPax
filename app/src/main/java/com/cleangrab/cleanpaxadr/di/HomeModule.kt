package com.cleangrab.cleanpaxadr.di

import com.cleangrab.cleandag.Mountain
import com.cleangrab.cleandag.MountainImpl
import com.cleangrab.cleanpaxadr.models.IntContainer
import dagger.Module
import dagger.Provides

/**
 * Created by qingyun.wang on 21/12/17.
 */

@Module
class HomeModule {
    @Provides
    fun provideTimes() = IntContainer(10)

    @Provides
    fun provideMountain(impl: MountainImpl): Mountain = impl
}