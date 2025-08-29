package ke.don.ibisian.preview

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.unit.dp
import ke.don.design_system.theme.BirdieTheme
import ke.don.design_system.theme.desktopShapes
import ke.don.design_system.theme.mobileShapes

@Composable
fun DevicePreviewContainer(
    isDarkTheme: Boolean = false,
    content: @Composable () -> Unit
){
    val isDesktop = LocalInspectionMode.current && // true when inside @Preview
            LocalConfiguration.current.screenWidthDp > 600

    val shapes = if (isDesktop) desktopShapes else mobileShapes

    BirdieTheme(
        shapes = shapes,
        darkTheme = isDarkTheme
    ) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            content.invoke()
        }
    }
}