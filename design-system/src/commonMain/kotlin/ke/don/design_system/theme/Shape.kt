package ke.don.design_system.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

expect val AppShapes: Shapes

val mobileShapes =  Shapes(
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(12.dp),
    large = RoundedCornerShape(percent = 50) // pill CTA
)

val desktopShapes = Shapes(
    small = RoundedCornerShape(2.dp),
    medium = RoundedCornerShape(6.dp),
    large = RoundedCornerShape(0.dp) // rectangle CTA
)