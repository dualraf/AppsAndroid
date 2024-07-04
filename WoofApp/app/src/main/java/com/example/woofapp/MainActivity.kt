package com.example.woofapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.woofapp.ui.theme.WoofAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WoofAppTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    WoofApp()
                }
            }
        }
    }
}

@Composable
fun WoofApp(modifier: Modifier = Modifier) {

}

@Preview
@Composable
fun WoofPreview() {
    WoofAppTheme(darkTheme=false) {
        WoofApp()
    }
}