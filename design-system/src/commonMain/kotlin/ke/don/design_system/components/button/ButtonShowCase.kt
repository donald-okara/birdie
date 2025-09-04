package ke.don.design_system.components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ButtonShowcase() {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ButtonType.entries.forEach {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp) // spacing between buttons
            ) {
                ButtonToken(
                    onClick = {},
                    buttonType = it,
                    modifier = Modifier.weight(1f) // take half width
                ) {
                    Text(it.name)
                }
                ButtonToken(
                    onClick = {},
                    buttonType = it,
                    enabled = false,
                    modifier = Modifier.weight(1f)
                ) {
                    Text(it.name)
                }
            }
        }
    }
}
