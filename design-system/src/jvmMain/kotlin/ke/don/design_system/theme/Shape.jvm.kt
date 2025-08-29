package ke.don.design_system.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

actual val AppShapes: Shapes = Shapes(
    small = RoundedCornerShape(2.dp),
    medium = RoundedCornerShape(6.dp),
    large = RoundedCornerShape(0.dp) // rectangle CTA
)