/*
 * Copyright © 2025 Donald O. Isoe (isoedonald@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 */
package ke.don.design_system.components.button

import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private const val disabledAlpha = 0.6f

val ButtonType.buttonTypeColor: @Composable () -> ButtonColors
    get() = {
        when (this) {
            ButtonType.Primary -> ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary,
                disabledContentColor = MaterialTheme.colorScheme.primary.copy(alpha = disabledAlpha),
                disabledContainerColor = MaterialTheme.colorScheme.primary.copy(alpha = disabledAlpha),
            )
            ButtonType.Secondary -> ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondary,
                contentColor = MaterialTheme.colorScheme.onSecondary,
                disabledContentColor = MaterialTheme.colorScheme.secondary.copy(alpha = disabledAlpha),
                disabledContainerColor = MaterialTheme.colorScheme.secondary.copy(alpha = disabledAlpha),
            )
            ButtonType.Tertiary -> ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.tertiary,
                contentColor = MaterialTheme.colorScheme.onTertiary,
                disabledContentColor = MaterialTheme.colorScheme.tertiary.copy(alpha = disabledAlpha),
                disabledContainerColor = MaterialTheme.colorScheme.tertiary.copy(alpha = disabledAlpha),
            )
            ButtonType.Error -> ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.error,
                contentColor = MaterialTheme.colorScheme.onError,
                disabledContentColor = MaterialTheme.colorScheme.error.copy(alpha = disabledAlpha),
                disabledContainerColor = MaterialTheme.colorScheme.error.copy(alpha = disabledAlpha),
            )
            ButtonType.Neutral -> ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.onSurface,
                contentColor = MaterialTheme.colorScheme.surface,
                disabledContainerColor = MaterialTheme.colorScheme.onSurface.copy(alpha = disabledAlpha),
                disabledContentColor = MaterialTheme.colorScheme.surface.copy(alpha = disabledAlpha),
            )
            ButtonType.Outlined -> ButtonDefaults.outlinedButtonColors(
                contentColor = MaterialTheme.colorScheme.primary,
                containerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = MaterialTheme.colorScheme.primary.copy(alpha = disabledAlpha),
            )
        }
    }
