package com.hazyio.commit.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

// Baseline: 4dp. Corner radii from the design spec:
// small components (checkboxes, small inputs) = 8dp
// large containers (cards, bottom sheets)      = 28dp
// buttons                                       = fully rounded (pill)
val WithCommentShapes = Shapes(
    extraSmall = RoundedCornerShape(4.dp),
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(12.dp),
    large = RoundedCornerShape(28.dp),
    extraLarge = RoundedCornerShape(28.dp)
)

// Pill shape for buttons — apply directly via Modifier.clip(PillShape) or Button's `shape` param
val PillShape = RoundedCornerShape(percent = 50)
