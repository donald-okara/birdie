package ke.don.ibisian.preview

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.unit.dp
import ke.don.design_system.theme.BirdieTheme

@Composable
fun DevicePreviewContainer(
    isDarkTheme: Boolean = false,
    content: @Composable () -> Unit
){
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

    val isDesktop = LocalInspectionMode.current && // true when inside @Preview
            LocalConfiguration.current.screenWidthDp > 600

    val shapes = if (isDesktop) desktopShapes else mobileShapes

    BirdieTheme(
        shapes = shapes,
        darkTheme = isDarkTheme
    ) {
        Surface(
            modifier = Modifier
        ) {
            content.invoke()
        }
    }
}