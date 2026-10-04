package com.sholehbashi.app.data.db

import com.sholehbashi.app.data.db.seed.AfricanRecipes
import com.sholehbashi.app.data.db.seed.AmericanRecipes
import com.sholehbashi.app.data.db.seed.ArabTurkishRecipes
import com.sholehbashi.app.data.db.seed.DessertRecipes
import com.sholehbashi.app.data.db.seed.EastAsianRecipes
import com.sholehbashi.app.data.db.seed.EuropeanRecipes
import com.sholehbashi.app.data.db.seed.HealthyRecipes
import com.sholehbashi.app.data.db.seed.IranianRecipes
import com.sholehbashi.app.data.db.seed.ModernRecipes
import com.sholehbashi.app.data.db.seed.RestAsianRecipes

object SeedData {
    val sample: List<RecipeEntity> =
        IranianRecipes.all +
                ArabTurkishRecipes.all +
                EastAsianRecipes.all +
                RestAsianRecipes.all +
                EuropeanRecipes.all +
                AmericanRecipes.all +
                AfricanRecipes.all +
                ModernRecipes.all +
                HealthyRecipes.all +
                DessertRecipes.all
}