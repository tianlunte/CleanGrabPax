package com.cleangrab.cleanpaxadr.di

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
}