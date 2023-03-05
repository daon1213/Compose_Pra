package com.daon.compose_pra.lottie_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.*
import com.daon.compose_pra.lottie_app.ui.theme.Compose_PraTheme

class lottie_animation_app : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_PraTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.TopCenter
                    ) {
                        Loader()
                    }
                }
            }
        }
    }
}

@Composable
fun Loader() {

    // 로띠 제이슨 파일 가져오기
    val composition by rememberLottieComposition(LottieCompositionSpec.Asset("cr.json"))

    var isAnimationPlaying by remember { mutableStateOf(true) }

//    composition: LottieComposition?,
//    isPlaying: Boolean = true,
//    restartOnPlay: Boolean = true,
//    clipSpec: LottieClipSpec? = null,
//    speed: Float = 1f,
//    iterations: Int = 1,
//    cancellationBehavior: LottieCancellationBehavior = LottieCancellationBehavior.Immediately,
//    ignoreSystemAnimatorScale: Boolean = false,

    // 로띠 애니메이션 설정
    val progress by animateLottieCompositionAsState(
        composition,
        iterations = LottieConstants.IterateForever,
        clipSpec = LottieClipSpec.Progress(0f, 0.6f),
        isPlaying = isAnimationPlaying
    )

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        // 로띠 애니메이션 뷰
        LottieAnimation(
            composition,
            progress,
            modifier = Modifier
                .size(300.dp)
//                .background(Color.Yellow)
        )

//        Text("progress : $progress")
//
//        Button(onClick = {
//            isAnimationPlaying = !isAnimationPlaying
//        }) {
//            Text(text = "로띠 재생/일시정지")
//        }
    }
}


@Composable
fun Greeting2(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    Compose_PraTheme {
        Greeting2("Android")
    }
}