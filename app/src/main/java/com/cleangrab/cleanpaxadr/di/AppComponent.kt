package com.cleangrab.cleanpaxadr.di

import com.cleangrab.cleanpaxadr.MainActivity
import dagger.Component

/**
 * Created by qingyun.wang on 21/12/17.
 */

@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun getHomeBuilder(): HomeComponent.Builder
}