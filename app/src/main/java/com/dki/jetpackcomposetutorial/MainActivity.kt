package com.dki.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dki.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTutorialTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingImage(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(modifier: Modifier = Modifier) {
    Column {
        Text(
            text = stringResource(R.string.jetpack_compose_tutorial_title_text),
            fontSize = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.jetpack_compose_tutorial_intro_text),
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp, 0.dp)
        )
        Text(
            text = stringResource(R.string.jetpack_compose_tutorial_text),
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)
        )
    }
}

@Composable
fun GreetingImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            alignment = Alignment.TopStart,
        )
        GreetingText()
    }
}



@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    JetpackComposeTutorialTheme {
        GreetingImage()
    }
}