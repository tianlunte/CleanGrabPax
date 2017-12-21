package com.cleangrab.cleanpaxadr.di

import com.cleangrab.cleanpaxadr.MainActivity
import dagger.Subcomponent

/**
 * Created by qingyun.wang on 21/12/17.
 */

@Subcomponent(modules = arrayOf(HomeModule::class))
interface HomeComponent {
    @Subcomponent.Builder
    interface Builder {
        fun build(): HomeComponent
    }

    fun inject(activity: MainActivity)
}