package com.example.envelopebudget.ui.core

import android.content.res.Configuration
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.envelopebudget.ui.theme.EnvelopeBudgetTheme

@Composable
fun BudgetRowItem(
    modifier: Modifier = Modifier
) {
    Row(
        modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            text = "Netflix",
            modifier = Modifier.weight(0.7f)
        )

        HorizontalSpacer(size = 8.dp)

        Text(
            text = "$15.49",
            textAlign = TextAlign.End,
            modifier = Modifier.weight(0.5f)
        )

        HorizontalSpacer(size = 8.dp)

        Text(
            text = "$0.00",
            textAlign = TextAlign.End,
            modifier = Modifier.weight(0.5f)
        )
    }
}

@Preview(
    name = "Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Preview(
    name = "Day Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Composable
private fun BudgetRowItemPreview() {
    EnvelopeBudgetTheme {
        Surface {
            BudgetRowItem()
        }
    }
}
