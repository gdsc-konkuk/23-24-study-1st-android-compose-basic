package com.dev.nunu.code.lab.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.dev.nunu.code.lab.DevicePreview
import com.dev.nunu.code.lab.R
import com.dev.nunu.code.lab.ui.theme.ComposeCodelabKonkukUniversityTheme

@Composable
fun MyPageToolbar(
    title: String,
    onItemClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Image(
            painter = painterResource(id = R.drawable.ic_cart),
            contentDescription = "장바구니",
            modifier = Modifier.clickable { onItemClick() }
        )
    }
}

@DevicePreview
@Composable
private fun MyPageToolbarDevicePreview() {
    ComposeCodelabKonkukUniversityTheme {
        MyPageToolbar(title = "마이페이지", onItemClick = { })
    }
}
