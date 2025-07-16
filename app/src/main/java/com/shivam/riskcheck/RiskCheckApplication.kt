package com.shivam.riskcheck

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class RiskCheckApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}