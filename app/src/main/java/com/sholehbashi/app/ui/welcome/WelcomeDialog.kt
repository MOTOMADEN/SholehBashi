package com.sholehbashi.app.ui.welcome

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.sholehbashi.app.R
import com.sholehbashi.app.util.rememberContainer
import kotlinx.coroutines.launch

/** Shows the welcome dialog once per launch unless the user chose "don't show again". */
@Composable
fun WelcomeHost() {
    val settings = rememberContainer().settings
    // null = still loading, so the dialog never flashes for users who opted out
    val hide by settings.hideWelcome.collectAsStateWithLifecycle(initialValue = null)
    var dismissed by rememberSaveable { mutableStateOf(false) }
    val scope = rememberCoroutineScope()

    if (hide == false && !dismissed) {
        WelcomeDialog(
            onClose = { dismissed = true },
            onDontShowAgain = {
                dismissed = true
                scope.launch { settings.setHideWelcome(true) }
            },
        )
    }
}

@Composable
fun WelcomeDialog(onClose: () -> Unit, onDontShowAgain: () -> Unit) {
    AlertDialog(
        onDismissRequest = onClose,
        icon = {
            Icon(
                Icons.Filled.LocalFireDepartment,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(40.dp),
            )
        },
        title = { Text(stringResource(R.string.welcome_title)) },
        text = { Text(stringResource(R.string.welcome_body)) },
        confirmButton = {
            TextButton(onClick = onClose) { Text(stringResource(R.string.welcome_close)) }
        },
        dismissButton = {
            TextButton(onClick = onDontShowAgain) { Text(stringResource(R.string.welcome_dont_show)) }
        },
    )
}
