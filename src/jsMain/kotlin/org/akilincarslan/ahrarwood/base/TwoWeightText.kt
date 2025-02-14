package org.akilincarslan.ahrarwood.base

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.cursor
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.silk.components.icons.fa.FaCopy
import com.varabyte.kobweb.silk.components.text.SpanText
import org.akilincarslan.ahrarwood.extensions.copyToClipboard
import org.jetbrains.compose.web.css.px

@Composable
fun TwoWeightText(
    modifier: Modifier,
    textNormal: String,
    textBold: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        SpanText(
            text = textNormal,
            modifier = modifier
                .color(Colors.Black)
                .fontWeight(FontWeight.Normal)
        )
        SpanText(
            text = textBold,
            modifier = modifier
                .color(Colors.Black)
                .fontWeight(FontWeight.Bold)
                .margin(left = 1.px, right = 6.px)
        )
        FaCopy(
            modifier = modifier
                .cursor(Cursor.Pointer)
                .onClick {
                copyToClipboard(textBold)
            }
        )
    }
}