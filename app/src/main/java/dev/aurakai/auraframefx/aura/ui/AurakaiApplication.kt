package dev.aurakai.auraframefx.aura.ui

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import dev.aurakai.auraframefx.BuildConfig

@HiltAndroidApp
class AurakaiApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        
        // Initialize Timber for logging
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        
        Timber.d("AurakaiApplication initialized")
    }
}
