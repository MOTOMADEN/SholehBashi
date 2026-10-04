package com.sholehbashi.app.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [
        RecipeEntity::class,
        MealMarkEntity::class,
        HistoryEntity::class,
        UserPrefEntity::class,
    ],
    version = 1,
    exportSchema = true,
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun recipeDao(): RecipeDao
    abstract fun markDao(): MarkDao
    abstract fun historyDao(): HistoryDao
    abstract fun prefDao(): PrefDao

    companion object {
        /**
         * To ship the ~1000 built-in recipes inside the APK, create a Room-compatible
         * database file at app/src/main/assets/recipes.db and add
         * `.createFromAsset("recipes.db")` to this builder (see README).
         */
        fun build(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, "sholehbashi.db").build()
    }
}
