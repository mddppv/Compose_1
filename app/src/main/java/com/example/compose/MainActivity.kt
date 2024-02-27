package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OnCreate()
        }
    }
}

@Preview(
    showBackground = true, showSystemUi = true
)

@Composable
fun OnCreate() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .clip(RoundedCornerShape(4))
            .background(Color.Blue)
    ) {
        Column(
            Modifier.fillMaxSize(), Arrangement.Center
        ) {
            Row(Modifier.fillMaxWidth(), Arrangement.SpaceEvenly) {
                Image(
                    modifier = Modifier.size(width = 64.dp, height = 128.dp),
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "Settings"
                )
                Image(
                    modifier = Modifier.size(width = 128.dp, height = 128.dp),
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "Logo"
                )
                Image(
                    modifier = Modifier.size(width = 64.dp, height = 128.dp),
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "Notifications"
                )
            }
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp), contentAlignment = Alignment.Center
            ) {
                Text(text = "13 февраля 2024 14:00", color = Color.Gray)
            }
            Row(Modifier.fillMaxWidth(), Arrangement.SpaceEvenly) {
                Column(Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "Продажа", color = Color.Gray
                    )
                    CountText(count = "0.0")
                    CountText(count = "0.0")
                    CountText(count = "0.0")
                    CountText(count = "0.0")
                    CountText(count = "0.0")
                    CountText(count = "0.0")
                    CountText(count = "0.0")
                }
                Column(Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "")
                    ValueText(value = "USD")
                    ValueText(value = "EUR")
                    ValueText(value = "RUB")
                    ValueText(value = "KGS")
                    ValueText(value = "GBP")
                    ValueText(value = "CNY")
                    Text(
                        text = "GOLD",
                        modifier = Modifier
                            .padding(top = 16.dp)
                            .size(width = 96.dp, height = 48.dp)
                            .wrapContentSize(align = Alignment.Center),
                        color = Color.Gold,
                        textAlign = TextAlign.Center
                    )
                }
                Column(Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "Продажа", color = Color.Gray
                    )
                    CountText(count = "0.0")
                    CountText(count = "0.0")
                    CountText(count = "0.0")
                    CountText(count = "0.0")
                    CountText(count = "0.0")
                    CountText(count = "0.0")
                    CountText(count = "0.0")
                }
            }
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp), contentAlignment = Alignment.Center
            ) {
                Text(text = "Смотреть больше", color = Color.Gray)
            }
        }
    }
}

@Composable
fun CountText(count: String) {
    Text(
        text = count,
        modifier = Modifier
            .padding(top = 16.dp)
            .size(width = 96.dp, height = 48.dp)
            .clip(RoundedCornerShape(24))
            .background(Color.White)
            .wrapContentSize(align = Alignment.Center),
        color = Color.Blue,
        textAlign = TextAlign.Center
    )
}

@Composable
fun ValueText(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .padding(top = 16.dp)
            .size(width = 96.dp, height = 48.dp)
            .wrapContentSize(align = Alignment.Center),
        color = Color.White,
        textAlign = TextAlign.Center
    )
}