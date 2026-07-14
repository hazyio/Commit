package com.hazyio.commit.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.hazyio.commit.ui.theme.WithCommitTheme

@Composable
fun MainScreen(onNavigateTo: (route: String) -> Unit) {
    Column {
        Text(text = "Welcome")
        Button(onClick = { onNavigateTo("welcome") }) { Text("Go to main") }
    }

}


@Composable
@Preview(showBackground =   true)


private fun MainScreenPreview() {
    WithCommitTheme {
        MainScreen(
            onNavigateTo = {}

        )
    }
}