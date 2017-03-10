package com.melorriaga.kokemon.injection

import com.melorriaga.kokemon.view.MainActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = arrayOf(
        MainModule::class
))
interface MainComponent {

    fun injectTo(activity: MainActivity)

}
