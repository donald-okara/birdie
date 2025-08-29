package ke.don.ibisian

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ke.don.design_system.assets.Images
import org.jetbrains.compose.resources.painterResource

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Ibisian",
        icon = painterResource(Images.appIconBlack) // put this in desktopApp/src/jvmMain/resources
    ) {
        App()
    }
}