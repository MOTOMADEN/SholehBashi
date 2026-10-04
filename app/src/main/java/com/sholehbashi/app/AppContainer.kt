package com.sholehbashi.app

import android.content.Context
import com.sholehbashi.app.data.api.ApiClient
import com.sholehbashi.app.data.db.AppDatabase
import com.sholehbashi.app.data.db.SeedData
import com.sholehbashi.app.data.prefs.SettingsStore
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

/** Very small manual DI container. Swap for Hilt/Koin later if the project grows. */
class AppContainer(context: Context) {
    val db = AppDatabase.build(context)
    val settings = SettingsStore(context)
    val api = ApiClient { settings.deviceId() }.api

    private val seedMutex = Mutex()

    /** Inserts sample recipes on the very first run (idempotent). */
    suspend fun ensureSeeded() = seedMutex.withLock {
        if (db.recipeDao().count() == 0) db.recipeDao().insertAll(SeedData.sample)
    }
}
