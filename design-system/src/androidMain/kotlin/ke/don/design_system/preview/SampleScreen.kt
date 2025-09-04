package ke.don.design_system.preview

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SampleScreen(name: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello, $name 👋",
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = "This is a previewable screen with a name parameter.",
            style = MaterialTheme.typography.bodyLarge
        )

        Button(
            onClick = { /* no-op in preview */ },
            shape = MaterialTheme.shapes.large // 👈 platform-aware (round on mobile, sharp on desktop)
        ) {
            Text("Continue")
        }
    }
}
