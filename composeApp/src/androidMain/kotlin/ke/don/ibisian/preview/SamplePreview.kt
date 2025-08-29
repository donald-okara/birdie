package ke.don.ibisian.preview

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider


data class DemoData(val title: String, val isDark: Boolean = false)

class DemoDataProvider : PreviewParameterProvider<DemoData> {
    override val values = sequenceOf(
        DemoData("Lucy", true),
        DemoData("Lucy", false),
        DemoData("Annie", true),
        DemoData("Annie", false),
    )
}

@DevicePreviews
@Composable
fun MyScreenPreview(
    @PreviewParameter(DemoDataProvider::class) demoData: DemoData
) {
    DevicePreviewContainer(isDarkTheme = demoData.isDark) {
        SampleScreen(demoData.title)
    }

}
