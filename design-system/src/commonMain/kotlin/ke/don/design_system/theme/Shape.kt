/*
 * Copyright © 2025 Donald O. Isoe (isoedonald@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 */
package ke.don.design_system.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

expect val AppShapes: Shapes

val mobileShapes = Shapes(
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(12.dp),
    large = RoundedCornerShape(percent = 50), // pill CTA
)

val desktopShapes = Shapes(
    small = RoundedCornerShape(2.dp),
    medium = RoundedCornerShape(6.dp),
    large = RoundedCornerShape(0.dp), // rectangle CTA
)
