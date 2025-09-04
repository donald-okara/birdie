/*
 * Copyright © 2025 Donald O. Isoe (isoedonald@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 */
package ke.don.design_system.preview

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalInspectionMode
import ke.don.design_system.theme.BirdieTheme
import ke.don.design_system.theme.desktopShapes
import ke.don.design_system.theme.mobileShapes

@Composable
fun DevicePreviewContainer(
    isDarkTheme: Boolean = false,
    content: @Composable () -> Unit,
) {
    val isDesktop = LocalInspectionMode.current && // true when inside @Preview
        LocalConfiguration.current.screenWidthDp > 600

    val shapes = if (isDesktop) desktopShapes else mobileShapes

    BirdieTheme(
        shapes = shapes,
        darkTheme = isDarkTheme,
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            content.invoke()
        }
    }
}
