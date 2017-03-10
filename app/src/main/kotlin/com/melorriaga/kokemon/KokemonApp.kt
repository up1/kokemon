package com.melorriaga.kokemon

import android.app.Application
import com.melorriaga.kokemon.injection.ApplicationComponent
import com.melorriaga.kokemon.injection.ApplicationModule
import com.melorriaga.kokemon.injection.DaggerApplicationComponent
import com.melorriaga.kokemon.injection.DataModule

class KokemonApp : Application() {

    companion object {
        val TAG = KokemonApp::class.simpleName
    }

    val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .dataModule(DataModule(BuildConfig.BASE_URL))
                .build()
    }

}
