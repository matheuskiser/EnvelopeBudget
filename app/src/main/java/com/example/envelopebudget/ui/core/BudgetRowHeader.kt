package com.example.envelopebudget.ui.core

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.envelopebudget.ui.theme.EnvelopeBudgetTheme

@Composable
fun BudgetRowHeader(
    modifier: Modifier = Modifier
) {
    Row(
        modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.surfaceVariant)
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            text = "Bills",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.weight(0.7f)
        )

        HorizontalSpacer(size = 8.dp)

        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier.weight(0.5f)
        ) {
            Text(
                text = "Budgeted",
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "$15.49",
            )
        }

        HorizontalSpacer(size = 8.dp)

        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier.weight(0.5f)
        ) {
            Text(
                text = "Available",
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "-$15.49",
            )
        }
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
private fun BudgetRowHeaderPreview() {
    EnvelopeBudgetTheme {
        Surface {
            BudgetRowHeader()
        }
    }
}
