package com.asalcedo.whatsappclone.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.asalcedo.whatsappclone.ui.components.AppBarComponent
import com.asalcedo.whatsappclone.ui.components.TabsComponent

@Composable
fun HomeScreen() {
    Column {
        AppBarComponent()
        TabsComponent()
    }

}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}