package com.sholehbashi.app.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface RecipeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(recipe: RecipeEntity): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(recipes: List<RecipeEntity>)

    @Query("SELECT COUNT(*) FROM recipes")
    suspend fun count(): Int

    @Query("SELECT * FROM recipes ORDER BY RANDOM() LIMIT 1")
    suspend fun random(): RecipeEntity?

    @Query("SELECT * FROM recipes WHERE id = :id")
    suspend fun byId(id: Long): RecipeEntity?
}

@Dao
interface MarkDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun add(mark: MealMarkEntity)

    @Query("DELETE FROM meal_marks WHERE recipeId = :recipeId AND mark = :mark")
    suspend fun remove(recipeId: Long, mark: String)

    @Query("SELECT mark FROM meal_marks WHERE recipeId = :recipeId")
    fun observeMarks(recipeId: Long): Flow<List<String>>

    @Query(
        "SELECT r.* FROM recipes r INNER JOIN meal_marks m ON m.recipeId = r.id " +
            "WHERE m.mark = :mark ORDER BY r.id DESC"
    )
    fun observeRecipes(mark: String): Flow<List<RecipeEntity>>
}

@Dao
interface HistoryDao {
    @Insert
    suspend fun add(entry: HistoryEntity)

    @Query(
        "SELECT r.* FROM recipes r INNER JOIN history h ON h.recipeId = r.id " +
            "ORDER BY h.confirmedAt DESC"
    )
    fun observeRecipes(): Flow<List<RecipeEntity>>
}

@Dao
interface PrefDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun add(pref: UserPrefEntity)

    @Query("DELETE FROM user_prefs WHERE id = :id")
    suspend fun remove(id: Long)

    @Query("SELECT * FROM user_prefs ORDER BY id DESC")
    fun observeAll(): Flow<List<UserPrefEntity>>
}
