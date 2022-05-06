package com.example.envelopebudget.ui.core

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun HorizontalSpacer(
    size: Dp
) {
    Spacer(modifier = Modifier.width(size))
}

@Composable
fun VerticalSpacer(
    size: Dp
) {
    Spacer(modifier = Modifier.height(size))
}
