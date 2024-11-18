package com.example.lab_week_11

import android.app.Application
import android.content.Context

class PreferenceApplication : Application() {
    lateinit var preferenceWrapper: PreferenceWrapper
    override fun onCreate() {
        super.onCreate()
// Initialize the preference wrapper
// The preference wrapper is used to access the shared preferences
        preferenceWrapper = PreferenceWrapper(
// Get the shared preferences
// The shared preferences are stored in the file
// /data/data/com.example.lab_week_11_a/shared_prefs/prefs.xml
            getSharedPreferences(
                // The name of the file
                "prefs",


                Context.MODE_PRIVATE
            )
        )
    }
}