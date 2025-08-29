package ke.don.design_system.theme

import androidx.compose.runtime.Composable
import platform.UIKit.UITraitCollection
import platform.UIKit.currentTraitCollection

@Composable
actual fun systemInDarkTheme(): Boolean {
    return UITraitCollection.currentTraitCollection.userInterfaceStyle ==
            platform.UIKit.UIUserInterfaceStyle.UIUserInterfaceStyleDark
}