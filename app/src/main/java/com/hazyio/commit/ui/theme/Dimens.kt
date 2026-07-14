package com.hazyio.commit.ui.theme

import androidx.compose.ui.unit.dp

// M3's MaterialTheme has no built-in spacing token slot, so spacing lives
// in a plain object. Values are pulled straight from the design spec.
object WithCommentSpacing {
    val baseline = 4.dp
    val marginMobile = 16.dp
    val marginTablet = 24.dp
    val gutter = 16.dp
    val touchTargetMin = 48.dp
    val cardPadding = 24.dp // "large internal paddings (24dp+)"
}
