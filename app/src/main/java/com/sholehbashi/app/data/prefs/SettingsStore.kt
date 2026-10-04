package com.sholehbashi.app.data.prefs

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import java.util.UUID

private val Context.dataStore by preferencesDataStore(name = "settings")

class SettingsStore(private val context: Context) {

    private val hideWelcomeKey = booleanPreferencesKey("hide_welcome")
    private val deviceIdKey = stringPreferencesKey("device_id")

    val hideWelcome: Flow<Boolean?> =
        context.dataStore.data.map { it[hideWelcomeKey] ?: false }

    suspend fun setHideWelcome(hide: Boolean) {
        context.dataStore.edit { it[hideWelcomeKey] = hide }
    }

    /** Random per-install id; the proxy server uses it as an allowlist key. */
    suspend fun deviceId(): String {
        context.dataStore.data.first()[deviceIdKey]?.let { return it }
        val id = UUID.randomUUID().toString()
        context.dataStore.edit { prefs ->
            if (prefs[deviceIdKey] == null) prefs[deviceIdKey] = id
        }
        return context.dataStore.data.first()[deviceIdKey] ?: id
    }
}
