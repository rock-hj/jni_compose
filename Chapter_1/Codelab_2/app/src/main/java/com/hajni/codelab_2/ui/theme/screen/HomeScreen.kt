package com.hajni.codelab_2.ui.theme.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hajni.codelab_2.R
import com.hajni.codelab_2.ui.theme.Codelab_2Theme
import com.hajni.codelab_2.ui.theme.view.AlignYourBodyRow
import com.hajni.codelab_2.ui.theme.view.FavoriteCollectionsGrid
import com.hajni.codelab_2.ui.theme.view.HomeSection
import com.hajni.codelab_2.ui.theme.view.SearchBar

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(Modifier.height(16.dp))
        SearchBar()
        HomeSection(R.string.align_your_body) {
            AlignYourBodyRow()
        }
        HomeSection(R.string.favorite_collections) {
            FavoriteCollectionsGrid()
        }
        Spacer(Modifier.height(16.dp))
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE, heightDp = 180)
@Composable
fun ScreenContentPreview() {
    Codelab_2Theme { HomeScreen() }
}