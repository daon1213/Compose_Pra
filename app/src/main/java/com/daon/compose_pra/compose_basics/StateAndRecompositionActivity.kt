package com.daon.compose_pra.compose_basics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.daon.compose_pra.compose_basics.ui.theme.Compose_PraTheme

class StateAndRecompositionActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_PraTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    var nameState by remember {
        mutableStateOf("")
    }

    var name by rememberSaveable {
        mutableStateOf("")
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center) {
        Text(text = "Hello $name", fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(20.dp))
        TextField(value = nameState, onValueChange = {
            nameState = it
        })
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            name = nameState
        }, colors = ButtonDefaults.buttonColors(Color.Gray)) {
            Text(text = "Display", color = Color.White, fontWeight = FontWeight.Bold)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    Compose_PraTheme {
        Greeting("Android")
    }
}