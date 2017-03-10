package com.melorriaga.kokemon.injection

import android.support.v7.app.AppCompatActivity
import dagger.Module
import dagger.Provides

@Module
open class ActivityModule(private val activity: AppCompatActivity) {

    @Provides
    @ActivityScope
    fun provideActivity() = activity

}
