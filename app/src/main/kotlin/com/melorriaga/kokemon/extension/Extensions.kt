package com.melorriaga.kokemon.extension

import android.app.Activity
import android.content.Intent
import com.melorriaga.kokemon.KokemonApp

inline fun <reified T: Activity> Activity.startActivity() {
    startActivity(Intent(this, T::class.java))
}

val Activity.app: KokemonApp
    get() = application as KokemonApp
