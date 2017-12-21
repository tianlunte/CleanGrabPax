package com.cleangrab.cleanpaxadr.di

import dagger.Module
import dagger.Provides

/**
 * Created by qingyun.wang on 21/12/17.
 */

@Module(subcomponents = arrayOf(HomeComponent::class))
class AppModule {
    @Provides
    fun provideName() = "CleanGrab"
}