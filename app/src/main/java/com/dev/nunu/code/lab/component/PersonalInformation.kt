package com.dev.nunu.code.lab.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.dev.nunu.code.lab.DevicePreview
import com.dev.nunu.code.lab.ui.theme.ComposeCodelabKonkukUniversityTheme

@Composable
fun PersonalInformation(
    name: String,
    email: String
) {
    Column {
        Text(text = name, fontSize = 20.sp)
        Text(text = email, color = Color(0xFFCBC7C7), fontSize = 15.sp)
    }
}

@Preview(showBackground = true)
@Composable
private fun PersonalInformationPreview() {
    ComposeCodelabKonkukUniversityTheme {
        PersonalInformation(
            name = "Nunu",
            email = "l2hyunwoo@gmail.com"
        )
    }
}

@DevicePreview
@Composable
private fun PersonalInformationDevicePreview() {
    ComposeCodelabKonkukUniversityTheme {
        PersonalInformation(
            name = "Nunu",
            email = "l2hyunwoo@gmail.com"
        )
    }
}
