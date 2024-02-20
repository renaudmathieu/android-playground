package com.renaudmathieu.playground

import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.renaudmathieu.playground.core.DevicePreviews

/*
    Dumb but useful for the session.
 */
@Composable
fun ToggleButton(
    modifier: Modifier = Modifier,
    checked: Boolean,
    onCheckedChange: () -> Unit
) {
    Switch(
        modifier = modifier,
        checked = checked,
        onCheckedChange = { onCheckedChange() }
    )
}

@DevicePreviews
@Composable
fun ToggleButtonPreview() {
    var isChecked by remember { mutableStateOf(false) }
    ToggleButton(
        checked = isChecked,
        onCheckedChange = { isChecked = !isChecked }
    )
}