package com.melorriaga.kokemon

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*

/**
 * Created by melorriaga on 9/3/17.
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityUI().setContentView(this)
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
