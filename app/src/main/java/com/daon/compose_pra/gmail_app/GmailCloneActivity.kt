package com.daon.compose_pra.gmail_app

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.daon.compose_pra.gmail_app.components.*
import com.daon.compose_pra.gmail_app.ui.theme.Compose_PraTheme

class GmailCloneActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_PraTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    GmailApp()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun GmailApp() {

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()
    val openDialog = remember{
        mutableStateOf(false)
    }

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { HomeAppBar(scaffoldState, coroutineScope, openDialog)},
        drawerContent = {
            GmailDrawerMenu(scrollState = scrollState)
        },
        bottomBar = {
            HomeBottomMenu()
        },
        floatingActionButton = {
            GmailFab(scrollState)
        }
        ) {
        MailList(it, scrollState)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    Compose_PraTheme {
        GmailApp()
    }
}