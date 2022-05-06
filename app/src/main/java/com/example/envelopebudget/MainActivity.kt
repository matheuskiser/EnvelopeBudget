package com.example.envelopebudget

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.envelopebudget.ui.core.BudgetRowHeader
import com.example.envelopebudget.ui.core.BudgetRowItem
import com.example.envelopebudget.ui.core.ToBeBudgetedBanner
import com.example.envelopebudget.ui.theme.EnvelopeBudgetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EnvelopeBudgetTheme {
                Surface {
                    SampleBudget()
                }
            }
        }
    }
}

@Composable
fun SampleBudget() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        item {
            ToBeBudgetedBanner()
        }

        item {
            BudgetRowHeader()
        }
        item {
            BudgetRowItem()
        }
        item {
            BudgetRowItem()
        }
        item {
            BudgetRowItem()
        }
        item {
            BudgetRowItem()
        }

        item {
            BudgetRowHeader()
        }
        item {
            BudgetRowItem()
        }
        item {
            BudgetRowItem()
        }
    }
}

@Preview(
    name = "Night Mode - Empty",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Preview(
    name = "Day Mode - Empty",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Composable
private fun LoginContentPreview() {
    EnvelopeBudgetTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize()
        ) {
            SampleBudget()
        }
    }
}
