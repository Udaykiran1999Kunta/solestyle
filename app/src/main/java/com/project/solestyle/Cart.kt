package com.project.solestyle

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.project.solestyle.ui.theme.FootwearAppTheme

import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign

class AddtoCartActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FootwearAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 640.dp)
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-7).dp,
                    y = (-86).dp)
                .requiredWidth(width = 375.dp)
                .requiredHeight(height = 812.dp)
                .background(color = Color.White)
        ) {

//cart1
            Text(
                text = "£ 186.00",
                color = Color(0xFFA21A30),
                textAlign = TextAlign.End,
                style = TextStyle(
                    fontSize = 30.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 241.dp,
                        y = 671.dp))
            Text(
                text = "£ 6.00",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 20.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 295.dp,
                        y = 621.dp))



            //cart2


            //cart3
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    FootwearAppTheme {
        Greeting2("Android")
    }
}