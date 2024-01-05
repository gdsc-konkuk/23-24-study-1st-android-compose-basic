package com.dev.nunu.code.lab.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dev.nunu.code.lab.DevicePreview
import com.dev.nunu.code.lab.R
import com.dev.nunu.code.lab.ui.theme.ComposeCodelabKonkukUniversityTheme

@Composable
fun Banner(
    department: String,
    part: String
) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 28.dp)
            .border(
                width = 1.dp,
                color = Color(0xFF9b9b9b),
                shape = RoundedCornerShape(16.dp)
            )
            .padding(start = 48.dp, end = 12.dp, top = 15.dp, bottom = 15.dp)
        ,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = "건국대학교 $department",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = "GDSC: $part",
                fontSize = 10.sp,
                color = Color(0xFF007B31),
                fontWeight = FontWeight.Medium
            )
        }
        Image(
            painter = painterResource(id = R.drawable.ic_konkuk),
            contentDescription = "Konkuk",
            modifier = Modifier.size(52.dp)
        )
    }
}

@DevicePreview
@Composable
private fun BannerDevicePreview() {
    ComposeCodelabKonkukUniversityTheme {
        Banner("컴퓨터공학부", "Android")
    }
}
