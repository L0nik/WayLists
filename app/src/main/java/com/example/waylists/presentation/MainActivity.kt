package com.example.waylists.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.waylists.ui.theme.WayListsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WayListsTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                ) {
                    MainMenu()
                }
            }
        }
    }
}

@Composable
fun MainMenu() {
    Column(){
        MenuItem("Путевые листы")
        MenuItem("Установить остатки")
        MenuItem("Топливные коэффициенты")
    }
}

@Composable
fun MenuItem(name: String) {
    val context = LocalContext.current
    Button(modifier = Modifier.fillMaxWidth(0.75f)
        .padding(5.dp),
        onClick = {
            val intent = Intent(context, WayListHistoryActivity::class.java)
            context.startActivity(intent)
        },
    ){
        Text(text = "$name",
            fontSize = 17.sp
        )
    }
}