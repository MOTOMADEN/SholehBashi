package com.sholehbashi.app.ui.about

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.sholehbashi.app.R
import com.sholehbashi.app.ui.common.CenteredColumn
import com.sholehbashi.app.ui.common.ScreenScaffold

@Composable
fun AboutScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    val uriHandler = LocalUriHandler.current
    val versionName = remember(context) {
        runCatching { context.packageManager.getPackageInfo(context.packageName, 0).versionName }
            .getOrNull() ?: "?"
    }
    val telegram = stringResource(R.string.about_telegram)

    ScreenScaffold(title = stringResource(R.string.menu_about), onBack = onBack) { padding ->
        CenteredColumn(padding) {
            Card(Modifier.fillMaxWidth()) {
                Column(
                    Modifier
                        .fillMaxWidth()
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Icon(
                        Icons.Filled.LocalFireDepartment,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(56.dp),
                    )
                    Text(stringResource(R.string.app_name), style = MaterialTheme.typography.headlineMedium)
                    Text(stringResource(R.string.about_version, versionName), style = MaterialTheme.typography.bodySmall)
                    Text(
                        stringResource(R.string.about_description),
                        modifier = Modifier.padding(top = 16.dp),
                        style = MaterialTheme.typography.bodyMedium,
                    )
                }
            }
            Card(Modifier.fillMaxWidth()) {
                Column(Modifier.padding(16.dp)) {
                    Text(stringResource(R.string.about_telegram_label), style = MaterialTheme.typography.titleSmall)
                    TextButton(onClick = { uriHandler.openUri("https://t.me/" + telegram.removePrefix("@")) }) {
                        Text(telegram)
                    }
                }
            }
            Text(
                stringResource(R.string.about_privacy),
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.6f),
            )
        }
    }
}
