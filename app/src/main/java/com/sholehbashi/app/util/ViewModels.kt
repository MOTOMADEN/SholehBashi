package com.sholehbashi.app.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sholehbashi.app.AppContainer
import com.sholehbashi.app.SholehBashiApp

@Composable
fun rememberContainer(): AppContainer =
    (LocalContext.current.applicationContext as SholehBashiApp).container

/** Creates a ViewModel that receives the app container. */
@Composable
inline fun <reified VM : ViewModel> appViewModel(crossinline builder: (AppContainer) -> VM): VM {
    val container = rememberContainer()
    return viewModel(
        factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(modelClass: Class<T>): T = builder(container) as T
        }
    )
}
