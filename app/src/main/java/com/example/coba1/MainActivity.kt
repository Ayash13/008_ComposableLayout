package com.example.coba1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coba1.ui.theme.Coba1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Coba1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    TampilText(
                        text1 = getString(R.string.greetings),
                        text2 = getString(R.string.nama)
                    )
                }
            }
        }
    }
}

@Composable
fun TampilText(text1: String, text2: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(
            text = text1,
            color = Color.Black,
            fontSize = 60.sp,
            lineHeight = 110.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(10.dp)
        )
        Text(
            text = text2,
            color = Color.Black,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(10.dp)
        )
    }
}

@Composable
fun Tampilan(text1: String, text2: String) {
    val image = painterResource(R.drawable.bg)
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier.fillMaxSize()
        )
        TampilText(
            text1 = text1,
            text2 = text2,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Coba1Theme {
        Tampilan(
            text1 = "Coba1",
            text2 = "Coba2"
        )
    }
}