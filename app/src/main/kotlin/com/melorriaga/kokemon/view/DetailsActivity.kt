package com.melorriaga.kokemon.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.melorriaga.kokemon.R
import org.jetbrains.anko.*

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
