package ke.don.birdie

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import ke.don.design_system.assets.Images
import ke.don.design_system.theme.BirdieTheme
import ke.don.koffee.annotations.ExperimentalKoffeeApi
import ke.don.koffee.domain.Koffee
import ke.don.koffee.ui.KoffeeBar

@OptIn(ExperimentalKoffeeApi::class)
@Composable
@Preview
fun App() {
    BirdieTheme {
        KoffeeBar {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                var showContent by remember { mutableStateOf(false) }
                Column(
                    modifier = Modifier
                        .safeContentPadding()
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Button(
                        onClick = {
                            showContent = !showContent
                            Koffee.show(
                                title = "Hello Matcha",
                                description = "We just successfully installed Koffee"
                            )
                        }
                    ) {
                        Text("Click me!")
                    }
                    AnimatedVisibility(showContent) {
                        val greeting = remember { Greeting().greet() }
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Image(painterResource(Images.appIcon), null)
                            Text(
                                "Compose: $greeting",
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Text(
                                "Compose: ${MaterialTheme.colorScheme.background.value}}",
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }
                }
            }

        }

    }
}