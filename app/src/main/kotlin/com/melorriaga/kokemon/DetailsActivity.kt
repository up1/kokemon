package com.melorriaga.kokemon

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*

/**
 * Created by melorriaga on 9/3/17.
 */

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DetailsActivityUI().setContentView(this)
    }

}

class DetailsActivityUI: AnkoComponent<DetailsActivity> {

    override fun createView(ui: AnkoContext<DetailsActivity>) = ui.apply {
        verticalLayout {
            padding = dip(16)
            textView(R.string.app_name)
        }
    }.view

}
