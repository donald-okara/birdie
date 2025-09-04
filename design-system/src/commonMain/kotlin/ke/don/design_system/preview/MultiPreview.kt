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

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ke.don.design_system.theme.BirdieTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

data class DeviceConfig(
    val name: String,
    val width: Dp,
    val height: Dp,
)

/**
 * A preview harness that takes multiple "data variants"
 * (like PreviewParameter on Android) and shows them
 * across multiple device configs.
 */
@Deprecated(
    message = "Use DevicePreviews instead",
)
@Composable
fun <T> MultiPreview(
    variants: List<T>,
    render: @Composable (T) -> Unit,
) {
    val configs = listOf(
        DeviceConfig("Mobile", width = 360.dp, height = 640.dp),
        DeviceConfig("Tablet", width = 800.dp, height = 1280.dp),
        DeviceConfig("Desktop", width = 1440.dp, height = 900.dp),
    )

    BirdieTheme() {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(48.dp),
        ) {
            items(variants) { variant ->
                Column(verticalArrangement = Arrangement.spacedBy(24.dp)) {
                    Text(
                        text = "Variant: $variant",
                        style = MaterialTheme.typography.titleMedium,
                    )
                    FlowRow(
                        horizontalArrangement = Arrangement.spacedBy(32.dp),
                        verticalArrangement = Arrangement.spacedBy(24.dp),
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        configs.forEach { config ->
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.width(IntrinsicSize.Min),
                            ) {
                                Text(config.name, style = MaterialTheme.typography.bodyMedium)
                                Box(
                                    modifier = Modifier
                                        .size(config.width, config.height)
                                        .border(2.dp, Color.DarkGray, RoundedCornerShape(12.dp))
                                        .background(MaterialTheme.colorScheme.background),
                                    contentAlignment = Alignment.Center,
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .background(MaterialTheme.colorScheme.background),
                                    ) {
                                        render(variant)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

data class User(val name: String, val age: Int)

@Composable
fun ProfileScreen(user: User) {
    Column(Modifier.padding(16.dp)) {
        Text("Name: ${user.name}", style = MaterialTheme.typography.titleLarge)
        Text("Age: ${user.age}", style = MaterialTheme.typography.bodyLarge)
    }
}

@Preview
@Composable
fun ProfileScreenPreview() {
    MultiPreview(variants = listOf(User("Alice", 25), User("Bob", 30))) { user ->
        ProfileScreen(user)
    }
}
