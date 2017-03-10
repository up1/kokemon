package com.melorriaga.kokemon.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.melorriaga.kokemon.KokemonApp
import com.melorriaga.kokemon.data.PokemonService
import com.melorriaga.kokemon.extension.app
import com.melorriaga.kokemon.injection.MainModule
import org.jetbrains.anko.*
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var pokemonService: PokemonService

    val applicationComponent by lazy { app.applicationComponent.plus(MainModule(this)) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MainActivityUI().setContentView(this)
        applicationComponent.injectTo(this)

        pokemonService.getPokemonNames(150)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map { it.results.map { it.name } }
                .subscribe { it.forEach { Log.i(KokemonApp.TAG, it) } }
    }

}

class MainActivityUI: AnkoComponent<MainActivity> {

    override fun createView(ui: AnkoContext<MainActivity>) = ui.apply {
        verticalLayout {
            padding = dip(16)
            button("Go to next screen") {
                onClick {
                    startActivity<DetailsActivity>()
                }
            }
        }
    }.view

}
