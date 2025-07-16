package com.shivam.riskcheck.presentation.ui.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(
    title: String,
    navigationIcon: (@Composable (() -> Unit))? = null
) {
    TopAppBar(
        title = { Text(title) },
        navigationIcon = navigationIcon ?: {}
    )
}