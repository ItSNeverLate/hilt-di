package com.simonsvoss.hiltunderstanding

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    init {
        println("DEBUG: Application.init()")
    }
}
