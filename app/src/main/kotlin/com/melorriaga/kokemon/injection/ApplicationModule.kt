package com.melorriaga.kokemon.injection

import android.content.SharedPreferences
import android.content.res.Resources
import android.preference.PreferenceManager
import com.melorriaga.kokemon.KokemonApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val app: KokemonApp) {

    @Provides
    @Singleton
    fun provideKokemonApp() = app

    @Provides
    @Singleton
    fun provideResources(): Resources = app.resources

    @Provides
    @Singleton
    fun provideSharedPreferences(): SharedPreferences = PreferenceManager.getDefaultSharedPreferences(app)

}
