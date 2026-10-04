package com.sholehbashi.app.data

/** Mark types a user can attach to a recipe. */
object MarkType {
    const val FAVORITE = "FAVORITE"
    const val COOK_LATER = "COOK_LATER"
}

/** Types of saved user preferences (suggest/remove lists). */
object PrefType {
    const val WANT = "WANT"
    const val AVOID = "AVOID"
    const val ALLERGY = "ALLERGY"
    const val DIET = "DIET"
}

/** Where a recipe came from. User/AI recipes are never overwritten by remote updates. */
object Source {
    const val BUILTIN = "builtin"
    const val REMOTE = "remote"
    const val USER = "user"
    const val AI = "ai"
}

/** key -> Persian label */
val MEAL_TYPES: List<Pair<String, String>> = listOf(
    "any" to "فرقی نمی‌کند",
    "breakfast" to "صبحانه",
    "lunch" to "ناهار",
    "dinner" to "شام",
    "snack" to "عصرانه",
    "dessert" to "دسر",
    "salad" to "سالاد",
    "appetizer" to "پیش‌غذا",
)

val REGIONS: List<Pair<String, String>> = listOf(
    "any" to "همه",
    "iran" to "ایران",
    "arab" to "عربی",
    "turkey" to "ترکی",
    "east_asia" to "شرق آسیا",
    "rest_asia" to "بقیه‌ی آسیا",
    "europe" to "اروپا",
    "americas" to "قاره‌ی آمریکا",
    "africa" to "آفریقا",
)

val GOALS: List<Pair<String, String>> = listOf(
    "none" to "بدون هدف خاص",
    "muscle_gain" to "بدنسازی (افزایش حجم)",
    "weight_loss" to "کاهش وزن",
)
