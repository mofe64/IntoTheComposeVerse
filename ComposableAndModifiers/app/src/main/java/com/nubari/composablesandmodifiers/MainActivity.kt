package com.nubari.composablesandmodifiers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nubari.composablesandmodifiers.ui.Login
import com.nubari.composablesandmodifiers.ui.Welcome
import com.nubari.composablesandmodifiers.ui.theme.ComposablesAndModifiersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposablesAndModifiersTheme {
//               Greeting(name = "Mofe")
//                Welcome()
                Login()

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Row(
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        ) {
            Text(
                text = "Hello $name!",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = "How are you ?",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row(
            modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(100.dp)
        ) {
            Text(text = "I am a nested row")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposablesAndModifiersTheme {
        Greeting("Android")
    }
}