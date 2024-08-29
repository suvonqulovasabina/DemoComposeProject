package com.example.democomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator
import com.example.democomposeproject.ui.presintation.home.HomeScreen
import com.example.democomposeproject.ui.theme.DemoComposeProjectTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Navigator(screen = HomeScreen()) {
                CurrentScreen()
            }

            HomeScreen()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DemoComposeProjectTheme {
        HomeScreen()
    }
}