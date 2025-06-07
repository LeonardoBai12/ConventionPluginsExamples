package io.lb.androidlib

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import io.lb.kotlinlibrary.generateHelloWorld

/**
 * A composable function that displays a "Hello, World!" message.
 *
 * @param modifier The modifier to be applied to the Text component.
 */
@Composable
fun HelloWorldComponent(modifier: Modifier = Modifier) {
    Text(
        text = generateHelloWorld(),
        modifier = modifier,
        fontSize = 24.sp
    )
}
