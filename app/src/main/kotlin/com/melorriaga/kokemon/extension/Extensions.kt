package com.melorriaga.kokemon.extension

import android.app.Activity
import android.content.Intent

/**
 * Created by melorriaga on 9/3/17.
 */

inline fun <reified T: Activity> Activity.startActivity() {
    startActivity(Intent(this, T::class.java))
}
