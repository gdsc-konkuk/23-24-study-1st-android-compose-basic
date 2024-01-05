package com.dev.nunu.code.lab.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.dev.nunu.code.lab.ui.theme.ComposeCodelabKonkukUniversityTheme

@Composable
fun Profile(
    url: String,
    name: String,
    email: String
) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(start = 28.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            model = url,
            contentDescription = "프로필 이미지",
            modifier = Modifier.size(80.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(28.dp))
        PersonalInformation(
            name = name,
            email = email
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ProfileDevicePreview() {
    ComposeCodelabKonkukUniversityTheme {
        Profile(
            url = "",
            name = "Nunu",
            email = "adadadadad"
        )
    }
}
