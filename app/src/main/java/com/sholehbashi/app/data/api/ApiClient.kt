package com.sholehbashi.app.data.api

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

/** Builds the Retrofit client; every request carries the install id for the server allowlist. */
class ApiClient(private val deviceId: suspend () -> String) {

    private val json = Json { ignoreUnknownKeys = true }

    private val http = OkHttpClient.Builder()
        .addInterceptor { chain ->
            val id = runBlocking { deviceId() }
            chain.proceed(chain.request().newBuilder().header("X-Device-Id", id).build())
        }
        .connectTimeout(15, TimeUnit.SECONDS)
        .readTimeout(45, TimeUnit.SECONDS)
        .build()

    val api: SuggestApi = Retrofit.Builder()
        .baseUrl(ApiConfig.BASE_URL)
        .client(http)
        .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
        .build()
        .create(SuggestApi::class.java)
}
