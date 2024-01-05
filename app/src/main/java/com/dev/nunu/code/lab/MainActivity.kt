package com.dev.nunu.code.lab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dev.nunu.code.lab.screen.MyPageScreen
import com.dev.nunu.code.lab.ui.theme.ComposeCodelabKonkukUniversityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCodelabKonkukUniversityTheme {
                MyPageScreen()
            }
        }
    }
}

// xml view를 추가할 때 사용한 것
// <TextView> </TextView>와 같은 것
// @Composable
// <TextView> </TextView>와 같은 것
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeCodelabKonkukUniversityTheme {
        Greeting("Android")
    }
}