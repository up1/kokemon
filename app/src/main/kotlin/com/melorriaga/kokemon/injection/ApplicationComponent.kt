package com.melorriaga.kokemon.injection

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        ApplicationModule::class,
        DataModule::class
))
interface ApplicationComponent {

    fun plus(module: MainModule): MainComponent

}
