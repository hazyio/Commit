package com.hazyio.commit.pages

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.hazyio.commit.ui.theme.WithCommitTheme

@Composable
fun WelcomeScreen(onNavigateToMain: () -> Unit) {
    Button(onClick = { onNavigateToMain() }) { Text("Go to main") }
}


@Composable
@Preview(showBackground = true)

private fun ViewPreview() {
    WithCommitTheme {
        WelcomeScreen({}

        )
    }
}