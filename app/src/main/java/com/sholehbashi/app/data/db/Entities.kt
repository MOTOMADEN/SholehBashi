package com.sholehbashi.app.data.db

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.sholehbashi.app.data.Source

@Entity(tableName = "recipes")
data class RecipeEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String,
    val ingredients: String,
    val instructions: String,
    val mealType: String = "any",
    val region: String = "any",
    /** see [Source] */
    val source: String = Source.BUILTIN,
    /** id of the recipe in the remote catalog (for updates); null for user/AI recipes */
    val remoteId: Long? = null,
)

@Entity(tableName = "meal_marks", primaryKeys = ["recipeId", "mark"])
data class MealMarkEntity(
    val recipeId: Long,
    /** see [com.sholehbashi.app.data.MarkType] */
    val mark: String,
)

@Entity(tableName = "history")
data class HistoryEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val recipeId: Long,
    val confirmedAt: Long,
)

@Entity(
    tableName = "user_prefs",
    indices = [Index(value = ["type", "value"], unique = true)]
)
data class UserPrefEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    /** see [com.sholehbashi.app.data.PrefType] */
    val type: String,
    val value: String,
)
