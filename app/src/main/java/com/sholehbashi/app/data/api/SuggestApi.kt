package com.sholehbashi.app.data.api

import android.os.Build
import kotlinx.serialization.Serializable
import retrofit2.http.Body
import retrofit2.http.POST

object ApiConfig {
    /**
     * Address of YOUR proxy server (e.g. a Cloudflare Worker hosted outside Iran).
     * The Gemini/Grok keys live ONLY on that server, never in this app.
     * Must end with "/".
     */
    const val BASE_URL = "https://sholehbashi-proxy.example.workers.dev/"
}

@Serializable
data class SuggestRequest(
    val wants: List<String>,
    val avoids: List<String>,
    val allergies: List<String>,
    val diets: List<String>,
    /** one of GOALS keys: none | muscle_gain | weight_loss */
    val goal: String,
    val wish: String,
    /** one of MEAL_TYPES keys */
    val mealType: String,
    /** one of REGIONS keys */
    val region: String,
    val count: Int = 3,
    val deviceModel: String = Build.MODEL,
    val androidSdk: Int = Build.VERSION.SDK_INT,
)

@Serializable
data class MealDto(
    val title: String,
    val ingredients: String,
    val instructions: String,
)

@Serializable
data class SuggestResponse(
    val meals: List<MealDto>,
)

interface SuggestApi {
    @POST("suggest")
    suspend fun suggest(@Body request: SuggestRequest): SuggestResponse
}
