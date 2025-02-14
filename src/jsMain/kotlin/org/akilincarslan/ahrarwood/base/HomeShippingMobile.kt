package org.akilincarslan.ahrarwood.base

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontStyle
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import kotlinx.browser.window
import org.akilincarslan.ahrarwood.constants.ImagePaths
import org.akilincarslan.ahrarwood.extensions.isMobileCompatible
import org.akilincarslan.ahrarwood.utils.Utils
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.P

@Composable
fun HomeShippingMobile(modifier: Modifier) {
    val imageSrc = if (Utils.isBrowserLanguageEn()) ImagePaths.SHIPPING1 else ImagePaths.SHIPPING2
    Column(modifier = modifier.fillMaxWidth()
        .height(320.px)
        .padding(leftRight = 16.px )) {
        SpanText(Res.string.shipping_title, modifier = modifier.fontSize(16.px).fontWeight(FontWeight.Bold))
        Column(modifier = modifier.fillMaxSize().margin(top = 24.px)) {
            Image(src = imageSrc, modifier = modifier.size(280.px,160.px))
            H4({
                style {
                    property("margin-top", "4px")
                    property("margin-bottom", "4px")
                    property("font-size", "14px")
                }
            }) {
                SpanText(Res.string.shipping_desc1)
            }
            P({
                style {
                    property("font-size","12px")
                }
            }) {
                SpanText(Res.string.shipping_description)
            }
            P({
                style {
                    property("margin-top", "2px")
                    property("font-size","12px")
                }
            }) {
                SpanText(Res.string.shipping_description2)
            }
        }
    }
}