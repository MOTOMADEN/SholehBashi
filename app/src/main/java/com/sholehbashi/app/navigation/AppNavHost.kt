package com.sholehbashi.app.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sholehbashi.app.ui.about.AboutScreen
import com.sholehbashi.app.ui.history.HistoryScreen
import com.sholehbashi.app.ui.home.HomeScreen
import com.sholehbashi.app.ui.newmeal.NewMealScreen
import com.sholehbashi.app.ui.random.RandomScreen
import com.sholehbashi.app.ui.saved.SavedScreen

object Routes {
    const val HOME = "home"
    const val RANDOM = "random"
    const val NEW_MEAL = "new_meal"
    const val HISTORY = "history"
    const val SAVED = "saved"
    const val ABOUT = "about"
}

private const val DURATION = 380

@Composable
fun AppNavHost() {
    val nav = rememberNavController()
    val go: (String) -> Unit = { route -> nav.navigate(route) { launchSingleTop = true } }
    val back: () -> Unit = { nav.popBackStack() }

    NavHost(
        navController = nav,
        startDestination = Routes.HOME,
        enterTransition = {
            slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.Start, tween(DURATION)) +
                fadeIn(tween(DURATION))
        },
        exitTransition = {
            slideOutOfContainer(
                AnimatedContentTransitionScope.SlideDirection.Start,
                tween(DURATION),
                targetOffset = { it / 4 },
            ) + fadeOut(tween(DURATION))
        },
        popEnterTransition = {
            slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.End,
                tween(DURATION),
                initialOffset = { it / 4 },
            ) + fadeIn(tween(DURATION))
        },
        popExitTransition = {
            slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.End, tween(DURATION)) +
                fadeOut(tween(DURATION))
        },
    ) {
        composable(Routes.HOME) { HomeScreen(onNavigate = go) }
        composable(Routes.RANDOM) { RandomScreen(onBack = back) }
        composable(Routes.NEW_MEAL) { NewMealScreen(onBack = back) }
        composable(Routes.HISTORY) { HistoryScreen(onBack = back) }
        composable(Routes.SAVED) { SavedScreen(onBack = back) }
        composable(Routes.ABOUT) { AboutScreen(onBack = back) }
    }
}
