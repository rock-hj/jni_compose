package com.hajni.codelab_2.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.hajni.codelab_2.R


val alignYourBodyData = listOf(
    R.drawable.mmm to R.string.app_name,
    R.drawable.image to R.string.placeholder_search,
    R.drawable.mmm to R.string.app_name,
    R.drawable.image to R.string.placeholder_search,
).map { DrawableStringPair(it.first, it.second) }

val favoriteCollectionsData = listOf(
    R.drawable.mmm to R.string.app_name,
    R.drawable.image to R.string.placeholder_search,
    R.drawable.mmm to R.string.app_name,
    R.drawable.image to R.string.placeholder_search,
).map { DrawableStringPair(it.first, it.second) }

data class DrawableStringPair(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)