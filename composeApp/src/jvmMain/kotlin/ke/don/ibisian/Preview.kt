package ke.don.ibisian

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ke.don.design_system.assets.Images
import ke.don.design_system.preview.MultiPreview
import org.jetbrains.compose.resources.painterResource

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Ibisian Preview",
        icon = painterResource(Images.appIconBlack) // put this in desktopApp/src/jvmMain/resources
    ) {
        MultiPreview(
            variants = listOf("Alice", "Bob", "Charlie")
        ) { name ->
            SampleScreen(name) // any composable you want to preview
        }
    }
}