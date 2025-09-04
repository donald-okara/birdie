package ke.don.design_system.preview.token_previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import ke.don.design_system.components.button.ButtonShowcase
import ke.don.design_system.preview.DevicePreviewContainer
import ke.don.design_system.preview.DevicePreviews

class DarkModeProvider : PreviewParameterProvider<Boolean> {
    override val values = sequenceOf(true, false)
}

@DevicePreviews
@Composable
fun ButtonPreview(
    @PreviewParameter(DarkModeProvider::class) isDarkTheme: Boolean
){
    DevicePreviewContainer(
        isDarkTheme
    ) {
        ButtonShowcase()
    }
}