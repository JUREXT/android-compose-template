package com.composetemplate

import android.annotation.SuppressLint
import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class App : Application() { // TODO: This project is used as partially helper code.

    @SuppressLint("AppOpenMissing")
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
